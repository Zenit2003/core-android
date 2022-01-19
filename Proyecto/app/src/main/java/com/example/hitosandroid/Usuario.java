package com.example.hitosandroid;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    private String apellidos;
    private String numero;

    public Usuario(){
        this.nombre = null;
        this.apellidos = null;
        this.numero = null;
    }

    public Usuario(String nombre, String apellidos, String numero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
