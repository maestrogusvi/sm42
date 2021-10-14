package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.BeeceptorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ut.sm42.dto.*;
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
    public RomerithoDTO SebastianE() throws IOException {
        JsonParser parcero = new JsonParser();
        JsonObject json = (JsonObject) parcero.parse(httpService.sendRequestHttpS("https://romar.free.beeceptor.com","GET",null,null,"json",null, null));
        RomerithoDTO HTQDTO = new RomerithoDTO();
        HTQDTO.setId(json.get("Id").getAsInt());
        HTQDTO.setName(json.get("Name").getAsString());
        HTQDTO.setStatus(json.get("status").getAsString());
        return HTQDTO;
    }
}
