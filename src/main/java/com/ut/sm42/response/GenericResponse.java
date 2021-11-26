package com.ut.sm42.response;

import com.nimbusds.jose.shaded.json.JSONObject;

public class GenericResponse {

    int code;
    String message;

    public GenericResponse(int code, String message, JSONObject jsonObject) {
        this.code = code;
        this.message = message;
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
}






