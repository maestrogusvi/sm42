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
    void getNews() throws IOException;
}