package com.ut.sm42.service;

import com.ut.sm42.dto.*;
import com.ut.sm42.dto.MercadoLibre.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {
    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    NoeliDTO noe() throws  IOException;
    MezaDTO aldo() throws IOException;
    FragosoDTO david() throws IOException;
    CejaDTO cesar()throws IOException;
    //POST
    NoeliDTO noepostHttp(NoeliDTO noeliDTO) throws  IOException;
    MezaDTO mezaPOST(MezaDTO mezaDTO) throws IOException;
    CejaDTO cejaPOST(CejaDTO cejaDTO) throws IOException;
    FragosoDTO fragosoPOST(FragosoDTO fragosoDTO) throws IOException;
    void saveMyFirstObject();
    void myObjectNoe();
    void saveMyFirsfObjectFragoso();
    MercadoLibreDTO getQyA() throws IOException;
    YouTubeMergeDTO mergeYoutube(YouTubeMergeDTO y1) throws IOException;
}
