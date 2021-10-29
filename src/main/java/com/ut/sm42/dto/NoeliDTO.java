package com.ut.sm42.dto;
//primero
public class NoeliDTO {
    String status;
    String id;
    String name;

    public NoeliDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status;}

    public String getid() { return id;}

    public void setID(String id) { this.id = id;}

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NoeliDTO{" +
                "status='" + name + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"status\":" +"\""+status+"\","+
                "\"id\":" +"\""+id+"\","+
                "\"name\":" +"\""+name+"\""+
                '}';
    }
}
