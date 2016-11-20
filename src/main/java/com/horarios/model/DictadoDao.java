package com.horarios.model;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DictadoDao {
    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession(){return  _SessionFactory.getCurrentSession();}

    public void save(Dictado dictado){
        getSession().save(dictado);
        return;
    }

    public void  delete (Dictado dictado){
        getSession().delete(dictado);
        return;

    }

}
