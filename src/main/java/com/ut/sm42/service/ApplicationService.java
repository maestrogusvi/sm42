package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ut.sm42.dto.HuchimDTO;
import com.ut.sm42.dto.LairDTO;
import com.ut.sm42.dto.escobarDTO;
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

    public HuchimDTO Diego () throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://huchim.free.beeceptor.com", "GET",null,null,"json",null, null));
        HuchimDTO DiegoDTO = new HuchimDTO();
        DiegoDTO.setId(json.get("id").getAsInt());
        DiegoDTO.setName(json.get("name").getAsString());
        DiegoDTO.setStatus(json.get("Status").getAsString());
        return DiegoDTO;

    }

    public escobarDTO Cruz () throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://eduardoescobar.free.beeceptor.com/", "GET", null, null, "json", null, null));
        escobarDTO cruzDTO = new escobarDTO();
        cruzDTO.setStatus(json.get("Status").getAsString());
        cruzDTO.setId(json.get("id").getAsInt());
        cruzDTO.setName(json.get("name").getAsString());
        return cruzDTO;

    }

        public LairDTO Carlos () throws IOException {
            JsonParser asd = new JsonParser();
            JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://carlos.free.beeceptor.com", "GET",null,null,"json",null, null));
            LairDTO CarlosDTO = new LairDTO();
            CarlosDTO.setId(json.get("id").getAsInt());
            CarlosDTO.setName(json.get("name").getAsString());
            CarlosDTO.setStatus(json.get("Status").getAsString());
            return CarlosDTO;

        }
    }








