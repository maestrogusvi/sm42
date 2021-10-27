package com.ut.sm42.service.impl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.EscalanteDTO;
import com.ut.sm42.dto.MendozaDTO;
import com.ut.sm42.dto.TorreblancaDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import org.apache.http.annotation.Obsolete;
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

    @Override
    public EscalanteDTO pan() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://arrozconleche.free.beeceptor.com","GET",null,null,"json",null, null));
        EscalanteDTO pan = new EscalanteDTO();
        pan.setId(json.get("id").getAsInt());
        pan.setName(json.get("name").getAsString());
        pan.setStatus(json.get("status").getAsString());
        return pan;
    }

    @Override
    public MendozaDTO master() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://churru.free.beeceptor.com","GET",null,null,"json",null, null));
        MendozaDTO master = new MendozaDTO();
        master.setId(json.get("id").getAsInt());
        master.setName(json.get("name").getAsString());
        master.setStatus(json.get("status").getAsString());
        return master;
    }

    @Override
    public TorreblancaDTO sayayin() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://gohan.free.beeceptor.com","GET",null,null,"json",null, null));
        TorreblancaDTO sayayin = new TorreblancaDTO();
        sayayin.setId(json.get("id").getAsInt());
        sayayin.setName(json.get("name").getAsString());
        sayayin.setStatus(json.get("status").getAsString());
        return sayayin;
    }

    @Override
    public void testMendozaHttp(MendozaDTO master) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://churru.free.beeceptor.com/api/v1/postHttp","POST",null,null,"json",master.toJSON(), null));
    }

    @Override
    public void testEscalanteHttp(EscalanteDTO pan) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://arrozconleche.free.beeceptor.com/api/v1/postHttp","POST",null,null,"json",pan.toJSON(), null));
    }

    @Override
    public void testTorreblancaHttp(TorreblancaDTO sayayin) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://gohan.free.beeceptor.com/api/v1/postHttp","POST",null,null,"json",sayayin.toJSON(), null));
    }

    @Override
    public void saveMyFirstObject() {
        User user = new User();
        user.setStatus("Funcionando");
        user.setName("Carim Mendoza");
        userRepository.save(user);
    }


}
