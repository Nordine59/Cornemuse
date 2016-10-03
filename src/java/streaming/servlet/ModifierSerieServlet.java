/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Serie;
import streaming.service.FilmService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ModifierSerieServlet", urlPatterns = {"/modifier_serie"})
public class ModifierSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
      
        //recupere la serie en fonction de l id
       Serie serie =  new SerieService().rechercheParId(Long.valueOf(req.getParameter("id"))); 
       
       req.setAttribute("serie", serie);
       
       req.getRequestDispatcher("modifier_serie.jsp").forward(req, resp);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        Serie s = new SerieService().rechercheParId(Long.valueOf(req.getParameter("id")));
        
       s.setTitre(req.getParameter("titre"));
       s.setSynopsis(req.getParameter("synopsis"));
       //s.setAnnee(Integer.valueOf(req.getParameter("annee")));//convertit la string de l ecran en INTEGER
       //s.setDuree(Integer.valueOf(req.getParameter("duree")));//convertit le string de l ecran en INTEGER
       
       new SerieService().modifierSerie(s);
       
       //forward vers servlet listage films et renvoie l ecran ou on liste ici
       resp.sendRedirect("lister_serie");//fait une requete get sur la route indiquée
        
        
        
        
    }

    
}
