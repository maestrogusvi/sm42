package com.ut.sm42.dto;

public class BeeceptorDTO {

    String status;
    String code;
    String message;
    ExampleDTO exampleDTO;

    public BeeceptorDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BeeceptorDTO{" +
                "status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"status\":" +"\""+status+"\","+
                "\"code\":" +"\""+code+"\","+
                "\"message\":" +"\""+message+"\""+
                '}';
    }
}
