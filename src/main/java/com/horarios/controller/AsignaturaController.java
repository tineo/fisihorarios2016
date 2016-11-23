package com.horarios.controller;

import com.horarios.model.Asignatura;
import com.horarios.model.AsignaturaDao;
import com.horarios.model.Aula;
import com.horarios.model.AulaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

@Controller
@RequestMapping(value = "/asignatura")
public class AsignaturaController {

    @Autowired
    private AsignaturaDao _asignaturaDao;
/*
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
    }*/
/*
    @RequestMapping(value = "/save")
    @ResponseBody
    public String create(@RequestParam(value = "codigo", defaultValue = "000") String codigo,
                          @RequestParam(value = "nombre", defaultValue = "000") String nombre,
                          @RequestParam(value = "horas", defaultValue = "000") String horas,
                          @RequestParam(value = "ciclo", defaultValue = "000") String ciclo,
                          @RequestParam(value = "plan", defaultValue = "000") String plan,
                          @RequestParam(value = "creditos", defaultValue = "000") String creditos,
                          @RequestParam(value = "estado", defaultValue = "000") String estado,
                          @RequestParam(value = "horasp", defaultValue = "000") String horasp,
                          @RequestParam(value = "horast", defaultValue = "000") String horast,
                          @RequestParam(value = "horasl", defaultValue = "000") String horasl
                          ){
        try{
            Asignatura asignatura =new Asignatura();
            asignatura.setCodigo(codigo);
            asignatura.setNombre(nombre);
            asignatura.setHoras(Integer.parseInt(horas));
            asignatura.setCiclo(ciclo);
            asignatura.setPlan(plan);
            asignatura.setCreditos(creditos);
            asignatura.setEstado(Integer.parseInt(estado));
            asignatura.setHoraspractica(Integer.parseInt(horasp));
            asignatura.setHorasteoria(Integer.parseInt(horast));
            asignatura.setHoraslaboratorio(Integer.parseInt(horasl));
            _asignaturaDao.save(asignatura);
        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }*/

    @RequestMapping(value = "/getasignatura")
    @ResponseBody
    public List<Asignatura> getAsigByCicloNPlan(@RequestParam(value="ciclo", defaultValue = "primero") String ciclo,
                                                @RequestParam(value="plan", defaultValue = "2009") String plan){
        List<Asignatura> ListAsig =  null;
        try {
            ListAsig =  _asignaturaDao.getAsignaturasByCicloAndPlan(ciclo, plan);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return ListAsig;
    }

}
