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
    public List<Aula> getAula() {
        List<Aula> listaAulas = null;

        try {
            listaAulas = getSession().createQuery("from Aula").list();
        }finally {
            getSession().close();
        }

        return listaAulas;

       /* return (List<Aula>) getSession().createQuery(
                "from Aula a  where a.nroaula = :nroaula")
                .setParameter("nroaula", nroaula);
         .uniqueResult();
*/
    }

       public Aula getAulaByNroaula(String nroaula) {

        return (Aula) getSession().createQuery(
                "from Aula a  where a.nroaula = :nroaula")
                .setParameter("nroaula", nroaula)
                     .uniqueResult();

    }


}