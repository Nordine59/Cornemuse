/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    
    
    public List<Serie> lister(){
        return new SerieDAO().listerSerie();
    }
    
    public Serie rechercheParId(long id) {

        return new SerieDAO().rechercheParId(id);

    }

    public void  modifierSerie(Serie s) {

         new SerieDAO().modifierSerie(s);

    }

    public void ajouterSerie(Serie s) {

        new SerieDAO().ajouterSerie(s);

    }
}
