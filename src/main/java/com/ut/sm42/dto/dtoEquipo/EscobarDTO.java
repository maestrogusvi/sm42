package com.ut.sm42.dto.dtoEquipo;

public class EscobarDTO {

    int id;
    String name;
    String Status;

    public EscobarDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "EscobarDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + Status + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":" + "\""+id+"\","+
                "\"name\":" + "\""+name+"\","+
                "\"status\":" + "\""+Status+"\""+
                '}';
    }

}

