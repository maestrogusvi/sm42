package com.ut.sm42.service;


import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.Facebook.FacebookDTO;
import org.springframework.stereotype.Service;
import java.io.IOException;
import com.ut.sm42.dto.Spotify.*;

@Service
public interface ApplicationService {


    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    RomerithoDTO sebastian() throws IOException;
    MartinDTO erick() throws IOException;
    TecDTO jesus() throws IOException;
    RamirezDTO oscarl() throws IOException;

    //POSTHTTP
    RomerithoDTO romeroPostHttp(RomerithoDTO romerithoDTO) throws IOException;
    TecDTO jlPostHttp(TecDTO tecDTO) throws IOException;
    MartinDTO erickPostHttp(MartinDTO martinDTO) throws IOException;
    RamirezDTO oscarlPostHttp(RamirezDTO ramirezDTO) throws IOException;
    void  saveMyFirstObject();

    //API's
    SpotifyDTO online(SpotifyDTO onlineDTO) throws IOException;
    FacebookDTO redes(FacebookDTO redesDTO) throws IOException;

}

