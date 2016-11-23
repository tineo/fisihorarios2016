package com.horarios.controller;

import com.horarios.Elemento;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Controller
@RequestMapping(value="/")
public class MainController {
 /*@RequestMapping("/")
  @ResponseBody
  String home() {
    return "<input type='submit' value='meow' /><p>c</p><p>d</p><b><span>debrax2</span><span>b</span></b>";
  }*/

  @RequestMapping(value="/", method=RequestMethod.GET)
  @ResponseBody
  public ModelAndView home(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("master");
    return mv;
  }

  @RequestMapping("/test")
  @ResponseBody
  String test() {
    return "<input type='submit' value='meow' /><p>c</p><p>d</p><b><span>test</span><span>b</span></b>";
  }

  @RequestMapping(value="/cosa", method= RequestMethod.GET)
  @ResponseBody
  ArrayList<Elemento> porget(@RequestParam(value="p", defaultValue = "no hay nada") String param ) {
    ArrayList<Elemento> lista = new ArrayList<>();
    for( int i = 0; i < param.length(); i++ ){
      lista.add(new Elemento(i, String.valueOf( param.charAt(i) )));
    }
    return lista;
  }

  @RequestMapping(value="/cosa", method=RequestMethod.POST)
  @ResponseBody
  String otro() {
    return "Hola cosa post!";
  }

  @RequestMapping(value="/login")
  @ResponseBody
  public ModelAndView login(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("login");
    return mv;
  }

  @RequestMapping(value="/master", method=RequestMethod.GET)
  @ResponseBody
  public ModelAndView master(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("master");
    return mv;
  }

  @RequestMapping(value="/aulas", method=RequestMethod.GET)
  @ResponseBody
  public ModelAndView aulas(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("aulas");
    return mv;
  }

  @RequestMapping(value="/docente", method=RequestMethod.GET)
  @ResponseBody
  public ModelAndView docente(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("docente");
    return mv;
  }

  @RequestMapping(value="/disponibilidad", method=RequestMethod.GET)
  @ResponseBody
  public ModelAndView disponibilidad(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("disponibilidad");
    return mv;
  }

  @RequestMapping(value="/armado", method=RequestMethod.GET)
  @ResponseBody
  public ModelAndView armado(ModelAndView mv) {
    //mv.addObject("currentDate", new Date());
    //mv.addObject("writers", writer.getWriters());

    mv.setViewName("armado");
    return mv;
  }

  @RequestMapping(value="/logout", method = RequestMethod.GET)
  public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null){
      new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
  }
}
