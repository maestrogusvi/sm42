package com.ut.sm42.dto;

public class MartinDTO {

    Varchar Status;
    int id;
    Varchar name;

    public MartinDTO() {
    }

    public Varchar getStatus() {
        return Status;
    }

    public void setStatus(Varchar status) {
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Varchar getName() {
        return name;
    }

    public void setName(Varchar name) {
        this.name = name;
    }
}
