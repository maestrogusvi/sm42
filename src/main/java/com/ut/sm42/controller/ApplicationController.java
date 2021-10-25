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
        public LesDTO lester() throws IOException {
        return applicationService.lester();
    }

    @GetMapping("/arturo")
    public MartinezDTO arturo() throws IOException {
        return applicationService.arturo();
    }

    @GetMapping("/omar")
    public CatzinDTO omar() throws IOException {
        return applicationService.omar();
    }

    @GetMapping("/joel")
    public JoelDTO joel() throws IOException {
        return applicationService.joel();
    }

   

    @PostMapping("/lesPost")
    public LesDTO lesPost(@RequestBody LesDTO lesterDTO )throws IOException{
        LesDTO n1 = applicationService.lesPOST(LesDTO);
        return n1;
    }
    @PostMapping("/chavezPost")
        JoelDTO chavezPost(@RequestBody JoelDTO joelDTO )throws IOException{
        JoelDTO n2 = applicationService.chavezPOST(JoelDTO);
        return n2;
    }
   
    @PostMapping("/lesPost")
        MarintezDTO martinezPost(@RequestBody MartinezDTO polancoDTO )throws IOException{
        MartinezDTO n3 = applicationService.martinezPOST(MartinezDTO);
        return n3;
    }

   
}

