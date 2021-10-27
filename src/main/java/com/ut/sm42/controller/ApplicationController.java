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


//asdasdasdas
    @GetMapping("/les")
    public LesDTO les() throws IOException {
        return applicationService.david();
    }

    @GetMapping("/arturo")
    public MartinezDTO arturo() throws IOException {
        return applicationService.martinez();
    }

    @GetMapping("/omar")
    public CatzinDTO omar() throws IOException {
        return applicationService.catzin();
    }

    @GetMapping("/joel")
    public JoelDTO joel() throws IOException {
        return applicationService.chavez();
    }

//post

    @PostMapping("/lesPost")
    LesDTO lesPost(@RequestBody LesDTO lesterDTO) throws IOException {
        LesDTO arp =  applicationService.lesPOST(lesterDTO);
        return arp;
    }

    @PostMapping("/chavezPost")
    public JoelDTO chavezPost(@RequestBody JoelDTO joelDTO) throws IOException {
        JoelDTO ar =  applicationService.joelPOST(joelDTO);
        return ar;
    }

    @PostMapping("/martinezPost")
    public  MartinezDTO martinezPost(@RequestBody MartinezDTO polancoDTO) throws IOException {
     MartinezDTO are =  applicationService.arturoPOST(polancoDTO);
        return are;
    }

    @PostMapping("/omarPost")
    public CatzinDTO catzinPost(@RequestBody CatzinDTO chaconDTO) throws IOException {
        CatzinDTO arr =  applicationService.omarPOST(chaconDTO);
        return arr;

    }
}
