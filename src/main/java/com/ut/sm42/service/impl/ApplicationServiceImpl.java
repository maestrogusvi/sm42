package com.ut.sm42.service.impl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.dto.dtoFacebook.FacebookDTO;
import com.ut.sm42.dto.dtoMediaStack.MediaStackDTO;
import com.ut.sm42.dto.dtoTwitch.TwitchDTO;
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
        if (json.get("id") == null) {
            throw new BusinessException("id doen´t exit", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name doen´t exit", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status doen´t exit", HttpStatus.FORBIDDEN);
        }

        return huchimDTO;
    }

    @Override
    public LairDTO lairPOST(LairDTO lairDTO) throws IOException {

        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://carlos.free.beeceptor.com/api/v1/lairPOST", "POST", null, null, "json", lairDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status doesn’t exist", HttpStatus.FORBIDDEN);
        }
        return lairDTO;
    }

    @Override
    public AranaDTO aranaPOST(AranaDTO aranaDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arana.free.beeceptor.com/api/v1/lairPOST", "POST", null, null, "json", aranaDTO.toJSON(), null));
        if (json.get("identificador") == null) {
            throw new BusinessException("identificador doesn't exist", HttpStatus.FORBIDDEN);
        }
        if (json.get("Nombre") == null) {
            throw new BusinessException("Nombre doesn´t exist", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status doesn´t exist", HttpStatus.FORBIDDEN);
        }
        return aranaDTO;
    }

    @Override
    public EscobarDTO escobarPOST(EscobarDTO escobarDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://eduardoescobar.free.beeceptor.com/api/v1/escobarPOST", "POST", null, null, "json", escobarDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if (json.get("Status") == null) {
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


    @Override
    public void getNews() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("http://api.mediastack.com/v1/news?access_key=006182e15c63854771d2495325afacd1&palabrasclave=tenis&pa%C3%ADses=us,gb,de", "GET", null, null, "json", null, null));
        MediaStackDTO mediaStackDTO = new MediaStackDTO();

    }

    @Override
    public FacebookDTO getfacebook() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://graph.facebook.com/v12.0/oauth/access_token?client_id=611674913235979&client_secret=f09c40f9c7cd2bc659a07a4077133b92&redirect_uri=https://equipodiego.free.beeceptor.com/&code=AQCJ-zQZ721_1kTpeTIBXNh7znyrhOTIiLNzsUh0LxI9RH2boLqdkJNJwat68bLZwUtjybAHlml_ERxFUbDHuQ9Vkv35B40HtjG9sYrQzb4nLfpCwCSAN7-iwGLGF_i6urHIerlYDjLZdUqI1G94cIm3HadTzggfZwzOjCtLp5lGchb7_4aAAg2mIG8_PPEqrWej2syNW9LvRPNRDM0_SzaIQ8sZsbU_7q3BbtG_4r3g7f72KaBEHHLwWHh1yV-wI_c-fNwmxeAnkM_E3zJJtAJNKRhJZxJ9iyeA2oiuLnJIK0ar5CBRRwADu8YBZj7c5S7HmOgBl6AwmU83PFF0XDHu0O_40sSJTG7VI__POtd1KPSTnkStoA5vD6oqWevH4MQ", "GET", null, null, "json", null, null));
        FacebookDTO facebookDTO = new FacebookDTO();
        facebookDTO.setId(json.get("id").getAsInt());
        facebookDTO.setName(json.get("name").getAsString());
        facebookDTO.setLikes(json.get("likes").getAsString());
        facebookDTO.setGender(json.get("gender").getAsString());
        facebookDTO.setBirthday(json.get("birthday").getAsInt());
        return facebookDTO;
    }


}







