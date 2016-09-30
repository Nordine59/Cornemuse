/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterSerieServlet", urlPatterns = {"/ajouter_series"})
public class AjouterSerieServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        req.getRequestDispatcher("ajouter_serie.jsp").forward(req, resp);
        
        
    }
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       Serie s = new Serie();
        
       s.setTitre(req.getParameter("titre"));
       s.setSynopsis(req.getParameter("synopsis"));
       //s.setAnnee(Integer.valueOf(req.getParameter("annee")));//convertit la string de l ecran en INTEGER
       //s.setDuree(Integer.valueOf(req.getParameter("duree")));//convertit le string de l ecran en INTEGER
       
       new SerieService().ajouterSerie(s);
       
       //forward vers servlet listage films et renvoie l ecran ou on liste ici
       resp.sendRedirect("lister_serie");//fait une requete get sur la route indiquée
       
    }

    
}
