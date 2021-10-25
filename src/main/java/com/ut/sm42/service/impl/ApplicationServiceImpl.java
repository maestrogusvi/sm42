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
    public String firstService(){
        return "service";
    }


    @Override
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
    public NoeliDTO noe() throws  IOException{
        JsonParser par = new JsonParser();
        JsonObject json = (JsonObject) par.parse(httpService.sendRequestHttpS("https://equiponoe.free.beeceptor.com","GET",null,null,"json",null, null));
        NoeliDTO noeDTO = new NoeliDTO();
        noeDTO.setStatus(json.get("status").getAsString());
        noeDTO.setID(json.get("ID").getAsString());
        noeDTO.setNAME(json.get("NAME").getAsString());
        return noeDTO;
    }

    public MezaDTO aldo() throws  IOException {
        JsonParser aar = new JsonParser();
        JsonObject json = (JsonObject) aar.parse(httpService.sendRequestHttpS("https://aldodto.free.beeceptor.com", "GET", null, null, "json", null, null));
        MezaDTO aldoDTO = new MezaDTO();
        aldoDTO.setStatus(json.get("status").getAsString());
        aldoDTO.setId(json.get("id").getAsInt());
        aldoDTO.setName(json.get("name").getAsString());
        return aldoDTO;
    }

    public FragosoDTO david() throws  IOException {
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://davidendpoint.free.beeceptor.com", "GET", null, null, "json", null, null));
        FragosoDTO davidDTO = new FragosoDTO();
        davidDTO.setStatus(json.get("status").getAsString());
        davidDTO.setId(json.get("id").getAsInt());
        davidDTO.setName(json.get("name").getAsString());
        return davidDTO;
    }
    public CejaDTO cesar() throws  IOException {
        JsonParser ahhh = new JsonParser();
        JsonObject json = (JsonObject) ahhh.parse(httpService.sendRequestHttpS("https://cesar.free.beeceptor.com", "GET", null, null, "json", null, null));
        CejaDTO cesarDTO = new CejaDTO();
        cesarDTO.setStatus(json.get("status").getAsString());
        cesarDTO.setId(json.get("id").getAsInt());
        cesarDTO.setName(json.get("name").getAsString());
        return cesarDTO;
    }

    //POST
    @Override
    public NoeliDTO noepostHttp(NoeliDTO noeliDTO) throws IOException {
        JsonParser pri = new JsonParser();
        JsonObject json = (JsonObject) pri.parse(httpService.sendRequestHttpS("https://equiponoe.free.beeceptor.com/api/v1/noepostHttp","POST",null,null,"json",noeliDTO.toJSON(), null));
        if(json.get("status")== null){
            throw new BusinessException("status doesn´t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("NAME")== null){
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if(json.get("ID")== null){
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return noeliDTO;
    }

    @Override
    public CejaDTO cejaPOST(CejaDTO cejaDTO) throws IOException {
        JsonParser ahhh = new JsonParser();
        JsonObject json = (JsonObject) ahhh.parse(httpService.sendRequestHttpS("https://prueba5.free.beeceptor.com/api/v1/postcesar", "POST", null, null, "json", cejaDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id was missing", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name was missing", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status was missing", HttpStatus.FORBIDDEN);
        }
        return cejaDTO;
    }

    @Override
    public FragosoDTO fragosoPOST(FragosoDTO fragosoDTO) throws IOException {
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://davidendpoint.free.beeceptor.com/api/v1/fragosoPOST", "POST", null, null, "json", fragosoDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return fragosoDTO;
    }
}
