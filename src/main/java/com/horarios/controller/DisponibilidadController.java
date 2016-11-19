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
@RequestMapping(value = "/disponibilidad")
public class DisponibilidadController {

    @Autowired
    private DisponibilidadDao _DisponibilidadDao;

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(){
        try {
            Disponibilidad disponibilidad = new Disponibilidad();
            disponibilidad.setIddisponibilidad(5);
            _DisponibilidadDao.detele(disponibilidad);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "ya lo botamos papu!";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(){
        try{
            DocenteDao docenteDao =new DocenteDao();
            Docente docente= new Docente();
            docente=null;
            docente =docenteDao.getById(4);



            Disponibilidad disponibilidad = new Disponibilidad();
            disponibilidad.setIddocente(docente);
            disponibilidad.setCiclo("2016-2");
            disponibilidad.setHorafinal("final");
            disponibilidad.setHorainicio("inicio");
            disponibilidad.setDia("martes");
            _DisponibilidadDao.save(disponibilidad);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }

}
