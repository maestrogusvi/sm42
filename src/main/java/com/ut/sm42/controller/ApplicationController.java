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

    @GetMapping("/LesPost")
    public void LesPost(@RequestBody LesDTO lesterDTO) throws IOException{
        ApplicationService.LesPost(lesterDTO);
    }

    @PostMapping("/LesPost")
    public void LesPost(@RequestBody LesDTO lesterDTO ) {
        string test = lesterDTO.toString();
    }



    @GetMapping("ChavezPost")
    public void ChavezPost(@RequestBody JoelDTO joelDTO) throws IOException{
        ApplicationService.ChavezPost(joelDTO);
    }

    @PostMapping("/ChavezPost")
    public void ChavezPost(@RequestBody JoelDTO joelDTO ) {
        string test = joelDTO.toString();
    }
    @GetMapping("/MartinezPost")
    public void MartinezPost(@RequestBody MartinezDTO polancoDTO) throws IOException{
        ApplicationService.MartinezPost(polancoDTO);
    }
    @PostMapping("/MartinezPost")
    public void MartinezPost(@RequestBody MartinezDTO polancoDTO) {
        string test = polancoDTO.toString();
    }

}

