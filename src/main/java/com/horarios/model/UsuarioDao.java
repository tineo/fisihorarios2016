package com.horarios.model;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.*;
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

    @SuppressWarnings("unchecked")
    public Usuario findByUsername(String username) {
        return (Usuario) getSession().createQuery(
                "from Usuario where username = :username")
                .setParameter("username", username)
                .uniqueResult();

    }
    public Usuario getById(int id) {
        Usuario usuario = (Usuario)getSession().createQuery(
                "from Usuario where idusuario = :idusuario")
                .setParameter("idusuario", id)
                .uniqueResult();
        //return (Usuario) getSession().load(Usuario.class, id);
        return usuario;
    }


  /*  public  Usuario getByName (String nombres){
        return (Usuario) getSession().createQuery(
                "from Usuario where nombres = :nombres")
                .setParameter("nombres", nombres)
                .uniqueResult();
    }
*/
  public void  update(Usuario usuario) {


      try {
           getSession().update(usuario);

      } catch (HibernateException he){
          throw he;

      }
  }
}
