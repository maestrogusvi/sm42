package com.ut.sm42.service;

import com.ut.sm42.dto.*;
import com.ut.sm42.dto.BeeceptorDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    LesDTO david() throws IOException;
    ArturoDTO martinez() throws IOException;
    OmarDTO catzin() throws IOException;
    JoelDTO chavez() throws IOException;

    LesDTO lesPOST(LesDTO lesDTO) throws IOException;
    JoelDTO joelPOST(JoelDTO joelDTO) throws IOException;
    ArturoDTO arturoPOST(ArturoDTO arturoDTO) throws  IOException;
    OmarDTO omarPOST(OmarDTO omarDTO) throws IOException;
    void saveMyFirstObject();

}
