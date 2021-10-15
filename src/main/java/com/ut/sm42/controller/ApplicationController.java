package com.ut.sm42.controller;

import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ut.sm42.dto.HuchimDTO;
import com.ut.sm42.dto.LairDTO;
import com.ut.sm42.dto.EscobarDTO;
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
    public String inicio(){
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
}