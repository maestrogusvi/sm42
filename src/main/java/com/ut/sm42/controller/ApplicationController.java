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

    @ExceptionHandler({BusinessException.class})
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


    //----------CARIM MENDOZA----------


    @PostMapping("/testMendozaHttp")
    public MendozaDTO testMendozaHttp(@RequestBody MendozaDTO master) throws IOException {
        applicationService.testMendozaHttp(master);
        return master;
    }

    @PostMapping("/testPostMen")
    public void testPost(@RequestBody MendozaDTO master) throws IOException {
        applicationService.saveMyFirstObjectMen();
        String test = master.toString();
    }


    //----------SERGIO ESCALANTE----------


    @PostMapping("/testEscalanteHttp")
    public EscalanteDTO testEscalanteHttp(@RequestBody EscalanteDTO pan) throws IOException {
        applicationService.testEscalanteHttp(pan);
        return pan;
    }

    @PostMapping("/testPostEsc")
    public void testPostE(@RequestBody EscalanteDTO pan) {
        applicationService.saveMyFirstObjectEsc();
        String test = pan.toString();
    }


    //----------ERICK TORREBLANCA----------


    @PostMapping("/testTorreblancaHttp")
    public TorreblancaDTO testTorreblancaHttp(@RequestBody TorreblancaDTO sayayin) throws IOException {
        applicationService.testTorreblancaHttp(sayayin);
        return sayayin;
    }

    @PostMapping("/testPostTor")
    public void testPostT(@RequestBody TorreblancaDTO sayayin) {
        applicationService.saveMyFirstObjectTor();
        String test = sayayin.toString();
    }
}