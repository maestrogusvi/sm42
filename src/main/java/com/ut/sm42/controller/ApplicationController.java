package com.ut.sm42.controller;

import com.ut.sm42.dto.BeeceptorDTO;
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

    @ExceptionHandler({ BusinessException.class })
    @ResponseBody
    public ResponseEntity<String> userHandler(BusinessException ex) {
        return new ResponseEntity<String>(ex.getMessage(), ex.getHttpStatus());
    }

    @GetMapping("/")
    public String inicio(){return applicationService.firstService();
    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }
    //tercero
    @GetMapping("/noe")
    public NoeliDTO noe() throws IOException {
        return applicationService.noe();
    }

    @GetMapping("/aldo")
    public MezaDTO aldo() throws IOException {
        return applicationService.aldo();
    }

    @GetMapping("/david")
    public FragosoDTO david() throws IOException {
        return applicationService.david();
    }
    @GetMapping("/cesar")
    public CejaDTO cesar()throws IOException{
        return applicationService.cesar();
    }

    //POST
    @PostMapping("/testPostHttpNoe")
    public NoeliDTO noeli(@RequestBody NoeliDTO noeliDTO) throws IOException {
        applicationService.noepostHttp(noeliDTO);
        String as = noeliDTO.toString();
        return noeliDTO;
    }

    @PostMapping("/cesarPOST")
    public CejaDTO cesarPOST(@RequestBody CejaDTO cejaDTO) throws IOException{
        applicationService.cejaPOST(cejaDTO);
        String as = cejaDTO.toString();
        return cejaDTO;
    }
}
