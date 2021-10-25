package com.ut.sm42.service.impl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;


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
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com", "GET", null, null, "json", null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public LesDTO lester() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://uicabgongora.free.beeceptor.com", "GET", null, null, "json", null, null));
        LesDTO lesterDTO = new LesDTO();
        lesterDTO.setStatus(json.get("Status").getAsString());
        lesterDTO.setId(json.get("id").getAsInt());
        lesterDTO.setName(json.get("name").getAsString());
        return lesterDTO;

    }

    public MartinezDTO arturo() throws IOException {

        JsonParser amp = new JsonParser();
        JsonObject json = (JsonObject) amp.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com", "GET", null, null, "json", null, null));
        MartinezDTO polancoDTO = new MartinezDTO();
        polancoDTO.setId(json.get("Id").getAsInt());
        polancoDTO.setName(json.get("Name").getAsString());
        polancoDTO.setStatus(json.get("Status").getAsString());
        return polancoDTO;

    }

    public CatzinDTO omar() throws IOException {

        JsonParser amp = new JsonParser();
        JsonObject json = (JsonObject) amp.parse(httpService.sendRequestHttpS("https://omarcatzin.free.beeceptor.com", "GET", null, null, "json", null, null));
        CatzinDTO chaconDTO = new CatzinDTO();
        chaconDTO.setId(json.get("Id").getAsInt());
        chaconDTO.setName(json.get("Name").getAsString());
        chaconDTO.setStatus(json.get("Status").getAsString());
        return chaconDTO;

    }

    public JoelDTO joel() throws IOException {

        JsonParser par = new JsonParser();
        JsonObject json = (JsonObject) par.parse(httpService.sendRequestHttpS("https://lokera.free.beeceptor.com", "GET", null, null, "json", null, null));
        JoelDTO joelDTO = new JoelDTO();
        joelDTO.setId(json.get("Id").getAsInt());
        joelDTO.setName(json.get("Name").getAsString());
        joelDTO.setStatus(json.get("Status").getAsString());
        return joelDTO;

    }

    @Override
        public LesDTO lesPost(LesDTO lesterDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://uicabgongora.free.beeceptor.com/api/v1/LesPost", "POST", null, null, "json", lesterDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return LesDTO;

    }
    public MartinezDTO martinezPost(MartinezDTO polancoDTO) throws IOException {
        JsonParser amp = new JsonParser();
        JsonObject json = (JsonObject) amp.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com/api/v1/MartinezPost", "POST", null, null, "json", polancoDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return MartinezDTO;

    }
    public JoelDTO martinezPost(JoelDTO joelDTO) throws IOException {
        JsonParser amp = new JsonParser();
        JsonObject json = (JsonObject) amp.parse(httpService.sendRequestHttpS("https://lokera.free.beeceptor.com/api/v1/ChavezPost", "POST", null, null, "json", joelDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return JoelDTO;

    }

}