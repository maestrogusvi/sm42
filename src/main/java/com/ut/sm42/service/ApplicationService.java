package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ut.sm42.dto.*;
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
}

