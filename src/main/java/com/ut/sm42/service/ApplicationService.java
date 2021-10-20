package com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.BeeceptorDTO;
import com.ut.sm42.dto.CamaraDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService  {



    String firstService();
     BeeceptorDTO testHttp() throws IOException;
     CamaraDTO gerardo () throws IOException;


}
