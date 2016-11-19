package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class DisponibilidadDao {
    @Autowired
    private SessionFactory _sessionFactory;

    private Session getSession() {
        return _sessionFactory.getCurrentSession();
    }

    public void save(Disponibilidad disponibilidad) {
        getSession().save(disponibilidad);
        return;
    }
    public void  detele (Disponibilidad disponibilidad){
        getSession().delete(disponibilidad);
        return;
    }
}
