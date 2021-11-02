package com.ut.sm42.dto.redes_sociales;

import java.util.List;

public class FacebookDTO {

    FacebookUnoDTO facebookUnoDTO;
    List<FacebookDosDTO> facebookDosDTOS;

    public FacebookDTO() {
    }

    public FacebookUnoDTO getFacebookUnoDTO() {
        return facebookUnoDTO;
    }

    public void setFacebookUnoDTO(FacebookUnoDTO facebookUnoDTO) {
        this.facebookUnoDTO = facebookUnoDTO;
    }

    public List<FacebookDosDTO> getFacebookDosDTOS() {
        return facebookDosDTOS;
    }

    public void setFacebookDosDTOS(List<FacebookDosDTO> facebookDosDTOS) {
        this.facebookDosDTOS = facebookDosDTOS;
    }
}
