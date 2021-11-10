package com.ut.sm42.service.impl;



import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.dto.Facebook.FacebookDTO;
import com.ut.sm42.dto.MercadoLibre.MercadoLibreDTO;
import com.ut.sm42.dto.Spotify.SpotifyDTO;
import com.ut.sm42.dto.Twitch.TwitchDTO;
import com.ut.sm42.dto.Twitch.TwitchGameDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;


import java.io.IOException;
import java.util.ArrayList;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    final
    UserRepository userRepository;
    private Object streamingDTO;

    public ApplicationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
    //PosHttp
    @Override
    public RomerithoDTO romeroPostHttp(RomerithoDTO romerithoDTO) throws IOException {
        JsonParser abc = new JsonParser();
        JsonObject json = (JsonObject) abc.parse(httpService.sendRequestHttpS("https://romar.free.beeceptor.com/api/v1/romeropostHttp", "POST", null, null, "json", romerithoDTO.toJSON(), null));
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
        JsonObject json = (JsonObject) ame.parse(httpService.sendRequestHttpS("https://yisus.free.beeceptor.com/api/v1/jlpostHttp", "POST", null, null, "json", tecDTO.toJSON(), null));
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

    public RamirezDTO oscarlPostHttp(RamirezDTO ramirezDTO) throws IOException {
        JsonParser parsera = new JsonParser();
        JsonObject json = (JsonObject) parsera.parse(httpService.sendRequestHttpS("https://lemon.free.beeceptor.com/api/v1/oscarlpostHttp", "POST", null, null, "json", ramirezDTO.toJSON(), null));
        if (json.get("id") == null) {
            throw new BusinessException("id no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("name") == null) {
            throw new BusinessException("name no found", HttpStatus.FORBIDDEN);
        }
        if (json.get("status") == null) {
            throw new BusinessException("status no found", HttpStatus.FORBIDDEN);
        }
        return ramirezDTO;
    }

    public MartinDTO erickPostHttp(MartinDTO martinDTO) throws IOException {
        JsonParser uno = new JsonParser();
        JsonObject json = (JsonObject) uno.parse(httpService.sendRequestHttpS("https://erickr.free.beeceptor.com/api/v1/erickpostHttp", "POST", null, null, "json", martinDTO.toJSON(), null));
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

    @Override
    public void saveMyFirstObject() {
        User user = new User();
        user.setName("Sebastian Romero");
        user.setStatus("Funciona");
        userRepository.save(user);

    }

    @Override
    public SpotifyDTO online(SpotifyDTO onlineDTO) throws IOException {
        JsonParser a= new JsonParser();
        JsonObject json = (JsonObject) a.parse(httpService.sendRequestHttpS("https://api.spotify.com/v1/albums/43mAHKPa4iB2er88lxD9Q8/tracks?market=ES", "GET", null, null, "json", null, null));
        onlineDTO.setHref(json.get("href").getAsString());
        onlineDTO.setLimit(json.get("limit").getAsInt());
        onlineDTO.setNext(json.get("next").getAsString());
        onlineDTO.setOffset(json.get("offset").getAsInt());
        onlineDTO.setPrevious(json.get("previous").getAsString());
        onlineDTO.setTotal(json.get("total").getAsInt());
        return onlineDTO;
    }
    @Override
    public FacebookDTO redesociales (FacebookDTO redesocialesDTO) throws IOException {
        JsonParser b = new JsonParser();
        JsonObject json = (JsonObject) b.parse(httpService.sendRequestHttpS("https://graph.facebook.com/me?access_token=EAAFdTDZBlZAasBAL1m10M3avSW9DwIZCGxcFiU5Kh1ynkPonZAZBw3xxDzTXr5JnW5tzwyfZBoskDGnA6NjN0cDGrZCqEqaRqR266953jSZA4m7gLAfmNFNL3TDVbZBEJykdvul8hkCtTUyvsdnk0Iy1lzyOzA29lOcBG1FQ3xfBtPO1TmHd4aAyka0USjgklQHW5HqM2hyjFwohQmDBWMkMGkNZCPqZAL24ZBeHOgDf8HWvxgZDZD&fields=id,name,likes,gender,birthday ", "GET", null, null, "json", null, null));
        FacebookDTO FacebookDTO = new FacebookDTO();
        FacebookDTO.setId(json.get("id").getAsInt());
        FacebookDTO.setName(json.get("name").getAsString());
        FacebookDTO.setLikes(json.get("likes").getAsString());
        FacebookDTO.setBirthday(json.get("birthday").getAsInt());
        return redesocialesDTO;
    }
    @Override
    public MercadoLibreDTO e_commers (MercadoLibreDTO e_commersDTO) throws IOException {
        JsonParser c= new JsonParser();
        JsonObject json = (JsonObject) c.parse(httpService.sendRequestHttpS("https://api.mercadolibre.com/sites/MCO/search?q=xbox", "GET", null, null, "json", null, null));
        e_commersDTO.setId(json.get("id").getAsInt());
        e_commersDTO.setSite_id(json.get("site_id").getAsString());
        e_commersDTO.setTittle(json.get("tittle").getAsString());
        e_commersDTO.setQuery(json.get("query").getAsString());
        e_commersDTO.setPaging(json.get("paging").getAsString());
        e_commersDTO.setTotal(json.get("total").getAsInt());
        return e_commersDTO;
    }

    @Override
    public TwitchGameDTO streaming (TwitchGameDTO streamingDTO) throws IOException {
        JsonParser d= new JsonParser();
        JsonObject json = (JsonObject) d.parse(httpService.sendRequestHttpS("https://api.twitch.tv/helix/streams/?client-id=b7vusn4u9jjl4lc2l0w6fv2yrjqy4k&client_secret=qrzq3fawqv6efne3f0b0eomvv7ulmo&grant_type=client_credentials&access_token=kvt2ilqsyexthabqju0fung8hp3a96", "GET", null, null, "json", null, null));
        streamingDTO.setId(json.get("id").getAsInt());
        streamingDTO.setUser_id(json.get("user_id").getAsString());
        streamingDTO.setUser_login(json.get("user_login").getAsString());
        streamingDTO.setUser_name(json.get("user_name").getAsString());
        streamingDTO.setType(json.get("type").getAsString());
        return streamingDTO;

    }
}