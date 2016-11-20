package com.horarios.model;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UsuarioDao {

    @Autowired
    private SessionFactory _SessionFactory;

    private Session getSession(){return  _SessionFactory.getCurrentSession();}

    public void save(Usuario usuario){
        getSession().save(usuario);
        return;
    }

    public void  detele (Usuario usuario){
        getSession().delete(usuario);
        return;
    }
   @SuppressWarnings("unchecked")
    public List<Usuario> getAll() {
        return getSession().createQuery("from Usuario").list();
    }

    public Usuario findByUsername(String username) {
        return (Usuario) getSession().createQuery(
                "from Usuario where username = :username")
                .setParameter("username", username)
                .uniqueResult();

    }
   /* public  Usuario getByName (String nombres){
        return (Usuario) getSession().createQuery(
                "from Usuario where nombres = :nombres")
                .setParameter("nombres", nombres)
                .uniqueResult();
    }
*/
}
