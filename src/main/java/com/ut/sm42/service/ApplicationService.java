package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public RomerithoDTO sebastiane() throws IOException {
        JsonParser parcero = new JsonParser();
        JsonObject json = (JsonObject) parcero.parse(httpService.sendRequestHttpS("https://romar.free.beeceptor.com","GET",null,null,"json",null, null));
        RomerithoDTO htqDTO = new RomerithoDTO();
        htqDTO.setId(json.get("Id").getAsInt());
        htqDTO.setName(json.get("Name").getAsString());
        htqDTO.setStatus(json.get("status").getAsString());
        return htqDTO;
    }

    public MartinDTO erick() throws IOException {
        JsonParser crack = new JsonParser();
        JsonObject json = (JsonObject) crack.parse(httpService.sendRequestHttpS("https://erickr.free.beeceptor.com","GET",null,null,"json",null, null));
        MartinDTO ersDTO = new MartinDTO();
        ersDTO.setId(json.get("Id").getAsInt());
        ersDTO.setName(json.get("Name").getAsString());
        ersDTO.setStatus(json.get("status").getAsString());
        return ersDTO;
    }
    public TecDTO jesus() throws IOException {
        JsonParser am= new JsonParser();
        JsonObject json = (JsonObject) am.parse(httpService.sendRequestHttpS("https://yisus.free.beeceptor.com","GET",null,null,"json",null, null));
        TecDTO yisusDTO = new TecDTO();
        yisusDTO.setId(json.get("Id").getAsInt());
        yisusDTO.setName(json.get("Name").getAsString());
        yisusDTO.setStatus(json.get("status").getAsString());
        return yisusDTO;
    }
    public RamirezDTO OscarL() throws IOException {
        JsonParser parcera = new JsonParser();
        JsonObject json = (JsonObject) parcera.parse(httpService.sendRequestHttpS("https://lemons.free.beeceptor.com","GET",null,null,"json",null, null));
        RamirezDTO lemon = new RamirezDTO();
        lemon.setId(json.get("Id").getAsInt());
        lemon.setName(json.get("Name").getAsString());
        lemon.setStatus(json.get("status").getAsString());
        return lemon;
    }
}

    public HuchimDTO diego () throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://huchim.free.beeceptor.com", "GET",null,null,"json",null, null));
        HuchimDTO diegoDTO = new HuchimDTO();
        diegoDTO.setId(json.get("id").getAsInt());
        diegoDTO.setName(json.get("name").getAsString());
        diegoDTO.setStatus(json.get("Status").getAsString());
        return diegoDTO;

    }

    public AranaDTO ivan () throws IOException{
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arana.free.beeceptor.com", "GET", null,null,"json", null,null));
        AranaDTO ivanDTO = new AranaDTO();
        ivanDTO.setIdentificador(json.get("identificador").getAsInt());
        ivanDTO.setNombre(json.get("Nombre").getAsString());
        ivanDTO.setStatus(json.get("status").getAsString());
        return ivanDTO;
    }

    public EscobarDTO cruz () throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://eduardoescobar.free.beeceptor.com/", "GET", null, null, "json", null, null));
        EscobarDTO cruzDTO = new EscobarDTO();
        cruzDTO.setStatus(json.get("Status").getAsString());
        cruzDTO.setId(json.get("id").getAsInt());
        cruzDTO.setName(json.get("name").getAsString());
        return cruzDTO;

    }

        public LairDTO carlos () throws IOException {
            JsonParser asd = new JsonParser();
            JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://carlos.free.beeceptor.com", "GET",null,null,"json",null, null));
            LairDTO carlosDTO = new LairDTO();
            carlosDTO.setId(json.get("id").getAsInt());
            carlosDTO.setName(json.get("name").getAsString());
            carlosDTO.setStatus(json.get("Status").getAsString());
            return carlosDTO;

        }


    }