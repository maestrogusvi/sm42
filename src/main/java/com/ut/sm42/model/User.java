package com.ut.sm42.model;
import javax.persistence.Id;
import javax.persistence.Entity;


@Entity
public class User {

    @Id
    int id;
    String name;

    public User (){

    }

    public int getId() { return id;}

    public void setId(int id){this.id = id;}

    public String getName(){return name; }

    public void setName(String name){this.name = name;}
}
