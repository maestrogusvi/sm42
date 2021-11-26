package com.ut.sm42.response;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.service.AuthenticationService;
public class GenericResponse {

    int code;
    String message;
    Object prueba;

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

    public Object getPrueba() {
        return prueba;
    }

    public void setPrueba(Object prueba) {
        this.prueba = prueba;
    }

    public  GenericResponse(int code, String message, Object prueba) {
    this.code = code;
    this.message = message;
    this.prueba = prueba;


}
    }