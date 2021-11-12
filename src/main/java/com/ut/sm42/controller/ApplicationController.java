package com.ut.sm42.controller;

import com.ut.sm42.dto.facebook.FacebookDTO;
import com.ut.sm42.dto.twitch.TwitchStreamsDTO;
import com.ut.sm42.dto.users.*;
import com.ut.sm42.dto.mercadolibre.MercadoLibreDTO;
import com.ut.sm42.dto.youtube.YouTubeMergeDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@RestController
@RequestMapping(value = "/api/v1",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
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
        NoeliDTO nrm = applicationService.noepostHttp(noeliDTO);
        applicationService.myObjectNoe();
        return nrm;
    }

    @PostMapping("/cesarPOST")
    public CejaDTO cesarPOST(@RequestBody CejaDTO cejaDTO) throws IOException{
        CejaDTO cac = applicationService.cejaPOST(cejaDTO);
        return cac;
    }

    @PostMapping("/fragosoPOST")
    public FragosoDTO fragosoPOST(@RequestBody FragosoDTO fragosoDTO) throws  IOException{
        FragosoDTO df = applicationService.fragosoPOST(fragosoDTO);
        applicationService.saveMyFirsfObjectFragoso();
        return df;
    }
    @PostMapping("/mezaPOST")
    public MezaDTO mezaPOST(@RequestBody MezaDTO mezaDTO) throws IOException{
        MezaDTO amm =  applicationService.mezaPOST(mezaDTO);
        applicationService.myObjectMeza();
        return amm;
    }
    @PostMapping("/userPost")
    public void userPost(@RequestBody BeeceptorDTO beeceptorDTO){
        applicationService.saveMyFirstObject();
        String test = beeceptorDTO.toString();
    }

    @GetMapping("/youtubeitem")
    public YouTubeMergeDTO youTubeDTO() throws IOException {
        YouTubeMergeDTO yd = applicationService.mergeYoutube();
        return yd;
    }
    
    @PostMapping("/mercadoPOST")
    public MercadoLibreDTO mercadoPost() throws IOException{
        MercadoLibreDTO ml = applicationService.getQyA();
        return ml;
    }

    @GetMapping("/facebook")
    public FacebookDTO getinfo() throws  IOException{
        FacebookDTO fb = applicationService.getInfo();
        return fb;
    }
    @GetMapping("/twitchSTREAMS")
    public TwitchStreamsDTO getstream(TwitchStreamsDTO stream) throws  IOException{
        TwitchStreamsDTO twch = applicationService.getStream(stream);
        return twch;
    }
}
