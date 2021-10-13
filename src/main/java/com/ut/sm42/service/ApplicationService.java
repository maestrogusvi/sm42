package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class  ApplicationService {

    @Autowired
    HttpService httpService;

    public String firstService(){
        return "service";
    }

    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    //segundo
    public NoeliDTO noe() throws  IOException{
        JsonParser par = new JsonParser();
        JsonObject json = (JsonObject) par.parse(httpService.sendRequestHttpS("https://equiponoe.free.beeceptor.com","GET",null,null,"json",null, null));
        NoeliDTO noeDTO = new NoeliDTO();
        noeDTO.setStatus(json.get("status").getAsString());
        noeDTO.setID(json.get("ID").getAsString());
        noeDTO.setNAME(json.get("NAME").getAsString());
        return noeDTO;
    }

    public MezaDTO aldo() throws  IOException {
        JsonParser aar = new JsonParser();
        JsonObject json = (JsonObject) aar.parse(httpService.sendRequestHttpS("https://aldodto.free.beeceptor.com", "GET", null, null, "json", null, null));
        MezaDTO AldoDTO = new MezaDTO();
        AldoDTO.setStatus(json.get("status").getAsString());
        AldoDTO.setId(json.get("id").getAsInt());
        AldoDTO.setName(json.get("name").getAsString());
        return AldoDTO;
    }

    public FragosoDTO david() throws  IOException {
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://davidendpoint.free.beeceptor.com", "GET", null, null, "json", null, null));
        FragosoDTO DavidDTO = new FragosoDTO();
        DavidDTO.setStatus(json.get("status").getAsString());
        DavidDTO.setId(json.get("id").getAsInt());
        DavidDTO.setName(json.get("name").getAsString());
        return DavidDTO;
    }
}
