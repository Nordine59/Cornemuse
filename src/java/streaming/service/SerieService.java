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
        return new SerieDAO().lister();
    }
    
    public Serie rechercheParId(long id) {

        return new SerieDAO().rechercheParId(id);

    }

    public void  modifierSerie(Serie s) {

         new SerieDAO().modifier(s);

    }

    public void ajouterSerie(Serie s) {

        new SerieDAO().ajouter(s);

    }
    
    public void supprimerSerie(long id){
    
    new SerieDAO().supprimer(id);
    
}
}