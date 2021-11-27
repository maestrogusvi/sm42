package com.ut.sm42.model;

public class Respuesta {
    int code;
    String message;
    Object request;

    public Respuesta(int code, String message, Object request) {
        this.code = code;
        this.message = message;
        this.request = request;
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

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }
}
