package com.paradigmas.unidad1.practico1.domain;

public class Arbitro extends Persona implements IMovimientos{

    @Override
    public String pasarPelota() {
        return null;
    }

    @Override
    public void correr() {
        System.out.println("Correr");
    }
}
