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
    private ArturoDTO arturoDTO;

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
    public LesDTO david() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://uicabgongora.free.beeceptor.com", "GET", null, null, "json", null, null));
        LesDTO lesDTO = new LesDTO();
        lesDTO.setId(json.get("id").getAsInt());
        lesDTO.setName(json.get("name").getAsString());
        lesDTO.setStatus(json.get("Status").getAsString());
        return lesDTO;

    }

    @Override
    public ArturoDTO martinez() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com", "GET", null, null, "json", null, null));
        ArturoDTO arturoDTO = new ArturoDTO();
        arturoDTO.setIdentificador(json.get("identificador").getAsInt());
        arturoDTO.setNombre(json.get("Nombre").getAsString());
        arturoDTO.setStatus(json.get("status").getAsString());
        return arturoDTO;
    }

    @Override
    public OmarDTO catzin() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://omarcatzin.free.beeceptor.com", "GET", null, null, "json", null, null));
        OmarDTO omarDTO = new OmarDTO();
        omarDTO.setStatus(json.get("Status").getAsString());
        omarDTO.setId(json.get("id").getAsInt());
        omarDTO.setName(json.get("name").getAsString());
        return omarDTO;

    }

    @Override
    public JoelDTO chavez() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://lokera.free.beeceptor.com", "GET", null, null, "json", null, null));
        JoelDTO joelDTO = new JoelDTO();
        joelDTO.setId(json.get("id").getAsInt());
        joelDTO.setName(json.get("name").getAsString());
        joelDTO.setStatus(json.get("Status").getAsString());
        return joelDTO;

    }

    // ACT 22 OCT 2021
//POST

    @Override
    public LesDTO lesPOST(LesDTO lesDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://uicabgongora.free.beeceptor.com/api/v1/LesPost", "POST", null, null, "json", lesDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doen´t exit", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doen´t exit", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status doen´t exit", HttpStatus.FORBIDDEN);
        }

        return lesDTO;
    }

    @Override
    public JoelDTO joelPOST(JoelDTO joelDTO) throws IOException {

        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://lokera.free.beeceptor.com/api/v1/ChavezPost", "POST", null, null, "json", joelDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status doesn’t exist", HttpStatus.FORBIDDEN);
        }
        return joelDTO;
    }

    @Override
    public ArturoDTO arturoPOST(ArturoDTO aranaDTO) throws  IOException{
        JsonParser asd = new JsonParser();

        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com/api/v1/MartinezPost","POST",null,null,"json",arturoDTO.toJSON(),null));
        if(json.get("identificador")==null){
            throw new BusinessException("identificador doesn't exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("Nombre")==null){
            throw new BusinessException("Nombre doesn´t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")==null){
            throw new BusinessException("status doesn´t exist", HttpStatus.FORBIDDEN);
        }
        return arturoDTO;
    }

    @Override
    public OmarDTO omarPOST(OmarDTO omarDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://omarcatzin.free.beeceptor.com/api/v1/omarpost", "POST", null, null, "json", omarDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("Status")== null){
            throw new BusinessException("Status doesn’t exist", HttpStatus.FORBIDDEN);
        }
        return omarDTO;
    }

    @Override
    public void saveMyFirstObject() {
        User user = new User();
        user.setName("Lester David");
        user.setStatus("Disponible");
        userRepository.save(user);
    }


}







