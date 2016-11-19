package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
/**
 * Created by Debra on 17/11/2016.
 */
@Repository
@Transactional
public class DocenteDao {


    @Autowired
    private SessionFactory _sessionFactory;

    private Session getSession() {
        return _sessionFactory.getCurrentSession();
    }

    public void save(Docente docente) {
        getSession().save(docente);
        return;
    }

    public void detele(Docente docente) {
        //getSession().delete(docente);
        getSession().delete(getSession().get(Docente.class, docente.getId()));
        return;
    }

  public Docente getById(int id) {
        Docente d =new Docente();

               d= (Docente) getSession().load(Docente.class, id);

       // return (Docente) getSession().load(Docente.class, id);
       return d;
    }

    /*  public Docente getByEmail(int id) {

         return (Docente) getSession().createQuery(
                 "from Docente d  where d.iddocente = :iddocente")
                 .setParameter("iddocente", id)
                 .uniqueResult();
     }
   public Docente getById(int iddocente) {
       Session session = null;
       Docente docente = null;
       try {

           docente = (Docente)session.load(Docente.class, iddocente);
           Hibernate.initialize(docente);
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           if (session != null && session.isOpen()) {
               session.close();
           }
       }
       return docente;
   }*/
}
