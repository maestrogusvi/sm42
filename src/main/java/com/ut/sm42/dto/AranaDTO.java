package com.ut.sm42.dto;

public class AranaDTO {
    int identificador;
    String Nombre;
    String status;

    /*Constructor*/

    public AranaDTO() {
    }

    /* getter & setter */

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /* Nuevo getter & setter de status :) */

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Act 22 oct 2021

    @Override
    public String toString() {
        return "AranaDTO{" +
                "identificador=" + identificador +
                ", Nombre='" + Nombre + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"identificador\":" + "\""+identificador+"\"," +
                "\"Nombre\":" + "\""+Nombre+"\"," +
                "\"status\":" + "\""+status+"\"," +
                '}';
    }


}
