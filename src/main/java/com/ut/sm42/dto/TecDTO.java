package com.ut.sm42.dto;
public class TecDTO {
    String Status;
    int id;
    String name;

    public TecDTO() {
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

    @Override
    public String toString() {
        return "TecDTO{" +
                "Status='" + Status + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String TecDTO() {
        return "{" +
                "\"status\"=" + "\"" + Status + "\"," +
                "\"code\"=" + "\"" + id + "\"," +
                "\"message\"=" + "\"" + name + "\"," +
                '}';

    }
}