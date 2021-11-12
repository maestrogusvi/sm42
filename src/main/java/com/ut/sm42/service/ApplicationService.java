package com.ut.sm42.service;

import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.dtoFacebook.FacebookDTO;
import com.ut.sm42.dto.dtoTwitch.GameDTO;
import com.ut.sm42.dto.dtoTwitch.TwitchDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    HuchimDTO diego() throws IOException;
    AranaDTO ivan() throws IOException;
    EscobarDTO cruz() throws IOException;
    LairDTO carlos() throws IOException;

    HuchimDTO huchimPOST(HuchimDTO huchimDTO) throws IOException;
    LairDTO lairPOST(LairDTO lairDTO) throws IOException;
    AranaDTO aranaPOST(AranaDTO aranaDTO) throws  IOException;
    EscobarDTO escobarPOST(EscobarDTO escobarDTO) throws IOException;
    void saveMyFirstObject();
    //MediaStack
    void getNews() throws IOException;
    //Facebook
    FacebookDTO getfacebook() throws IOException;
    //Twitch
    GameDTO getGame () throws IOException;
}