package com.ut.sm42.service.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.dto.Mercadolibre.MercadoLibreDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ut.sm42.dto.Facebook.FacebookDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public MartinezDTO martinez() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com", "GET", null, null, "json", null, null));
        MartinezDTO martinezDTO = new MartinezDTO();
        martinezDTO.setId(json.get("identificador").getAsInt());
        martinezDTO.setName(json.get("Nombre").getAsString());
        martinezDTO.setStatus(json.get("status").getAsString());
        return martinezDTO;
    }

    @Override
    public CatzinDTO catzin() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://omarcatzin.free.beeceptor.com", "GET", null, null, "json", null, null));
        CatzinDTO chaconDTO = new CatzinDTO();
        chaconDTO.setStatus(json.get("Status").getAsString());
        chaconDTO.setId(json.get("id").getAsInt());
        chaconDTO.setName(json.get("name").getAsString());
        return chaconDTO;

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
    public MartinezDTO arturoPOST(MartinezDTO martinezDTO) throws  IOException{
        JsonParser asd = new JsonParser();

        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://arturo.free.beeceptor.com/api/v1/MartinezPost","POST",null,null,"json",martinezDTO.toJSON(),null));
        if(json.get("identificador")==null){
            throw new BusinessException("identificador doesn't exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("Nombre")==null){
            throw new BusinessException("Nombre doesn´t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")==null){
            throw new BusinessException("status doesn´t exist", HttpStatus.FORBIDDEN);
        }
        return martinezDTO;
    }

    @Override
    public CatzinDTO omarPOST(CatzinDTO chaconDTO) throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://omarcatzin.free.beeceptor.com/api/v1/omarpost", "POST", null, null, "json", chaconDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id doesn’t exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name doesn’ exist", HttpStatus.FORBIDDEN);
        }
        if(json.get("Status")== null){
            throw new BusinessException("Status doesn’t exist", HttpStatus.FORBIDDEN);
        }
        return chaconDTO;
    }

    @Override
    public void saveMyFirstObject() {
        User user = new User();
        user.setName("Lester David");
        user.setStatus("Disponible");
        userRepository.save(user);
    }
    public FacebookDTO fb() throws IOException {
        JsonParser asd = new JsonParser();
        JsonObject json = (JsonObject) asd.parse(httpService.sendRequestHttpS("https://graph.facebook.com/me?access_token=EAAFTeCBiV60BAJPkX4ztHNC7Dl4O7mRDQkywRtmaUwISlU2fLWvMyZBVIdYhBfIpZApZABIiO6YFDYdG0rqmbBXVGPnzrXMe8GoPN0UgW05LIXgc5oGeSkDAYsvIQnHZCKrSh68ZAroZAGMl2k2RDlsBpNJfX5k6vZBdiLgorlTu8ZBmZAfaKhfZBQr9qbyC6KJZBr1l96WwZApHp9VDuR7sbI2Ao15nfPeRGjsKShZApcrjpCwZDZD&fields=id,name,likes,gender,birthday", "GET", null, null, "json", null, null));
        FacebookDTO FacebookDTO = new FacebookDTO();
        FacebookDTO.setId(json.get("id").getAsInt());
        FacebookDTO.setName(json.get("name").getAsString());
        FacebookDTO.setLikes(json.get("likes").getAsString());
        FacebookDTO.setGender(json.get("gender").getAsString());
        FacebookDTO.setBirthday(json.get("birthday").getAsInt());
        return FacebookDTO;
    }

    @Override
    public void getQyA() throws IOException{
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://api.mercadolibre.com/questions/search?item=MLM1321810887", "GET", null, null, "json", null, null));
        MercadoLibreDTO mercadoLibreDTO = new MercadoLibreDTO();
    }
    @Override
    public YouTubeMergeDTO mergeYoutube() throws IOException {
        YouTubeMergeDTO yd = new YouTubeMergeDTO();
        JsonParser pr = new JsonParser();
        JsonObject json = (JsonObject) pr.parse(httpService.sendRequestHttpS("https://www.googleapis.com/youtube/v3/videos?id=FUJDBXaKBcA&key=AIzaSyC-XbXXpngMiW6CFfPUsoZvQpcuki6nYvI&part=snippet","GET",null,null,"json",null, null));
        yd.setKind(json.get("kind").getAsString());
        yd.setEtag(json.get("etag").getAsString());
        JsonArray listas = json.getAsJsonArray("items");
        List<YouTubeItemsDTO> youtubeDTOList = new ArrayList<>();
        for(int x = 0 ; x > listas.size(); x++){
            JsonObject job1 = listas.get(x).getAsJsonObject();
            YouTubeItemsDTO y1 = new YouTubeItemsDTO();
            y1.setKind(job1.get("kind").getAsString());
            y1.setEtag(job1.get("etag").getAsString());
            y1.setId(job1.get("id").getAsString());
            YouTubeSnippetDTO snippetDTO = new YouTubeSnippetDTO();
            JsonObject snippetobject = job1.get("snippet").getAsJsonObject();
            snippetDTO.setPublishedAt(snippetobject.get("publishedAt").getAsString());
            snippetDTO.setChannelId(snippetobject.get("channelId").getAsString());
            snippetDTO.setTitle(snippetobject.get("title").getAsString());
            snippetDTO.setDescription(snippetobject.get("description").getAsString());
            y1.setSnippetDTO(snippetDTO);
            youtubeDTOList.add(y1);
        }
        yd.setYoutubelista(youtubeDTOList);
        return yd;
    }

}








