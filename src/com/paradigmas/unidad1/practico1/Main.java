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
        int cantidadPersonas;
        String auxNombre;
        String auxApellido;
        int opcion=0;
        
        

        //Instanciar
       // persona1 = new Persona();
       // persona2 = new Persona("Juan", "Perez");
        Scanner sc = new Scanner(System.in);
        Scanner scLetras = new Scanner(System.in);
        
        

        
        System.out.print("Cantidad de personas que desea cargar: ");
        cantidadPersonas = sc.nextInt();
        Persona[] personas = new Persona[cantidadPersonas];
        
        
        for(int i=0;i<cantidadPersonas;i++){
            System.out.println("\n Cargar persona " +(i+1));
            System.out.print("Nombre : ");
            auxNombre = scLetras.nextLine();
            System.out.print("Apellido : ");
            auxApellido = scLetras.nextLine();
            personas[i] = new Persona(auxNombre,auxApellido);
        }
        
        
         //MENU
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ELIJA LA OPERACION DESEADA :");
        System.out.println(" ");
        System.out.println("1.Cargar Personas");
        System.out.println("2.Cargar Equipos");
        System.out.println("3.Cargar Canchas");
        System.out.println("4.Mostrar datos cargados");
        System.out.println("5.Salir");
        System.out.println(" ");
        opcion = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        


    
    
    
    
    
    
    
    }
}
