/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.PaysDao;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class PaysService {

    public void modifier(Pays p) {

        new PaysDao().modifier(p);

    }

    public void ajouter(Pays p) {

        new PaysDao().ajouter(p);
    }

    public void supprimer(long id) {

        new PaysDao().supprimer(id);
    }

    public Pays rechercheParId(long id) {

        return new PaysDao().rechercheParId(id);

    }

    public List<Pays> lister() {

        return new PaysDao().lister();

    }

}
