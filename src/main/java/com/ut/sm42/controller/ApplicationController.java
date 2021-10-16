package com.ut.sm42.controller;

import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.HuchimDTO;
import com.ut.sm42.dto.LairDTO;
import com.ut.sm42.dto.EscobarDTO;
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

    @GetMapping("/Cruz")
    public EscobarDTO Cruz() throws IOException {
        return applicationService.cruz();
    }

    @GetMapping("/carlos")
    public LairDTO carlos() throws IOException {
        return applicationService.carlos();

    }
}