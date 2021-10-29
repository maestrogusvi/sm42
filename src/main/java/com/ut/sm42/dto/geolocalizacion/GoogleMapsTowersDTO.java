package com.ut.sm42.dto.geolocalizacion;

public class GoogleMapsTowersDTO {

    int homeMobileCountryCode;
    int homeMobileNetworkCode;
    String radioType;
    String carrier;
    boolean considerIp;
    String cellTowers; //Array

    public GoogleMapsTowersDTO() {
    }

    public int getHomeMobileCountryCode() {
        return homeMobileCountryCode;
    }

    public void setHomeMobileCountryCode(int homeMobileCountryCode) {
        this.homeMobileCountryCode = homeMobileCountryCode;
    }

    public int getHomeMobileNetworkCode() {
        return homeMobileNetworkCode;
    }

    public void setHomeMobileNetworkCode(int homeMobileNetworkCode) {
        this.homeMobileNetworkCode = homeMobileNetworkCode;
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public boolean isConsiderIp() {
        return considerIp;
    }

    public void setConsiderIp(boolean considerIp) {
        this.considerIp = considerIp;
    }

    public String getCellTowers() {
        return cellTowers;
    }

    public void setCellTowers(String cellTowers) {
        this.cellTowers = cellTowers;
    }
}
