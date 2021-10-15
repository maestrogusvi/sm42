package com.ut.sm42.controller;

import com.google.gson.JsonObject;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.HuchimDTO;
import com.ut.sm42.dto.LairDTO;
import com.ut.sm42.dto.escobarDTO;
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

    @GetMapping("/Diego")
    public HuchimDTO Diego() throws IOException {
        return applicationService.Diego();
    }

    @GetMapping("/Cruz")
    public escobarDTO Cruz() throws IOException {
        return applicationService.Cruz();


    }

    @GetMapping("/Carlos")
    public LairDTO Carlos() throws IOException {
        return applicationService.Carlos();

    }
}