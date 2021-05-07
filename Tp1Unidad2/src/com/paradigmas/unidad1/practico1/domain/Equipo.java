package com.paradigmas.unidad1.practico1.domain;

import java.util.ArrayList;

public class Equipo {

    private String nombre;

    private String ciudad;

    private Entrenador entrenador;

    private ArrayList<Jugador> jugadores;

    private Cancha cancha;
    
    //Constructor
    
    public Equipo(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Datos del Equipo:\nNombre: " + nombre + "\nCiudad: " + ciudad;
    }
    
    
    
    

}
