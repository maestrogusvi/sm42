package com.ut.sm42.service.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.facebook.FacebookDTO;
import com.ut.sm42.dto.mercadolibre.MercadoLibreAnswerDTO;
import com.ut.sm42.dto.mercadolibre.MercadoLibreDTO;
import com.ut.sm42.dto.mercadolibre.MercadoLibreQuestionsDTO;
import com.ut.sm42.dto.twitch.TwitchStreamsDTO;
import com.ut.sm42.dto.users.*;
import com.ut.sm42.dto.youtube.YouTubeItemsDTO;
import com.ut.sm42.dto.youtube.YouTubeMergeDTO;
import com.ut.sm42.dto.youtube.YouTubeSnippetDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
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
        noeDTO.setID(json.get("id").getAsString());
        noeDTO.setname(json.get("name").getAsString());
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
        if(json.get("name")== null){
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if(json.get("id")== null){
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
    @Override
    public MezaDTO mezaPOST(MezaDTO mezaDTO) throws IOException {
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://davidendpoint.free.beeceptor.com/api/v1/mezaPOST", "POST", null, null, "json", mezaDTO.toJSON(), null));
        if(json.get("id")== null){
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if(json.get("name")== null){
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if(json.get("status")== null){
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return mezaDTO;
    }
    @Override
    public void saveMyFirstObject(){
        User user = new User();
        user.setName("Cesar Ceja");
        userRepository.save(user);
    }
    public  void myObjectNoe(){
        User usury = new  User();
        usury.setName("Noeli");
        userRepository.save(usury);
    }

    @Override
    public void saveMyFirsfObjectFragoso() {
        User fragosito = new User();
        fragosito.setName("Fragoso Madera");
        userRepository.save(fragosito);
    }

    @Override
    public void myObjectMeza() {
        User aldito = new User();
        aldito.setName("Meza Moreno");
        userRepository.save(aldito);
    }

    @Override
    public MercadoLibreDTO getQyA() throws IOException {
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS("https://api.mercadolibre.com/questions/search?item=MLM1321810887", "GET", null, null, "json", null, null));
        MercadoLibreDTO ml = new MercadoLibreDTO();
        ml.setTotal(json.get("total").getAsInt());
        ml.setLimit(json.get("limit").getAsInt());
        JsonArray listas = json.getAsJsonArray("questions");
        List<MercadoLibreQuestionsDTO> questionsDTOList = new ArrayList<>();
        for(int x = 0 ; x > listas.size(); x++){
            JsonObject job1 = listas.get(x).getAsJsonObject();
            MercadoLibreQuestionsDTO pan = new MercadoLibreQuestionsDTO();
            pan.setDate_created(job1.get("data_created").getAsString());
            pan.setItem_id(job1.get("item_id").getAsString());
            pan.setSeller_id(job1.get("seller_id").getAsInt());
            pan.setStatus(job1.get("status").getAsString());
            pan.setText(job1.get("text").getAsString());
            pan.setId(job1.get("id").getAsInt());
            MercadoLibreAnswerDTO answersDTO = new MercadoLibreAnswerDTO();
            JsonObject answerobject = job1.get("answer").getAsJsonObject();
            answersDTO.setStatus(answerobject.get("status").getAsString());
            answersDTO.setDate_created(answerobject.get("date_created").getAsString());
            answersDTO.setText(answerobject.get("text").getAsString());
            pan.setMercadoLibreAnswerDTO(answersDTO);
            questionsDTOList.add(pan);
        }
        ml.setMercadoLibreQuestionsDTO(questionsDTOList);
        return ml;
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

    @Override
    public FacebookDTO getInfo(FacebookDTO info) throws IOException {
        //FacebookDTO info = new FacebookDTO();
        String token = "EAAIaZBt4w3vkBAK0ZBfhvf6I6wquowu5bYMlLkuaaOB422ZB1HmbFOQdE8ywZAFZCfHCYtZCYNGRefPZCbZBLfDc3FoN6RoGg1mZC2jHT2jXVvbZBkLbSYLYwZA3d8kqJhaW3b09JZAkVsLCZAGl0vcvRqtIhpPkVL0F9t3CWybjlxtuz5DQNgWHEeEIWibM5hQltytDQRZBUY6pKZAFbTTpqZArG2jjgqZBbWwS0UIZAZBTsUiyfADAvLZBpuoP0vxn";
        String url = "https://graph.facebook.com/me?fields=id,name,name_format,short_name,last_name&access_token=" + token;
        JsonParser por = new JsonParser();
        JsonObject json = (JsonObject) por.parse(httpService.sendRequestHttpS(url,"GET",null,null,"json",null, null));
        info.setId(json.get("id").getAsString());
        info.setName(json.get("name").getAsString());
        if(json.get("short_name")!=null){
            info.setShort_name(json.get("short_name").getAsString());
        }

        return info;
    }
    //Header necesario para el request de la api.
    @Override
    public TwitchStreamsDTO getStream(TwitchStreamsDTO stream) throws IOException {
        String twitch_url = "https://api.twitch.tv/helix/streams?first=1";
        JsonParser twitchpor = new JsonParser();
        JsonObject json = (JsonObject) twitchpor.parse(httpService.sendRequestHttpS(twitch_url,"GET",null,null,"json",null, null));
        stream.setUser_name(json.get("user_id").getAsString());
        stream.setGame_name(json.get("game_name").getAsString());
        stream.setViewer_count(json.get("viewer_count").getAsString());

        return stream;
    }

}
