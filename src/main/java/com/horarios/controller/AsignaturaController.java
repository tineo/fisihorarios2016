package com.horarios.controller;

import com.horarios.model.Asignatura;
import com.horarios.model.AsignaturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
            asignatura.setCodigo("2020101");
            asignatura.setNombre("Base de Datos");
            asignatura.setHoras(5);
            asignatura.setCiclo("cuarto");
            asignatura.setPlan("2009");
            asignatura.setCreditos("quinto");
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

    @RequestMapping(value = "/search")
    @ResponseBody
    public List<Asignatura> search(){
        List<Asignatura> lista = null;
        try {
             lista = _asignaturaDao.getAsignaturas("ca");
        }
        catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
            //return e.getMessage();
        }
        return lista;
    }

    @RequestMapping(value = "/listby")
    @ResponseBody
    public List<Asignatura> asignaturasByCicloAndPlan(
            @RequestParam(value="ciclo", defaultValue = "101") String ciclo,
            @RequestParam(value="plan", defaultValue = "101") String plan
    ){
        List<Asignatura> lista = null;
        try {

            lista = _asignaturaDao.getAsignaturasByCicloAndPlan(ciclo, plan);

        }catch (Exception e){

            System.out.println("error");
            e.printStackTrace();
            //return e.getMessage();
        }
        return lista;
    }

}
