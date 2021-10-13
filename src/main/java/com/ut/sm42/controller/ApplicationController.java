package com.ut.sm42.controller;

import com.google.gson.JsonObject;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.NoeliDTO;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import com.ut.sm42.dto.MezaDTO;



@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/")
    public String inicio(){
        return applicationService.firstService();
    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }
    //tercero
    @GetMapping("/noe")
    public NoeliDTO noe() throws IOException {
        return applicationService.noe();
    }

    @GetMapping("/aldo")
    public MezaDTO aldo() throws IOException {
        return applicationService.aldo();
    }

}
