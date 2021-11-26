package com.ut.sm42.service;

import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import org.springframework.stereotype.Service;
import com.ut.sm42.dto.EscalanteDTO;

import java.io.IOException;

@Service
public interface AuthenticationService {

    String firstService();

    BeeceptorDTO testHttp() throws IOException;

    void authenticationService() throws IOException;


    //----------CARIM MENDOZA----------


    MendozaDTO master() throws IOException;

    void testMendozaHttp(MendozaDTO master) throws IOException;

    void saveMyFirstObjectMen();

    void getCell() throws IOException;


    //----------SERGIO ESCALANTE----------


    EscalanteDTO pan() throws IOException;

    void testEscalanteHttp(EscalanteDTO pan) throws IOException;

    void saveMyFirstObjectEsc();


    //----------ERICK TORRELANCA----------


    TorreblancaDTO sayayin() throws IOException;

    void testTorreblancaHttp(TorreblancaDTO sayayin) throws IOException;

    void saveMyFirstObjectTor();
}
