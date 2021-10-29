package com.ut.sm42.dto.MercadoLibre;


import java.util.List;

public class MercadoLibreDTO {
    Integer total;
    Integer limit;
    List<MercadoLibreQuestionsDTO> mercadoLibreQuestionsDTO;

    public MercadoLibreDTO() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<MercadoLibreQuestionsDTO> getMercadoLibreQuestionsDTO() {
        return mercadoLibreQuestionsDTO;
    }

    public void setMercadoLibreQuestionsDTO(List<MercadoLibreQuestionsDTO> mercadoLibreQuestionsDTO) {
        this.mercadoLibreQuestionsDTO = mercadoLibreQuestionsDTO;
    }
}
