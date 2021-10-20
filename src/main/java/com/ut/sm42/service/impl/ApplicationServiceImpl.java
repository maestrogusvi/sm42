package com.ut.sm42.service.impl;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.CamaraDTO;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
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
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    @Override
    public CamaraDTO gerardo () throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://gerardo.free.beeceptor.com", "GET",null,null,"json",null, null));
        CamaraDTO gerardoDTO = new CamaraDTO();
        gerardoDTO.setId(json.get("id").getAsInt());
        gerardoDTO.setName(json.get("name").getAsString());
        gerardoDTO.setStatus(json.get("status").getAsString());
        return gerardoDTO;

    }

}
