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
@RequestMapping(value = "/dictado")
public class DictadoController {
}
