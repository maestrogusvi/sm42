package com.ut.sm42.service;

import com.ut.sm42.dto.*;
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

    CejaDTO cejaPOST(CejaDTO cejaDTO) throws IOException;

}
