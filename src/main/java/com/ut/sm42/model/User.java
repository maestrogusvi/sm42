package com.ut.sm42.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    int id;
    String name;
    String status;


    public User(){
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

}
