package com.horarios.model;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        return (Usuario) getSession().load(Usuario.class, id);
    }


  /*  public  Usuario getByName (String nombres){
        return (Usuario) getSession().createQuery(
                "from Usuario where nombres = :nombres")
                .setParameter("nombres", nombres)
                .uniqueResult();
    }
*/
  public void  update(Usuario usuario) {

     /* getSession().beginTransaction();
      getSession().update(usuario);
      getSession().getTransaction().commit();
      getSession().close();
*/

   //   getSession().getTransaction().begin();

 //     getSession().getTransaction().commit();


      try {
          final Transaction transaction = getSession().beginTransaction();
          try {
              // The real work is here  :V :,v :v :v.....
              SQLQuery query = getSession().createSQLQuery("update usuario  set nombres = :nombres" + " where idusuario = :idusuario");
              query.setParameter("nombres", "Jack");
              query.setParameter("idusuario", usuario.getId());
              int result = query.executeUpdate();
              transaction.commit();
          } catch (Exception ex) {
              // Log the exception here :v
              transaction.rollback();
              throw ex;
          }
      } finally {
          getSession().close();
      }
  }
}
