package sm42.src.main.java.com.ut.sm42.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm42.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

   String firstService();
   BeeceptorDTO testHttp() throws IOException;
   LesDTO lester() throws IOException;
   MartinezDTO arturo() throws IOException;
   CatzinDTO omar() throws IOException;
   JoelDTO joel() throws IOException;

   // post

   LesDTO lesPost(LesDTO lesterDTO) throws IOException;
   MartinezDTO martinezPost(MartinezDTO polancoDTO) throws IOException;
   JoelDTO chavezPost(JoelDTO joelDTO) throws IOException;
   CatzinDTO omarPost(CatzinDTO chaconDTO) throws IOException;

}


