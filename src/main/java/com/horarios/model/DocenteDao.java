package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

}
