package com.ut.sm42.dto.MercadoLibre;

public class MercadoLibreAnswerDTO {
    String text;
    String status;
    String date_created;

    public MercadoLibreAnswerDTO() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
}
