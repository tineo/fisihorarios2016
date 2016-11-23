package com.horarios.controller;


import com.horarios.model.Asignatura;
import com.horarios.model.AsignaturaDao;
import com.horarios.model.Carga;
import com.horarios.model.CargaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/carga")
public class CargaController {
    @Autowired
    private CargaDao _CargaDao;
    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(){
        try{
            Carga carga =new Carga();

            _CargaDao.save(carga);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }
}
