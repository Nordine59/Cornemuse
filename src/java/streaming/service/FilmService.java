/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {

    public List<Film> lister() {
        return new FilmDAO().listerFilms();
    }

    public Film rechercheParId(long id) {

        return new FilmDAO().rechercheParId(id);

    }

    public void  modifierFilm(Film f) {

         new FilmDAO().modifierFilm(f);

    }

    public void ajouterFilm(Film f) {

        new FilmDAO().ajouterFilm(f);

    }

}
