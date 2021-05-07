package com.paradigmas.unidad1.practico1;

import com.paradigmas.unidad1.practico1.domain.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ingrese un valor:");
//        String inputValue = input.next();
//        String catedra = new String("Paradigmas III");
//
//        System.out.println("Hola Mundo - " + catedra);
//        System.out.println("Input user:"+ inputValue);

        // Declarar una Variable
        Persona persona1;
        Persona persona2;

        //Instanciar
        persona1 = new Persona();
        persona2 = new Persona("Juan", "Perez");

        System.out.println(persona2);


    }
}
