package com.ut.sm42.dto.MercadoLibre;

public class MercadoLibreQuestionsDTO {
    String date_created;
    String item_id;
    Integer seller_id;
    String status;
    String text;
    Integer id;
    MercadoLibreAnswerDTO mercadoLibreAnswerDTO;

    public MercadoLibreQuestionsDTO() {
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public Integer getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MercadoLibreAnswerDTO getMercadoLibreAnswerDTO() {
        return mercadoLibreAnswerDTO;
    }

    public void setMercadoLibreAnswerDTO(MercadoLibreAnswerDTO mercadoLibreAnswerDTO) {
        this.mercadoLibreAnswerDTO = mercadoLibreAnswerDTO;
    }
}
