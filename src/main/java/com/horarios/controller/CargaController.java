package com.horarios.controller;


import com.horarios.model.Asignatura;
import com.horarios.model.AsignaturaDao;
import com.horarios.model.Carga;
import com.horarios.model.CargaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/carga")
public class CargaController {
    @Autowired
    private CargaDao _CargaDao;

    @RequestMapping(value = "/getcarga")
    @ResponseBody
    public Carga getaula(@RequestParam(value="idasig", defaultValue = "101") int idasig ){
        Carga carga =  null;
        try {
            carga = _CargaDao.getByIdAsig(idasig);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return carga;
    }
}
