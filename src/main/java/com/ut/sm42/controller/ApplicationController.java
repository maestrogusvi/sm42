package com.ut.sm42.controller;

import com.google.gson.JsonObject;
import com.ut.sm42.dto.*;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/")
    public String inicio2(){
        return applicationService.firstService();
    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }
    @GetMapping("/lester")
    public DTOLES lester() throws IOException {
        return applicationService.lester();
    }

    @GetMapping("/arturo")
    public MartinezDTO arturo() throws IOException {
        return applicationService.arturo();
    }
}
