package com.ut.sm42.controller;

import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.DTOpersonales.MartinDTO;
import com.ut.sm42.dto.DTOpersonales.RamirezDTO;
import com.ut.sm42.dto.DTOpersonales.RomerithoDTO;
import com.ut.sm42.dto.DTOpersonales.TecDTO;
import com.ut.sm42.dto.Facebook.FacebookDTO;
import com.ut.sm42.dto.MercadoLibre.MercadoLibreDTO;
import com.ut.sm42.dto.Spotify.SpotifyDTO;
import com.ut.sm42.dto.Twitch.TwitchGameDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/voltux/api/v2")
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

    @GetMapping("/sebastian")
    public RomerithoDTO sebastian() throws IOException {
        return applicationService.sebastian();
    }
    @GetMapping("/erick")
    public MartinDTO erick() throws IOException {
        return applicationService.erick();
    }
    @GetMapping("/jesus")
    public TecDTO jesus() throws IOException {
        return applicationService.jesus();
    }
    @GetMapping("/oscarl")
    public RamirezDTO oscarl() throws IOException {
        return applicationService.oscarl();
    }

    //PostHttp
    @GetMapping("/romeroPostHttp")
    public RomerithoDTO  romeroPostHttp(@RequestBody RomerithoDTO romerithoDTO) throws IOException {
        applicationService.romeroPostHttp(romerithoDTO);
        return romerithoDTO;
    }
    @GetMapping("/jlPostHttp")
    public TecDTO  jlPostHttp(@RequestBody TecDTO tecDTO) throws IOException {
        applicationService.jlPostHttp(tecDTO);
        return tecDTO;
    }
    @GetMapping("/oscarlPostHttp")
    public RamirezDTO  oscarlPostHttp(@RequestBody RamirezDTO ramirezDTO) throws IOException {
        applicationService.oscarlPostHttp(ramirezDTO);
        return ramirezDTO;
    }
    @GetMapping("/erickPostHttp")
    public MartinDTO  erickPostHttp(@RequestBody MartinDTO martinDTO) throws IOException {
        applicationService.erickPostHttp(martinDTO);
        return martinDTO;
    }
    //Post
    @PostMapping("/romeroPost")
    public RomerithoDTO romeroPost(@RequestBody RomerithoDTO romerithoDTO) throws IOException{
        applicationService. romeroPostHttp(romerithoDTO);
        return romerithoDTO;
    }
    @PostMapping("/jlPost")
    public TecDTO tecPost(@RequestBody TecDTO tecDTO) throws IOException{
        applicationService. jlPostHttp(tecDTO);
        return tecDTO;
    }
    @PostMapping("/oscarlPost")
    public RamirezDTO oscarlPost(@RequestBody RamirezDTO ramirezDTO) throws IOException{
        applicationService.oscarlPostHttp(ramirezDTO);
        return ramirezDTO;
    }
    @PostMapping("/erickPost")
    public MartinDTO erickPost(@RequestBody MartinDTO martinDTO) throws IOException{
        applicationService.erickPostHttp(martinDTO);
        return martinDTO;
    }

    //API's
    @GetMapping("/spotify")
    public SpotifyDTO spotifyDTO(@RequestBody SpotifyDTO spotifyDTO) throws IOException{
        applicationService.online(spotifyDTO);
        return spotifyDTO;
    }
    @GetMapping("/facebook")
    public FacebookDTO facebookDTO(@RequestBody FacebookDTO facebookDTO) throws IOException{
        applicationService.redesociales(facebookDTO);
        return facebookDTO;
    }
    @GetMapping("/mercadolibre")
    public MercadoLibreDTO mercadoLibreDTO() throws IOException {
        return  applicationService.e_commers();
    }
    @GetMapping("/twitch")
    public TwitchGameDTO streamingDTO() throws IOException {
        return   applicationService.streaming();
    }
}