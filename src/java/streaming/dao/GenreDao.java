/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreDao {

    public List<Genre> lister() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT g FROM Genre g ORDER BY g.id ").getResultList();

    }

    public Genre rechercheParId(long id) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.find(Genre.class, id);

    }
    
    public void supprimer(long id){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE g FROM Genre g WHERE g.id" + id).executeUpdate();
        em.getTransaction().commit();
        
    }
    
    
    public void  ajouter (Genre g){
        
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
        
    }

    public void modifier (Genre g){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();
                
        
        
        
    }
    
    
    
}
