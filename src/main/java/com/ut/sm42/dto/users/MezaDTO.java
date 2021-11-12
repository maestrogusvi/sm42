package com.ut.sm42.dto.users;

public class MezaDTO {
    int id;
    String name;
    String status;

    public MezaDTO() {
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

    @Override
    public String toString() {
        return "MezaDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public String toJSON() {
        return "{" +
                "\"id\":" +"\""+id+"\","+
                "\"name\":" +"\""+name+"\","+
                "\"status\":" +"\""+status+"\""+
                '}';
    }

}
