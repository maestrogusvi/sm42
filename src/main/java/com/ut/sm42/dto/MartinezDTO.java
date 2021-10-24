package com.ut.sm42.dto;

public class MartinezDTO {
    int id;
    String name;
    String status;

    public MartinezDTO() {
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "MartinezDTO{" +
                "id=" + id + '\'' +
                ",status=" + status + '\'' +
                ",name=" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "MartinezDTO{" +
                "\"id\":" + "\""+id+"\","+
                "\"status\":" + "\""+status+"\","+
                "\"name\":" + "\""+name+"\""+
                '}';
    }
}
//Hola

