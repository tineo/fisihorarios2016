package com.horarios.controller;

import com.horarios.model.Docente;
import com.horarios.model.DocenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/docente")
public class DocenteController {

    @Autowired
    private DocenteDao _docenteDao;
 /*
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(@RequestParam(value="codigo", defaultValue = "101") String codigo){
        try {
            Docente docente = new Docente();
            docente.setId(Integer.parseInt(codigo));
            _docenteDao.detele(docente);
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
            Docente docente = new Docente();

            docente.setApellidos("CASTILLO JIMENEZ");
            docente.setCodigo("21034571");
            docente.setCorreo("EMILIO@gmail.com");
            docente.setLimfisica("No");
            docente.setTelefono("996666567");
            docente.setNombres("EMILIO");

            _docenteDao.save(docente);
        }
        catch (Exception e){
            return e.getMessage();

        }
        return "guardado el profe papa :v ";
    }
*/
    @RequestMapping(value = "/getdocente")
    @ResponseBody
    public Docente getdocente(@RequestParam(value="codigo", defaultValue = "101") String codigo){
        Docente docente =  null;
        try {
            docente =  _docenteDao.getDocenteByCodigo(codigo);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return docente;
    }
}
