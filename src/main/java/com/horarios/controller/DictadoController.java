package com.horarios.controller;
import com.horarios.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/dictado")
public class DictadoController {

    @Autowired
    private DictadoDao _DictadoDao ;
    @Autowired
    private DocenteDao _DocenteDao;
    @Autowired
    private AsignaturaDao _AsignaturaDao;


    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(){
        try {
            Dictado dictado = new Dictado();
            dictado.setIdDictado(1);
            _DictadoDao.delete(dictado);
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

            Docente docente= new Docente();
            docente =_DocenteDao.getById(1);

            Asignatura asignatura =new Asignatura();
            asignatura = _AsignaturaDao.getById(1);

            Dictado dictado= new Dictado();
            dictado.setIddocente(docente);
            dictado.setIdasignatura(asignatura);






        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }

}


