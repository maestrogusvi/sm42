package com.ut.sm42.controller;


import com.ut.sm42.dto.*;

import com.ut.sm42.service.Impl.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
        return applicationService.les();
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

//post

    @PostMapping("/lesPost")
    LesDTO lesPost(@RequestBody LesDTO lesterDTO) throws IOException {
        LesDTO arp =  applicationService.lesPost(lesterDTO);
        return arp;
    }

    @PostMapping("/chavezPost")
    public JoelDTO chavezPost(@RequestBody JoelDTO joelDTO) throws IOException {
        JoelDTO ar =  applicationService.chavezPost(joelDTO);
        return ar;
    }

    @PostMapping("/martinezPost")
    public  MartinezDTO martinezPost(@RequestBody MartinezDTO polancoDTO) throws IOException {
     MartinezDTO are =  applicationService.martinezPost(polancoDTO);
        return are;
    }

    @PostMapping("/omarPost")
    public CatzinDTO catzinPost(@RequestBody CatzinDTO chaconDTO) throws IOException {
        CatzinDTO arr =  applicationService.omarPost(chaconDTO);
        return arr;

    }
}
