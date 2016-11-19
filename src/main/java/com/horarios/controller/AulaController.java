package com.horarios.controller;
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
@RequestMapping(value = "/aula")
public class AulaController {
    @Autowired
    private AulaDao _aulaDao;

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(){
        try {
             Aula aula = new Aula();
            aula.setIdaula(1);
            _aulaDao.detele(aula);
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
            Aula aula =new Aula();
            aula.setNroaula("102");
            aula.setAforomax("40");
            aula.setPizarra("disponible");
            aula.setProyector("disponible");
            aula.setAudio("disponible");
            aula.setEcram("disponible");
            aula.setEquipopc("disponible");
            aula.setNivel("primer");
            aula.setEstado(1);
            _aulaDao.save(aula);


        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado papa :v ";
    }
}