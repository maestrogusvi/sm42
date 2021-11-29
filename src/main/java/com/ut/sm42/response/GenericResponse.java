package com.ut.sm42.response;

public class GenericResponse {

    int code;
    String message;
    Object gere;

    public GenericResponse(int code, String message, Object gere) {
        this.code = code;
        this.message = message;
        this.gere = gere;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getGere() {
        return gere;
    }
    public void setGere(Object gere) {
        this.gere = gere;
    }
}