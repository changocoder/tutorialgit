package com.paradigmas.unidad1.practico1.domain;

public class Jugador extends Persona implements IMovimientos{

    public String tirarAlCesto() {
        return "tirando !!!!!";
    }

    @Override
    public String pasarPelota() {
        return null;
    }

    @Override
    public void correr() {
        System.out.println("Corriendo....");

    }


}
