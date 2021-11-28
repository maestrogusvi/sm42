package com.ut.sm42.response;


public class GenericResponse {

    int code;
    String message;
    Object vacio;

    public GenericResponse(int code, String message, Object vacio) {
        this.code = code;
        this.message = message;
        this.vacio = vacio;
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
        return vacio;
    }

    public void setNada(Object nada) {
        this.vacio = vacio;
    }
}