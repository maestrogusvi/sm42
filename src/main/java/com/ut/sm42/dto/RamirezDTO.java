package com.ut.sm42.dto;

public class RamirezDTO {
    int id;
    String name;
    String status;

    public RamirezDTO() {

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
        return "RamirezDTO{" +
                "status=" + name +
                ", code='" + id + '\'' +
                ", message='" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"status\"=" + "\"" + name + "\"," +
                "\"code\"=" + "\"" + id + "\"," +
                "\"message\"=" + "\"" + name + "\"," +
                '}';
    }
}
