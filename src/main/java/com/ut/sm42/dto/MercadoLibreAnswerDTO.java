package com.ut.sm42.dto;

public class MercadoLibreAnswerDTO {
    String text;
    Integer status;
    String date_created;

    public MercadoLibreAnswerDTO() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
}
