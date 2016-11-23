package com.horarios.controller;
import com.horarios.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String delete(@RequestParam(value="iddictado", defaultValue = "1") String iddictado){
        try {
            Dictado dictado = new Dictado();
            dictado.setIdDictado(Integer.parseInt(iddictado));
            _DictadoDao.delete(dictado);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "Dictado Suprimido";
    }

   @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(@RequestParam(value="iddocente", defaultValue = "1") String iddocente,
                          @RequestParam(value="idasignatura", defaultValue = "1") String idasignatura){
       try{

            Docente docente= new Docente();
            docente =_DocenteDao.getById(Integer.parseInt(iddocente));

            Asignatura asignatura =new Asignatura();
            asignatura = _AsignaturaDao.getByCodigo((idasignatura));

            Dictado dictado= new Dictado();
            dictado.setIddocente(docente);
            dictado.setIdasignatura(asignatura);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "Guardado";
    }

}


