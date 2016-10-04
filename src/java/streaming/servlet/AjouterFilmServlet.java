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
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_films"})
public class AjouterFilmServlet extends HttpServlet {
    
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        req.setAttribute("listeGenre", new GenreService().lister());
        
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
        
        
        //Forward vers liste
        
        
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       Film f = new Film();
        
       f.setTitre(req.getParameter("titre"));
       f.setSynopsis(req.getParameter("synopsis"));
       f.setAnnee(Integer.valueOf(req.getParameter("annee")));//convertit la string de l ecran en INTEGER
       f.setDuree(Integer.valueOf(req.getParameter("duree")));// convertit le string de l ecran en INTEGER
       
       //METHODE DE BEAU GOSSE voie après le CACA
       f.setGenre(new GenreService().rechercheParId(Long.valueOf(req.getParameter("GenreId"))));
       
       
       //METHODE MOYEN
       
       //METHODE CACA
       //f.setGenre(new genre());
       //f.getGenre().setId(long.valueOf(req.getParameter("genreId"));
       //f.getGenre().getFilms().add(f);
       
       new FilmService().ajouterFilm(f);
       //forward vers servlet listage films et renvoie l ecran ou on liste ici
       resp.sendRedirect("lister_films");//fait une requete get sur la route indiquée
       
       
         
       
    }

    
   

   
    
    
    

}
