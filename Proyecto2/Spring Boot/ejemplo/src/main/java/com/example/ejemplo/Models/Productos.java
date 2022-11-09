package com.example.ejemplo.Models;

public class Productos {
    private String nombre;
    private float precio;
    private String foto;

    
    public Productos(String nombre, float precio, String foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
}
