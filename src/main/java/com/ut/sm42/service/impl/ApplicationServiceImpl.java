package com.ut.sm42.service.impl;



import com.ut.sm42.dto.*;

import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.ApplicationService;
import com.ut.sm42.service.HttpService;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;




import java.io.IOException;

import java.util.Date;
import java.util.Optional;


@Service
public class ApplicationServiceImpl implements ApplicationService {


    @Autowired
    HttpService httpService;

    @Autowired
    UserRepository userRepository;

    @Override
    public String firstService() {
        return null;
    }

    @Override
    public BeeceptorDTO testHttp() throws IOException {
        return null;
    }

    @Override
    public MendozaDTO master() throws IOException {
        return null;
    }

    @Override
    public void testMendozaHttp(MendozaDTO master) throws IOException {

    }

    @Override
    public void saveMyFirstObjectMen() {

    }

    @Override
    public void getCell() throws IOException {

    }

    @Override
    public EscalanteDTO pan() throws IOException {
        return null;
    }

    @Override
    public void testEscalanteHttp(EscalanteDTO pan) throws IOException {

    }

    @Override
    public void saveMyFirstObjectEsc() {

    }

    @Override
    public TorreblancaDTO sayayin() throws IOException {
        return null;
    }

    @Override
    public void testTorreblancaHttp(TorreblancaDTO sayayin) throws IOException {

    }

    @Override
    public void saveMyFirstObjectTor() {

    }

    @Override
    public Object loginAuthentication(String username, String pwd) {
        return null;
    }

    @Override
    public Object createUser(User user) {
        return null;
    }


}


        //---------------CARIM MENDOZA---------------

    /*
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
    public void testMendozaHttp(MendozaDTO master) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://churru.free.beeceptor.com/api/v1/postHttp","POST",null,null,"json",master.toJSON(), null));
    }

    @Override
    public void saveMyFirstObjectMen() {
        User user = new User();
        user.setStatus("Funcionando");
        user.setName("Carim Mendoza");
        userRepository.save(user);
    }

    @Override
    public void getCell() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://graph.facebook.com/me?access_token=EAAOxQGoflu8BAHl8ZBJdZBk9UyFcxfAGpYjbkCSnOOYZCr9wCQISoIOFRA0pjCl8XAHmkOV9D2ytQleiIcnDnblIgSYf8aXGKTDSwpfjmkbUPKykUMqQz7iOESZBfUkmrUJxyMDZA2aW1iXs9wNkPZABePdvOOvhQI3dvIQUaZAENnin1g93NK2Vp2uuJmBie6MqDYNMZAJWLy2UmZBy24znTyN6QfXQYmn7SZCNvcumdE9gZDZD&fields=id,name,likes,gender,birthday","GET",null,null,"json",null, null));
        FacebookDTO desesperacion = new FacebookDTO();
    }


    //---------------SERGIO ESCALANTE---------------

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
    public void testEscalanteHttp(EscalanteDTO pan) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://arrozconleche.free.beeceptor.com/api/v1/postHttp","POST",null,null,"json",pan.toJSON(), null));
    }

    @Override
    public void saveMyFirstObjectEsc() {
        User user = new User();
        user.setStatus("Correcto");
        user.setName("Sergio Escalante");
        userRepository.save(user);
    }


    //---------------ERICK TORREBLANCA---------------

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
    public void testTorreblancaHttp(TorreblancaDTO sayayin) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://gohan.free.beeceptor.com/api/v1/postHttp","POST",null,null,"json",sayayin.toJSON(), null));
    }

    @Override
    public void saveMyFirstObjectTor() {
        User user = new User();
        user.setStatus("Bien");
        user.setName("Erick Torreblanca");
        userRepository.save(user);
    }*/

