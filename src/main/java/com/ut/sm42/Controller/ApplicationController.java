package com.ut.sm42.Controller;

import com.ut.sm42.Service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/application")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/")
    public String inicio(){
        return applicationService.inicio();
    }

    @PostMapping("/")
    public String inicioPost(){
        return "Hola Mundo post";
    }
}
