package com.ut.sm42.dto;

public class EscalanteDTO {

    int id;
    String status;
    String name;

    public EscalanteDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EscalanteDTO{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":" +"\""+id+"\","+
                "\"status\":" +"\""+status+"\","+
                "\"name\":" +"\""+name+"\","+
                '}';
    }
}
