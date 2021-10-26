package com.ut.sm42.controller;

import com.ut.sm42.dto.*;
import com.ut.sm42.exception.BusinessException;
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
    public AranaDTO ivan() throws IOException {
        return applicationService.ivan();
    }

    @PostMapping("/huchimPOST")
    public HuchimDTO huchimPOST(@RequestBody HuchimDTO huchimDTO) throws IOException{
        applicationService.huchimPOST(huchimDTO);
        String tets = huchimDTO.toString();
        return huchimDTO;
    }

    @PostMapping("/lairPOST")
    public LairDTO lairPOST(@RequestBody LairDTO lairDTO) throws  IOException{
        applicationService.lairPOST(lairDTO);
        String tets = lairDTO.toString();
        return lairDTO;
    }

    @PostMapping("/aranaPOST")
    public AranaDTO aranaDTO(@RequestBody AranaDTO aranaDTO) throws IOException{
        applicationService.aranaPOST(aranaDTO);
        String tets = aranaDTO.toString();
        return aranaDTO;
    }

    @PostMapping("/escobarPOST")
    public EscobarDTO escobarPOST(@RequestBody EscobarDTO escobarDTO) throws  IOException{
        applicationService.escobarPOST(escobarDTO);
        String tets = escobarDTO.toString();
        return escobarDTO;
    }



}