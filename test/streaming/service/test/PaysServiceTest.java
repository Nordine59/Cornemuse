/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service.test;

import javax.persistence.Entity;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class PaysServiceTest {

    @Before
    public void SetUp() {

        //Vider les tables
        
        
        
        
        
        //Remplir pays
        
        
        
    }

    @Test
    public void rechercheOK() {

        Pays p = new PaysService().rechercheParId(2L);

        Assert.assertEquals("France", p.getNom());

    }

    @Test
    public void ajouterOk() {

        Pays p = new Pays();

        p.setNom(("Bulgarie"));
        new PaysService().ajouter(p);
    }

    @Test(expected = Exception.class)
    public void ajouterKo() {

        Pays p = new Pays();
        new PaysService().ajouter(p);
    }

    public void modifier() {

        Pays p = new Pays();
        p.setId(1L);
        p.setNom("United kingdom");
        new PaysService().modifier(p);

    }

}
