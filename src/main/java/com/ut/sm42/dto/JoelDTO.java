package com.ut.sm42.dto;

public class JoelDTO {

    int id;
    String name;
    String status;



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

    public void setStatus(String Status) {
        this.status = status;
    }

    public String toString() {
        return "JoelDTO{" +
                "id=" + id + '\'' +
                ",status=" + status + '\'' +
                ",name=" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "JoelDTO{" +
                "\"id\":" + "\""+id+"\","+
                "\"status\":" + "\""+status+"\","+
                "\"name\":" + "\""+name+"\""+
                '}';
    }
}
