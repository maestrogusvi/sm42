package com.ut.sm42.dto;
//primero
public class NoeliDTO {
    String status;
    String ID;
    String NAME;

    public NoeliDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status;}

    public String getID() { return ID;}

    public void setID(String ID) { this.ID = ID;}

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return "NoeliDTO{" +
                "status='" + NAME + '\'' +
                ", ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"status\":" +"\""+status+"\","+
                "\"ID\":" +"\""+ID+"\","+
                "\"NAME\":" +"\""+NAME+"\""+
                '}';
    }
}
