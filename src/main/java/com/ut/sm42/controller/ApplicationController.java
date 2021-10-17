package com.ut.sm42.controller;

import com.google.gson.JsonObject;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.*;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ut.sm42.dto.*;

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
    @GetMapping("/Sebastian")
    public RomerithoDTO Sebastian() throws IOException {
        return applicationService.sebastiane();
    }
    @GetMapping("/Erick")
    public MartinDTO Erick() throws IOException {
        return applicationService.Erick();
    }
    @GetMapping("/leonardo")
    public TecDTO leonardo() throws IOException {
        return applicationService.leonardo();
    }
}
