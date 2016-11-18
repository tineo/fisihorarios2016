package com.horarios.controller;

import com.horarios.model.User;
import com.horarios.model.UserDao;

import com.horarios.model.Usuario;
import com.horarios.model.UsuarioDao;
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
    @RequestMapping(value = "/update")
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
            _usuarioDao.update(usuario);


        }
        catch (Exception e){
            return e.getMessage();
        }
        return "cambiado beibi";
    }
    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(){
        try{
            Usuario usuario =new Usuario();
            usuario.setNombre("Debra");
            usuario.setApepaterno("chacaliaza");
            usuario.setApematerno("llamosa");
            usuario.setUsername("unicornio");
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


}
