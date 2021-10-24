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
    public String firstService() {
        return "service";
    }

    @Override
    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm42.free.beeceptor.com", "GET", null, null, "json", null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();

        if (json.get("code") == null) {
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    @Override
    public HuchimDTO diego() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://huchim.free.beeceptor.com", "GET", null, null, "json", null, null));
        HuchimDTO diegoDTO = new HuchimDTO();
        diegoDTO.setId(json.get("id").getAsInt());
        diegoDTO.setName(json.get("name").getAsString());
        diegoDTO.setStatus(json.get("Status").getAsString());
        return diegoDTO;

    }

    @Override
    public AranaDTO ivan() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arana.free.beeceptor.com", "GET", null, null, "json", null, null));
        AranaDTO ivanDTO = new AranaDTO();
        ivanDTO.setIdentificador(json.get("identificador").getAsInt());
        ivanDTO.setNombre(json.get("Nombre").getAsString());
        ivanDTO.setStatus(json.get("status").getAsString());
        return ivanDTO;
    }

    @Override
    public EscobarDTO cruz() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://eduardoescobar.free.beeceptor.com/", "GET", null, null, "json", null, null));
        EscobarDTO cruzDTO = new EscobarDTO();
        cruzDTO.setStatus(json.get("Status").getAsString());
        cruzDTO.setId(json.get("id").getAsInt());
        cruzDTO.setName(json.get("name").getAsString());
        return cruzDTO;

    }

    @Override
    public LairDTO carlos() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://carlos.free.beeceptor.com", "GET", null, null, "json", null, null));
        LairDTO carlosDTO = new LairDTO();
        carlosDTO.setId(json.get("id").getAsInt());
        carlosDTO.setName(json.get("name").getAsString());
        carlosDTO.setStatus(json.get("Status").getAsString());
        return carlosDTO;

    }

    @Override
    public HuchimDTO HuchimPOST() throws IOException {
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://huchim.free.beeceptor.com/api/v1/HuchimPOST", "POST", null, null, "json", HuchimPOST().toJSON(), null));
        if(json.get("id")== null){
                throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
            }
        if(json.get("name")== null){
                throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
            }
        if(json.get("status")== null){
                throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
            }
            return null;
        }
    }



