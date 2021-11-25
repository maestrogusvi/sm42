package com.ut.sm42.dto;

public class UserDTO {

   String name;
   String status;
   String password;
   Short role;

   public UserDTO() {
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

   public Short getRole() {
      return role;
   }

   public void setRole(Short role) {
      this.role = role;
   }
}
