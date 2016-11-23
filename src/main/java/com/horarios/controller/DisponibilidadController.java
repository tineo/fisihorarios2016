package com.horarios.controller;

import com.horarios.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Controller
@RequestMapping(value = "/disponibilidad")
public class DisponibilidadController {

    @Autowired
    private DisponibilidadDao _DisponibilidadDao;
    @Autowired
    private DocenteDao _DocenteDao;

    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(@RequestParam(value="iddocente", defaultValue = "1") String iddocente,
                          @RequestParam(value="ciclo", defaultValue = "1") String ciclo,
                          @RequestParam(value="horainicial", defaultValue = "1") String horainicial,
                          @RequestParam(value="horafinal", defaultValue = "1") String horafinal,
                          @RequestParam(value="dia", defaultValue = "1") String dia){
        try{
            Docente docente= new Docente();

            docente =_DocenteDao.getById(Integer.parseInt(iddocente));

            Disponibilidad disponibilidad = new Disponibilidad();
            disponibilidad.setIddocente(docente);
            disponibilidad.setCiclo(ciclo);
            disponibilidad.setHorafinal(horafinal);
            disponibilidad.setHorainicio(horainicial);
            disponibilidad.setDia(dia);
            _DisponibilidadDao.save(disponibilidad);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "Guardado";
    }

}
