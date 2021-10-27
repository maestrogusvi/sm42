package com.ut.sm42.model;
import  javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    String status;
    String name;

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

    public User(){

    }
}
