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
@RequestMapping(value = "/docente")
public class DocenteController {

    @Autowired
    private DocenteDao _docenteDao;
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(){
        try {
            Docente docente = new Docente();
            docente.setId(2);
            _docenteDao.detele(docente);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "ya botamos al profe papu!";
    }
    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(){
        try{
            Docente docente = new Docente();

            docente.setApellidos("Tineo");
            docente.setCorreo("tineo@live.jp");
            docente.setLimfisica("Si");
            docente.setTelefono("996666567");
            docente.setNombres("Cesar");

            _docenteDao.save(docente);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado el profe papa :v ";
    }
}
