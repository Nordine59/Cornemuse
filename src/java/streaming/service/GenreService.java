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

        return new GenreDao().listerGenre();

    }

    public Genre rechercheParId(long id) {

        return new GenreDao().rechercheParId(id);

    }
}
