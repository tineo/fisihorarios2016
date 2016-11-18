package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class AsignaturaDao {
    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession(){return  _SessionFactory.getCurrentSession();}

    public void save(Asignatura asignatura){
        getSession().save(asignatura);
        return;
    }

    public void  detele (Asignatura asignatura){
        getSession().delete(asignatura);
        return;

    }

}
