package com.ut.sm42.dto;

public class UserDTO {

    String name;
    String status;
    String password;
    String role;

    public UserDTO() {
        this.name = name;
        this.status = status;
        this.password = password;
        this.role = role;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = String.valueOf(role);
    }
}
