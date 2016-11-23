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

import java.util.List;

@Controller
@RequestMapping(value = "/curso")
public class CursoController {

    @Autowired
    private CursoDao _CursoDao;
    @Autowired
    private DocenteDao _DocenteDao;
    @Autowired
    private AsignaturaDao _AsignaturaDao;
    @Autowired
    private AulaDao _AulaDao;

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(@RequestParam(value="idcurso", defaultValue = "1") String idcurso){
        try {
            Curso curso = new Curso();
            curso.setIdcurso(Integer.parseInt(idcurso));
            _CursoDao.delete(curso);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "Horario Suprimido";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(@RequestParam(value="iddocente", defaultValue = "1") String iddocente,
                          @RequestParam(value="idasignatura", defaultValue = "1") String idasignatura,
                          @RequestParam(value="idaula", defaultValue = "1") String idaula,
                          @RequestParam(value="horainicio", defaultValue = "1") String horainicio,
                          @RequestParam(value="horafinal", defaultValue = "1") String horafinal,
                          @RequestParam(value="dia", defaultValue = "1") String dia,
                          @RequestParam(value="seccion", defaultValue = "1") String seccion){
        try{
            Docente docente =new Docente();
            docente= _DocenteDao.getById(Integer.parseInt(iddocente));

            Asignatura asignatura = new Asignatura();
            asignatura = _AsignaturaDao.getById(Integer.parseInt(idasignatura));

            Aula aula =new Aula();
            aula = _AulaDao.getById(Integer.parseInt(idaula));

            Curso curso = new Curso();
            curso.setIddocente(docente);
            curso.setIdasignatura(asignatura);
            curso.setIdaula(aula);
            curso.setHorainicio(horainicio);
            curso.setHorafinal(horafinal);
            curso.setDia(dia);
            curso.setSeccion(seccion);

            _CursoDao.save(curso);
        }
        catch (Exception e){
            return e.getMessage();

        }
        return "Guardado";
    }

    @RequestMapping(value = "/getcurso")
    @ResponseBody
    public List<Curso> getCursoByCicloNPlan(@RequestParam(value="ciclo", defaultValue = "1") String ciclo,
                                            @RequestParam(value="plan", defaultValue = "2009") String plan){
        List<Curso> listCurso =  null;
        try {
            listCurso =  _CursoDao.getCursoByCicloAndPlan(ciclo, plan);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return listCurso;
    }
}
