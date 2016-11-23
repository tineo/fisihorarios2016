package com.horarios.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CargaDao {
    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession() {
        return _SessionFactory.getCurrentSession();
    }
/*
    public void save(Carga carga) {
        getSession().save(carga);
        return;
    }

    public void detele(Carga carga) {
        getSession().delete(carga);
        return;

    }*/
    public Carga getByIdAsig(int idasignatura) {
        Carga c = (Carga) getSession().createQuery(
                "from  Carga where idasignatura = : idasignatura")
                .setParameter("idasignatura", idasignatura)
                .uniqueResult();
        return c;
    }
/*
    public List<Carga> getListaCarga() {
        List<Carga> listaCargas = null;

        try {
            listaCargas = getSession().createQuery("from Carga").list();
        } finally {
            getSession().close();
        }

        return listaCargas;

    }*/
}