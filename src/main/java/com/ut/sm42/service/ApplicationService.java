package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ut.sm42.dto.EscalanteDTO;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();

    BeeceptorDTO testHttp() throws IOException;

    EscalanteDTO pan() throws IOException;

    MendozaDTO master() throws IOException;

    TorreblancaDTO sayayin() throws IOException;

    void testMendozaHttp(MendozaDTO master) throws IOException;

    void testEscalanteHttp(EscalanteDTO pan) throws IOException;

    void testTorreblancaHttp(TorreblancaDTO sayayin) throws IOException;

    void saveMyFirstObjectMen();

    void saveMyFirstObjectEsc();

    void saveMyFirstObjectTor();
}
