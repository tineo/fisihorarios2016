package com.horarios.controller;

import com.horarios.model.Asignatura;
import com.horarios.model.AsignaturaDao;
import com.horarios.model.Aula;
import com.horarios.model.AulaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@Controller
@RequestMapping(value = "/asignatura")
public class AsignaturaController {

    @Autowired
    private AsignaturaDao _asignaturaDao;

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(){
        try {
            Asignatura asignatura = new Asignatura();
            asignatura.setIdasignatura(1);
            _asignaturaDao.detele(asignatura);
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
            Asignatura asignatura =new Asignatura();
            asignatura.setCodigo("A102");
            asignatura.setNombre("Calculo1");
            asignatura.setHoras(5);
            asignatura.setCiclo("primero");
            asignatura.setPlan("2015");
            asignatura.setCreditos("cuatro");
            asignatura.setEstado(1);
            asignatura.setHoraspractica(2);
            asignatura.setHorasteoria(3);
            asignatura.setHoraslaboratorio(0);
            _asignaturaDao.save(asignatura);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }
}
