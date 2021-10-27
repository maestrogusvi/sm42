package com.ut.sm42.service.impl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
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

    @Autowired
    UserRepository userRepository;

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

    // ACT 22 OCT 2021

    @Override
    public HuchimDTO huchimPOST(HuchimDTO huchimDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://huchim.free.beeceptor.com/api/v1/huchimPOST", "GET", null, null, "json", huchimDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doen´t exit", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doen´t exit", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status doen´t exit", HttpStatus.FORBIDDEN);
        }

        return huchimDTO;
    }

    @Override
    public LairDTO lairPOST(LairDTO lairDTO) throws IOException {

        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://carlos.free.beeceptor.com/api/v1/lairPOST", "POST", null, null, "json", lairDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status doesn’t exist", HttpStatus.FORBIDDEN);
        }
        return lairDTO;
    }

    @Override
    public AranaDTO  aranaPOST(AranaDTO aranaDTO) throws  IOException{
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arana.free.beeceptor.com/api/v1/lairPOST","POST",null,null,"json",aranaDTO.toJSON(),null));
        if(json.get("identificador")==null){
            throw new BusinessException("identificador doesn't exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("Nombre")==null){
            throw new BusinessException("Nombre doesn´t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")==null){
            throw new BusinessException("status doesn´t exist", HttpStatus.FORBIDDEN);
        }
        return aranaDTO;
    }

    @Override
    public EscobarDTO escobarPOST(EscobarDTO escobarDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://eduardoescobar.free.beeceptor.com/api/v1/escobarPOST", "POST", null, null, "json", escobarDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("Status")== null){
            throw new BusinessException("Status doesn’t exist", HttpStatus.FORBIDDEN);
        }
        return escobarDTO;
    }

    @Override
    public void saveMyFirstObject() {
        User user = new User();
        user.setName("Diego Huchim");
        user.setStatus("Disponible");
        userRepository.save(user);
    }


}







