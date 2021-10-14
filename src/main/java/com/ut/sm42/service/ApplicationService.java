package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationService {

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

    public DTOLES lester() throws IOException {

        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://uicabgongora.free.beeceptor.com", "GET", null, null, "json", null, null));
        DTOLES lesterDTO = new DTOLES();
        lesterDTO.setStatus(json.get("Status").getAsString());
        lesterDTO.setId(json.get("id").getAsInt());
        lesterDTO.setName(json.get("name").getAsString());
        return lesterDTO;

    }
    public MartinezDTO arturo() throws IOException {

        JsonParser amp = new JsonParser();
        JsonObject json = (JsonObject) amp.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com", "GET", null, null, "json", null, null));
        MartinezDTO polancoDTO = new MartinezDTO();
        polancoDTO.setId(json.get("Id").getAsInt());
        polancoDTO.setName(json.get("Name").getAsString());
        polancoDTO.setStatus(json.get("Status").getAsString());
        return polancoDTO;

    }
}
