/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.dao.GenreDao;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {

    public List<Genre> lister() {

        return new GenreDao().lister();

    }

    public Genre rechercheParId(long id) {

        return new GenreDao().rechercheParId(id);

    }
    
    public void supprimerGenre (long id){
        
        new GenreDao().supprimer(id);
        
    }
    
    public void ajouterGenre (Genre g){
        
         new GenreDao().ajouter(g);
    }
    
    public void modifierGenre (Genre g){
        
        new GenreDao().modifier(g);
    }
    
    
}
