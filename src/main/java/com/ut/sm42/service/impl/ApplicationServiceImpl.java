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

    public RomerithoDTO sebastian() throws IOException {
        JsonParser parcero = new JsonParser();
        JsonObject json = (JsonObject) parcero.parse(httpService.sendRequestHttpS("https://romar.free.beeceptor.com", "GET", null, null, "json", null, null));
        RomerithoDTO htqDTO = new RomerithoDTO();
        htqDTO.setId(json.get("Id").getAsInt());
        htqDTO.setName(json.get("Name").getAsString());
        htqDTO.setStatus(json.get("status").getAsString());
        return htqDTO;
    }

    public MartinDTO erick() throws IOException {
        JsonParser crack = new JsonParser();
        JsonObject json = (JsonObject) crack.parse(httpService.sendRequestHttpS("https://erickr.free.beeceptor.com", "GET", null, null, "json", null, null));
        MartinDTO ersDTO = new MartinDTO();
        ersDTO.setId(json.get("Id").getAsInt());
        ersDTO.setName(json.get("Name").getAsString());
        ersDTO.setStatus(json.get("status").getAsString());
        return ersDTO;
    }

    public TecDTO jesus() throws IOException {
        JsonParser am = new JsonParser();
        JsonObject json = (JsonObject) am.parse(httpService.sendRequestHttpS("https://yisus.free.beeceptor.com", "GET", null, null, "json", null, null));
        TecDTO canulDTO = new TecDTO();
        canulDTO.setId(json.get("Id").getAsInt());
        canulDTO.setName(json.get("Name").getAsString());
        canulDTO.setStatus(json.get("status").getAsString());
        return canulDTO;
    }

    public RamirezDTO oscarl() throws IOException {
        JsonParser parcera = new JsonParser();
        JsonObject json = (JsonObject) parcera.parse(httpService.sendRequestHttpS("https://lemons.free.beeceptor.com", "GET", null, null, "json", null, null));
        RamirezDTO lemon = new RamirezDTO();
        lemon.setId(json.get("Id").getAsInt());
        lemon.setName(json.get("Name").getAsString());
        lemon.setStatus(json.get("status").getAsString());
        return lemon;
    }

    @Override
    public RomerithoDTO romeroPostHttp(RomerithoDTO romerithoDTO) throws IOException {
        JsonParser abc = new JsonParser();
        JsonObject json = (JsonObject) abc.parse(httpService.sendRequestHttpS("https://romar.free.beeceptor.com/api/v1/postHttp", "POST", null, null, "json", romerithoDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return romerithoDTO;
    }

    public TecDTO jlPostHttp(TecDTO tecDTO) throws IOException {
        JsonParser ame = new JsonParser();
        JsonObject json = (JsonObject) ame.parse(httpService.sendRequestHttpS("https://yisus.free.beeceptor.com", "POST", null, null, "json", tecDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return tecDTO;
    }

    public MartinDTO erickPostHttp(MartinDTO martinDTO) throws IOException {
        JsonParser uno = new JsonParser();
        JsonObject json = (JsonObject) uno.parse(httpService.sendRequestHttpS("https://erickr.free.beeceptor.com", "POST", null, null, "json", martinDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return martinDTO;
    }
}