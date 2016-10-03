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
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ModifierFilmServlet", urlPatterns = {"/modifier_film"})
public class ModifierFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //recupere le film en fonction de l id
        Film film = new FilmService().rechercheParId(Long.valueOf(req.getParameter("id")));

        //setter attribut monFilm vers la jsp
        req.setAttribute("film", film);
        //forward vers la jsp
        req.getRequestDispatcher("modifier_film.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Film f = new FilmService().rechercheParId(Long.valueOf(req.getParameter("id")));
        
       f.setTitre(req.getParameter("titre"));
       f.setSynopsis(req.getParameter("synopsis"));
       f.setAnnee(Integer.valueOf(req.getParameter("annee")));//convertit la string de l ecran en INTEGER
       f.setDuree(Integer.valueOf(req.getParameter("duree")));// convertit le string de l ecran en INTEGER
       
       
       new FilmService().modifierFilm(f);
       //forward vers servlet listage films et renvoie l ecran ou on liste ici
       resp.sendRedirect("lister_films");//fait une requete get sur la route indiquée
       
       
         //req.getRequestDispatcher("lister_films").forward(req, resp);
            //car deja redirect au dessus
       
        
        
        
    }
    
}
