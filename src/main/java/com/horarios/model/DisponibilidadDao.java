package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


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

   public void saveList(List<Disponibilidad> lista_dispo){
       for(Disponibilidad disponibilidad : lista_dispo) {
           getSession().save(lista_dispo);
       }
       return;
   }

}
