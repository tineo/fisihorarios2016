package com.horarios.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CursoDao {


    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession(){return  _SessionFactory.getCurrentSession();}

    public void save(Curso curso){
        getSession().save(curso);
        return;
    }

    public void  delete (Curso curso ){
        getSession().delete(curso);
        return;

    }

    public List<Curso> getCursoByCicloAndPlan(String ciclo, String plan){
        return (List<Curso>) getSession().createQuery(
                "from Curso a where a.ciclo= :ciclo and a.plan =:plan")
                .setParameter("ciclo", ciclo)
                .setParameter("plan", plan).list();
    }

}