package com.ut.sm42.response;


public class GenericResponse {

    int code;
    String message;
    Object nada;

    public GenericResponse(int code, String message, Object nada) {
        this.code = code;
        this.message = message;
        this.nada = nada;
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

    public Object getNada() {
        return nada;
    }

    public void setNada(Object nada) {
        this.nada = nada;
    }
}