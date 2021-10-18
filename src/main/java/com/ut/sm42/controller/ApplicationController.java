package com.ut.sm42.controller;

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
    public String inicio() {
        return applicationService.firstService();
    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }

    @GetMapping("/diego")
    public HuchimDTO diego() throws IOException {
        return applicationService.diego();
    }

    @GetMapping("/cruz")
    public EscobarDTO cruz() throws IOException {
        return applicationService.cruz();
    }

    @GetMapping("/carlos")
    public LairDTO carlos() throws IOException {
        return applicationService.carlos();

    }

    @GetMapping("/ivan")
    public AranaDTO ivan() throws IOException{
        return applicationService.ivan();
    }


}