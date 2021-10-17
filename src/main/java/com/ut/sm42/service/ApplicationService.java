package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.EscalanteDTO;
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

    public EscalanteDTO pan() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        EscalanteDTO pan = new EscalanteDTO();
        pan.setId(json.get("id").getAsInt());
        pan.setName(json.get("name").getAsString());
        pan.setStatus(json.get("status").getAsString());
        return pan;
    }
}
