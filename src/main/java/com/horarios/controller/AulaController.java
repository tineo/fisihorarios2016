package com.horarios.controller;
import com.horarios.model.Aula;
import com.horarios.model.AulaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
        return "Aula Destruida";
    }

    @RequestMapping(value = "/save")
    @ResponseBody
    public String create(@RequestParam(value = "nroaula", defaultValue = "000") String nroaula,
                          @RequestParam(value = "aforomax", defaultValue = "40") String aforomax,
                          @RequestParam(value = "pizara", defaultValue = "disponible") String pizara,
                          @RequestParam(value = "proyector", defaultValue = "disponible") String proyector,
                          @RequestParam(value = "audio", defaultValue = "disponible") String audio,
                          @RequestParam(value = "ecram", defaultValue = "disponible") String ecram,
                          @RequestParam(value = "equipopc", defaultValue = "disponible") String equipopc,
                          @RequestParam(value = "nivel", defaultValue = "primer") String nivel,
                          @RequestParam(value = "estado", defaultValue = "1") String estado){
        try{
            Aula aula =new Aula();
            aula.setNroaula(nroaula);
            aula.setAforomax(aforomax);
            aula.setPizarra(pizara);
            aula.setProyector(proyector);
            aula.setAudio(audio);
            aula.setEcram(ecram);
            aula.setEquipopc(equipopc);
            aula.setNivel(nivel);
            aula.setEstado(Integer.parseInt(estado));
            _aulaDao.save(aula);
        }
        catch (Exception e){
            return e.getMessage();
        }
        return "Aula creada exitosamente";
    }

    @RequestMapping(value = "/getaula")
    @ResponseBody
    public Aula getaula(@RequestParam(value="numaula", defaultValue = "101") String numaula ){
        Aula aula =  null;
        try {
            aula =  _aulaDao.getAulaByNroaula(numaula);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return aula;
    }
}
