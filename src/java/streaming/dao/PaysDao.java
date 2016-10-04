/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class PaysDao {
    
    
    
    //public Pays chercher (String nom){
       // EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       // return (Pays) em.createQuery("SELECT p FROM Pays p WHERE p.nom" + nom +)
        
    

    public void modifier(Pays p) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();

    }

    public void supprimer(long id) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE  FROM Pays p WHERE p.id" + id);
        em.getTransaction().begin();

    }

    public void ajouter(Pays p) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

    }

    public Pays rechercheParId(long id) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.find(Pays.class, id);

    }

    public List<Pays> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT p FROM Pays p ORDER BY p.id DESC").getResultList();

    }

}
