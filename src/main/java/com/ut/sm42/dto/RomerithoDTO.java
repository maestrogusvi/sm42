package com.ut.sm42.dto;

public class RomerithoDTO {

    String Status;
    int id;
    String name;

    public RomerithoDTO() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
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

    @Override
    public String toString() {
        return "RomerithoDTO{" +
                "status='" + name + '\'' +
                ", code='" + id + '\'' +
                ", message='" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"status\"=" + "\"" + Status + "\"," +
                "\"code\"=" + "\"" + id + "\"," +
                "\"message\"=" + "\"" + name + "\"," +
                '}';
    }
}

