package com.paradigmas.unidad1.practico1.domain;

public class Cancha {
    private String nombre;
    private Integer capacidadEspectadores;

    public Cancha(String nombre, Integer capacidadEspectadores) {
        this.nombre = nombre;
        this.capacidadEspectadores = capacidadEspectadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidadEspectadores() {
        return capacidadEspectadores;
    }

    public void setCapacidadEspectadores(Integer capacidadEspectadores) {
        this.capacidadEspectadores = capacidadEspectadores;
    }
    
        @Override
    public String toString() {
        return  nombre + " -Capacidad: " + capacidadEspectadores + " personas";
    }
    
}
