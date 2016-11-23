package com.horarios.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AsignaturaDao {
    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession() {
        return _SessionFactory.getCurrentSession();
    }

    public void save(Asignatura asignatura) {
        getSession().save(asignatura);
        return;
    }

    public void detele(Asignatura asignatura) {
        getSession().delete(getSession().get(Asignatura.class, asignatura.getIdasignatura()));
        return;

    }

    public Asignatura getById(int id) {
        Asignatura a = (Asignatura) getSession().createQuery(
                "from Asignatura where idasignatura = :idasignatura"
        ).setParameter("idasignatura",id).uniqueResult();
                return a;
    }
    public List<Asignatura> getAsignaturas(String coinsidencia) {

        return (List<Asignatura>) getSession().createQuery(
                "from Asignatura a  where a.nombre like :coinsidencia")
                .setParameter("coinsidencia","%"+  coinsidencia+"%").list();
        // .uniqueResult();

    }
    public  List<Asignatura> getAsignaturasByCicloAndPlan(String ciclo, String plan){
        return (List<Asignatura>) getSession().createQuery(
                "from Asignatura a where a.ciclo= :ciclo and a.plan =:plan")
                .setParameter("ciclo", ciclo)
                .setParameter("plan", plan).list();
    }

}
