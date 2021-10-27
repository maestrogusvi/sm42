package com.ut.sm42.service;


import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public interface ApplicationService {


    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    RomerithoDTO sebastian() throws IOException;
    MartinDTO erick() throws IOException;
    TecDTO jesus() throws IOException;
    RamirezDTO oscarl() throws IOException;

    //POST
    RomerithoDTO romeroPostHttp(RomerithoDTO romerithoDTO) throws IOException;
    TecDTO jlPostHttp(TecDTO tecDTO) throws IOException;
    MartinDTO erickPostHttp(MartinDTO martinDTO) throws IOException;
    RamirezDTO oscarlPostHttp(RamirezDTO ramirezDTO) throws IOException;
}

