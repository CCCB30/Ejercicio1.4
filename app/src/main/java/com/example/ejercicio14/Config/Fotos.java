package com.example.ejercicio14.Config;

import java.sql.Blob;

public class Fotos {

    private int codigo;
    private String nombre;
    private String descripcion;
    private Blob image;

    public Blob getImage() {
        return image;
    }

    public Fotos(int codigo, String nombre, String descripcion, Blob image) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.image = image;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
