package com.ut.sm42.dto.geolocalizacion;

import java.util.List;

public class GoogleMapsDTO {

    GoogleMapsCellDTO googleMapsCellDTO;
    List <GoogleMapsTowersDTO> googleMapsTowersDTOS;

    public GoogleMapsDTO() {
    }

    public GoogleMapsCellDTO getGoogleMapsCellDTO() {
        return googleMapsCellDTO;
    }

    public void setGoogleMapsCellDTO(GoogleMapsCellDTO googleMapsCellDTO) {
        this.googleMapsCellDTO = googleMapsCellDTO;
    }

    public List<GoogleMapsTowersDTO> getGoogleMapsTowersDTOS() {
        return googleMapsTowersDTOS;
    }

    public void setGoogleMapsTowersDTOS(List<GoogleMapsTowersDTO> googleMapsTowersDTOS) {
        this.googleMapsTowersDTOS = googleMapsTowersDTOS;
    }
}
