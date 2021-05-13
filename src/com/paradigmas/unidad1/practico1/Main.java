package com.paradigmas.unidad1.practico1;

import com.paradigmas.unidad1.practico1.domain.Cancha;
import com.paradigmas.unidad1.practico1.domain.Equipo;
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
        int cantidadCanchas;
        int capacidadCancha;
        String auxNombre;
        String auxApellido;
        String auxCiudad;
        int opcion=0;
        
        

        //Instanciar
       // persona1 = new Persona();
       // persona2 = new Persona("Juan", "Perez");
        Scanner sc = new Scanner(System.in);
        Scanner scLetras = new Scanner(System.in);
        
        

        //CARGA DE PERSONAS
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
        
        
        //CARGA DE EQUIPOS      
        Equipo[] equipos = new Equipo[2];
        
        for(int i=0;i<2;i++){
            System.out.println("\n Cargar equipo " +(i+1));
            System.out.print("Nombre : ");
            auxNombre = scLetras.nextLine();
            System.out.print("Ciudad : ");
            auxCiudad = scLetras.nextLine();
            equipos[i] = new Equipo(auxNombre,auxCiudad);
        }
        
        
        //CARGA DE CANCHAS
        System.out.print("\nCantidad de canchas que desea cargar: ");
        cantidadCanchas = sc.nextInt();
        Cancha[] canchas = new Cancha[cantidadCanchas];
        
        for(int i=0;i<cantidadCanchas;i++){
            System.out.println("\n Cancha"+(i+1));
            System.out.print("Nombre : ");
            auxNombre = scLetras.nextLine();
            System.out.print("Capacidad de personas : ");
            capacidadCancha = sc.nextInt();
            canchas[i]= new Cancha(auxNombre,capacidadCancha);
        }
        
        
        while(opcion!=5){
         //MENU
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ELIJA LA OPERACION DESEADA :");
        System.out.println(" ");
        System.out.println("1.Mostrar Personas cargadas");
        System.out.println("2.Mostrar Equipos cargados");
        System.out.println("3.Mostrar Canchas cargadas");
        System.out.println("4.Mostrar todos los datos cargados");
        System.out.println("5.Salir");
        System.out.println(" ");
        opcion = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        switch(opcion){
            case 1:{
                    System.out.println("---------PERSONAS CARGADAS---------");
                    System.out.println(" ");
                        for(int i=0;i<cantidadPersonas;i++){
                       System.out.println(personas[i].toString());
                   }
                    
                break;
            }
            case 2:{
                    System.out.println("---------EQUIPOS CARGADAS---------");
                    System.out.println(" ");
                        for(int i=0;i<2;i++){
                       System.out.println(equipos[i].toString());
                   }   
                break;
            }
        case 3:{
                    System.out.println("---------CANCHAS CARGADAS---------");
                    System.out.println(" ");
                        for(int i=0;i<cantidadCanchas;i++){
                       System.out.println(canchas[i].toString());
                   } 
               
                break;
            }
    
        case 4:{
                    System.out.println("---------DATOS CARGADOS---------");
                    System.out.println(" ");
                    
                    System.out.println("---------PERSONAS CARGADAS---------");
                    System.out.println(" ");
                    for(int i=0;i<cantidadPersonas;i++){
                       System.out.println(personas[i].toString());
                   }
                    
                    System.out.println(" ");
                    System.out.println("---------EQUIPOS CARGADAS---------");
                    System.out.println(" ");
                        for(int i=0;i<2;i++){
                       System.out.println(equipos[i].toString());
                   }
                        
                    System.out.println(" ");
                    System.out.println("---------CANCHAS CARGADAS---------");
                    System.out.println(" ");
                        for(int i=0;i<cantidadCanchas;i++){
                       System.out.println(canchas[i].toString());
                   }
                   
                    
        }
        break;
        
        default:{
               System.out.println("¡Hasta pronto!");
               break; 
            }
        }


    
    
    
    
    
    
        }
   
    
    
    
    
    
    }
}
