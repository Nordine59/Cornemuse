/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {

    public List<Film> lister() {
        return new FilmDAO().lister();
    }

    public Film rechercheParId(long id) {

        return new FilmDAO().rechercheParId(id);

    }

    public void  modifierFilm(Film f) {

         new FilmDAO().modifier(f);

    }

    public void ajouterFilm(Film f) {

        new FilmDAO().ajouter(f);

    }
public void supprimerFilm(long id){
    
    new FilmDAO().supprimer(id);
}
    
    public void ajouter (List<Film>films){
        
        FilmDAO dao = new FilmDAO();
        
        for(Film f : films){
         
        if (f.getTitre().length()>0){    
        dao.ajouter(f);
            
        }
    }


    
}
}