package com.ut.sm42.controller;

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
    ApplicationService authenticationService;

    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    public ResponseEntity<String> userHandler(BusinessException ex) {
        return new ResponseEntity<String>(ex.getMessage(), ex.getHttpStatus());
    }

    @GetMapping("/")
    public String inicio2() throws IOException {
        return authenticationService.firstService();

    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return authenticationService.testHttp();
    }


    //----------CARIM MENDOZA----------


    @GetMapping("/master")
    public MendozaDTO master() throws IOException {
        return authenticationService.master();
    }

    @PostMapping("/testMendozaHttp")
    public MendozaDTO testMendozaHttp(@RequestBody MendozaDTO master) throws IOException {
        authenticationService.testMendozaHttp(master);
        return master;
    }

    @PostMapping("/testPostMen")
    public void testPost(@RequestBody MendozaDTO master) throws IOException {
        authenticationService.saveMyFirstObjectMen();
        authenticationService.getCell();
        String test = master.toString();
    }


    //----------SERGIO ESCALANTE----------


    @GetMapping("/pan")
    public EscalanteDTO pan() throws IOException {
        return authenticationService.pan();
    }

    @PostMapping("/testEscalanteHttp")
    public EscalanteDTO testEscalanteHttp(@RequestBody EscalanteDTO pan) throws IOException {
        authenticationService.testEscalanteHttp(pan);
        return pan;
    }

    @PostMapping("/testPostEsc")
    public void testPostE(@RequestBody EscalanteDTO pan) {
        authenticationService.saveMyFirstObjectEsc();
        String test = pan.toString();
    }


    //----------ERICK TORREBLANCA----------


    @GetMapping("/sayayin")
    public TorreblancaDTO sayayin() throws IOException {
        return authenticationService.sayayin();
    }

    @PostMapping("/testTorreblancaHttp")
    public TorreblancaDTO testTorreblancaHttp(@RequestBody TorreblancaDTO sayayin) throws IOException {
        authenticationService.testTorreblancaHttp(sayayin);
        return sayayin;
    }

    @PostMapping("/testPostTor")
    public void testPostT(@RequestBody TorreblancaDTO sayayin) {
        authenticationService.saveMyFirstObjectTor();
        String test = sayayin.toString();
    }


}