package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class AulaDao {
    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession() {
        return _SessionFactory.getCurrentSession();
    }

    public void save(Aula aula) {
        getSession().save(aula);
        return;
    }

    public void detele(Aula aula) {
        getSession().delete(getSession().get(Aula.class, aula.getIdaula()));
        return;
    }

    public Aula getById(int id) {
        Aula a = new Aula();

        a = (Aula) getSession().load(Aula.class, id);


        return a;

    }
}