package com.horarios.controller;

import com.horarios.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioDao _usuarioDao;

    @Autowired
    private DisponibilidadDao _disponibilidadDao;

    @Autowired
    private DocenteDao _docenteDao;

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(){
        try {
            Usuario usuario = new Usuario();
            usuario.setId(1);
            _usuarioDao.detele(usuario);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "ya lo botamos papu!";
    }
   /* @RequestMapping(value = "/update")
    @ResponseBody
    public  String update(){
        try{
            Usuario usuario =new Usuario();
            usuario.setNombre("yona");
            usuario.setApepaterno("k");
            usuario.setApematerno("e");
            usuario.setUsername("unicornio");
            usuario.setPassword("digimon");
            usuario.setEstado(1);
            usuario.setEmail("abcggmal");
            usuario.setTelefono("numero");
            //_usuarioDao.update(usuario);


        }
        catch (Exception e){
            return e.getMessage();
        }
        return "cambiado beibi";
    }*/
    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(){
        try{
            Usuario usuario =new Usuario();
            usuario.setNombre("Debra");
            usuario.setApepaterno("chacaliaza");
            usuario.setApematerno("llamosa");
            usuario.setUsername("moon");
            usuario.setPassword("digimon");
            usuario.setEstado(1);
            usuario.setEmail("abcggmal");
            usuario.setTelefono("numero");
            _usuarioDao.save(usuario);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public  String test(){
        try{
            Usuario usuario = _usuarioDao.getById(4);
            String nombre =usuario.getNombre();


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "ya" ;
    }

    @RequestMapping(value = "/eliminar")
    @ResponseBody
    public  String eliminar(){
        try{
            Docente docente = new Docente();

            docente.setId(1);

            _docenteDao.detele(docente);



        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }
    @RequestMapping(value = "/update")
    @ResponseBody
    public  String update(){
        try{
            Usuario usuario = _usuarioDao.getById(5);

            usuario.setNombre("jisoo");
            usuario.setApepaterno("kim");
            usuario.setApematerno("sasa");
            usuario.setPassword("147852369");
            _usuarioDao.update(usuario);
        }
        catch (Exception e){
            return e.getMessage();

        }
        return "cambiado papa :v ";
    }

 /*  @RequestMapping(value = "/update")
    @ResponseBody
    public  String update(){
        try{
            Usuario usuario =new Usuario();
            usuario.setNombre("yona");
            usuario.setApepaterno("lalo");
            usuario.setApematerno("llamosa");
            usuario.setUsername("dodo");
            usuario.setPassword("frontier");
            usuario.setEstado(1);
            usuario.setEmail("abcggmal");
            usuario.setTelefono("cel");
            _usuarioDao.update(usuario);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }*/


}
