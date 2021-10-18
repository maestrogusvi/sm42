package com.ut.sm42.service.impl;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Override
    public String firstService(){
        return "service";
    }
    @Override
    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm42.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();

        if(json.get("code")== null){
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }
    public RomerithoDTO sebastian() throws IOException {
        JsonParser parcero = new JsonParser();
        JsonObject json = (JsonObject) parcero.parse(httpService.sendRequestHttpS("https://romar.free.beeceptor.com","GET",null,null,"json",null, null));
        RomerithoDTO htqDTO = new RomerithoDTO();
        htqDTO.setId(json.get("Id").getAsInt());
        htqDTO.setName(json.get("Name").getAsString());
        htqDTO.setStatus(json.get("status").getAsString());
        return htqDTO;
    }

    public MartinDTO erick() throws IOException {
        JsonParser crack = new JsonParser();
        JsonObject json = (JsonObject) crack.parse(httpService.sendRequestHttpS("https://erickr.free.beeceptor.com","GET",null,null,"json",null, null));
        MartinDTO ersDTO = new MartinDTO();
        ersDTO.setId(json.get("Id").getAsInt());
        ersDTO.setName(json.get("Name").getAsString());
        ersDTO.setStatus(json.get("status").getAsString());
        return ersDTO;
    }
    public TecDTO jesus() throws IOException {
        JsonParser am= new JsonParser();
        JsonObject json = (JsonObject) am.parse(httpService.sendRequestHttpS("https://yisus.free.beeceptor.com","GET",null,null,"json",null, null));
        TecDTO yisusDTO = new TecDTO();
        yisusDTO.setId(json.get("Id").getAsInt());
        yisusDTO.setName(json.get("Name").getAsString());
        yisusDTO.setStatus(json.get("status").getAsString());
        return yisusDTO;
    }
    public RamirezDTO oscarl() throws IOException {
        JsonParser parcera = new JsonParser();
        JsonObject json = (JsonObject) parcera.parse(httpService.sendRequestHttpS("https://lemons.free.beeceptor.com","GET",null,null,"json",null, null));
        RamirezDTO lemon = new RamirezDTO();
        lemon.setId(json.get("Id").getAsInt());
        lemon.setName(json.get("Name").getAsString());
        lemon.setStatus(json.get("status").getAsString());
        return lemon;
    }
}
