package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        //return "redirect:/app/index"; // redirigiendo a una vista dentro del template
        //return "redirect:https://www.google.com"; // redirigiendo a una ruta externa
        return "forward:/app/index"; // sin recargar la pagina, dentro del mismo request
        
    }
}
