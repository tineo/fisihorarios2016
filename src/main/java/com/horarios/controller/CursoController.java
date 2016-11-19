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
    public String delete(){
        try {
            Curso curso = new Curso();
            curso.setIdcurso(2);
            _CursoDao.detele(curso);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "ya botamos al profe papu!";
    }
    @RequestMapping(value = "/save")
    @ResponseBody
    public  String create(){
        try{
            Docente docente =new Docente();
            docente= _DocenteDao.getById(5);

            Asignatura asignatura = new Asignatura();
            asignatura = _AsignaturaDao.getById(1);

            Aula aula =new Aula();
            aula = _AulaDao.getById(1);

            Curso curso = new Curso();
            curso.setIddocente(docente);
            curso.setIdasignatura(asignatura);
            curso.setIdaula(aula);
            curso.setHorainicio("8:00am");
            curso.setHorafinal("1:00pm");
            curso.setSeccion("g1");




            _CursoDao.save(curso);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado el profe papa :v ";
    }

}
