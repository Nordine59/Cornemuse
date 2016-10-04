/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service.test;

import java.util.List;
import org.junit.Test;
import streaming.entity.Film;
import streaming.service.FilmService;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class FilmServiceTest {

    @Test
    public void ajoutFilm() {

        List<Film> films = new FilmService().lister();
        long nbrFilms = films.size();

        //Version combo : long nbrFilms = new FilmService().lister().size();
        //AJOUTER FILM de test
        Film film1 = new Film();
        film1.setId(25L);
        film1.setTitre("Commando");
        new FilmService().ajouterFilm(film1);

        assertEquals(nbrFilms + 1, new FilmService().lister().size());

        //Modification du titre + verif
        film1.setTitre("Commando2");
        new FilmService().modifierFilm(film1);
        //titre à verifier
        assertEquals("Commando2", new FilmService().rechercheParId(25L).getTitre());

        //Suppression film
        new FilmService().supprimerFilm(25L);

        //RETOUR ETAT INITIAL
       assertEquals(nbrFilms, new FilmService().lister().size());

    }

}
