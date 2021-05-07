package com.paradigmas.unidad1.practico1;

import com.paradigmas.unidad1.practico1.domain.Persona;
import com.paradigmas.unidad1.practico1.domain.Equipo;
import com.paradigmas.unidad1.practico1.domain.Cancha;
import java.time.Instant;
import java.util.Date;

import java.util.Scanner;


public class Main {
    

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        Integer opcion=0;
                
        while(opcion != 4){
            
        System.out.println("===MENU===");
        System.out.println("1) Crear equipos");
        System.out.println("2) Cargar persona");
        System.out.println("3) Agregar Cancha");
        System.out.println("4) Salir");
        System.out.println("Elija una opción: ");
        opcion = input.nextInt();
            
            switch(opcion){
                case 1: crearEquipo(); break;
                
                case 2:cargarPersona(); break; 
                
                case 3: agregarCancha(); break; 

                case 4: break;
                
                default: System.out.println("Opcion incorrecta!!\n"); 
            }
        }

    }
    
    public static void crearEquipo(){
        Scanner input = new Scanner(System.in);
        String nombre, ciudad;
        char opcion;
        
        System.out.println("\nIngrese el nombre del equipo: ");
        nombre = input.nextLine();
        System.out.println("\nIngrese el nombre de la ciudad: ");
        ciudad = input.nextLine();
        
        Equipo equipo = new Equipo(nombre, ciudad);
        System.out.println("Equipo creado correctamente!");
        System.out.println("Desea ver los datos del equipo? (s/n)");
        opcion = input.next().charAt(0);
        
        if(opcion == 's' || opcion == 'S'){
            System.out.println(equipo);
        }
    }
    
    public static void cargarPersona(){
        Scanner input = new Scanner(System.in);
        String nombre, apellido;
        Integer documento, anio, mes, dia;
        Double altura, peso;
        Date fecha;
        char opcion;
        
        System.out.println("\nIngrese el nombre: ");
        nombre = input.nextLine();
        System.out.println("\nIngrese el apellido: ");
        apellido = input.nextLine();
        System.out.println("\nIngrese el documento: (sin puntos)");
        documento = input.nextInt();
        System.out.println("\nIngrese la altura: ");
        altura = input.nextDouble();
        System.out.println("\nIngrese el peso: ");
        peso = input.nextDouble();
        System.out.println("\nIngrese el año de nacimiento: ");
        anio = input.nextInt();
        System.out.println("\nIngrese el mes de nacimiento: ");
        mes = input.nextInt();
        System.out.println("\nIngrese el día de nacimiento: ");
        dia = input.nextInt();
        fecha = new Date(anio, mes, dia);
        
        Persona persona = new Persona(nombre, apellido);
        persona.setDocumento(documento);
        persona.setAltura(altura);
        persona.setPeso(peso);
        persona.setFechaNacimiento(fecha);
        System.out.println("Persona cargada correctamente!");
        System.out.println("Desea ver los datos de la persona? (s/n)");
        opcion = input.next().charAt(0);
        
        if(opcion == 's' || opcion == 'S'){
            System.out.println(persona);
        }
    }
    
    public static void agregarCancha(){
        Scanner input = new Scanner(System.in);
        String nombre;
        Integer capacidadEspectadores; 
        char opcion;
        
        System.out.println("\nIngrese el nombre de la cancha: ");
        nombre = input.nextLine();
        System.out.println("\nIngrese la capacidad de espectadores: ");
        capacidadEspectadores = input.nextInt();
        
        Cancha cancha = new Cancha(nombre, capacidadEspectadores);
        System.out.println("Cancha agregada correctamente!");
        System.out.println("Desea ver los datos de la cancha? (s/n)");
        opcion = input.next().charAt(0);
        
        if(opcion == 's' || opcion == 'S'){
            System.out.println(cancha);
        }
        
    }
    
}
