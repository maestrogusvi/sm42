package com.ut.sm42.controller;

import com.google.gson.JsonObject;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.*;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.dto.EscalanteDTO;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @ExceptionHandler({ BusinessException.class })
    @ResponseBody
    public ResponseEntity<String> userHandler(BusinessException ex) {
        return new ResponseEntity<String>(ex.getMessage(), ex.getHttpStatus());
    }

    @GetMapping("/")
    public String inicio2() throws IOException {
        return applicationService.firstService();

    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }

    @GetMapping("/pan")
    public EscalanteDTO pan() throws IOException {
        return applicationService.pan();
    }

    @GetMapping("/master")
    public MendozaDTO master() throws IOException {
        return applicationService.master();
    }

    @GetMapping("/sayayin")
    public TorreblancaDTO sayayin() throws IOException {
        return applicationService.sayayin();
    }

    @GetMapping("/testMendozaHttp")
    public void testMendozaHttp(@RequestBody MendozaDTO master) throws IOException {
        applicationService.testMendozaHttp(master);
    }

    @PostMapping("/testPost")
    public void testPost(@RequestBody MendozaDTO master){
        String test = master.toString();
    }

    @GetMapping("/testEscalanteHttp")
    public void testEscalanteHttp(@RequestBody EscalanteDTO pan) throws IOException {
        applicationService.testEscalanteHttp(pan);
    }

    @PostMapping("/testPost")
    public void testPost(@RequestBody EscalanteDTO pan) {
        String test = pan.toString();
    }

    @GetMapping("/testTorreblancaHttp")
    public void testTorreblancaHttp(@RequestBody TorreblancaDTO sayayin) throws IOException {
        applicationService.testTorreblancaHttp(sayayin);
    }

    @PostMapping("/testPost")
    public void testPost(@RequestBody TorreblancaDTO sayayin) {
        String test = sayayin.toString();
    }
}
