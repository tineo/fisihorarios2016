package com.horarios.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CargaDao {
    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession(){return  _SessionFactory.getCurrentSession();}

    public void save(Carga carga){
        getSession().save(carga);
        return;
    }

    public void  detele (Carga carga ){
        getSession().delete(carga);
        return;

    }

}