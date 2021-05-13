package com.model;

import java.util.Scanner;

public class Gestor{

	int nPersonas;
	int nCanchas;
	int nEquipos;
	int capacidadCancha;

	String auxNombre;
	String auxApellido;
	String auxCiudad;

	Scanner sc = new Scanner(System.in);
	Scanner scLetras = new Scanner(System.in);
	private Object[] personas;
	private Object[] equipos;
	private Object[] canchas;


	public void cargarEquipo() {

		System.out.print("Numero de equipos para agregar: ");
		nEquipos = sc.nextInt();
		Equipo[] equipos = new Equipo[nEquipos];

		for (int i = 0; i < nEquipos; i++) {
			System.out.println("\n Cargar equipo N° " + (i + 1));
			System.out.print("Nombre : ");
			auxNombre = scLetras.nextLine();
			System.out.print("Ciudad : ");
			auxCiudad = scLetras.nextLine();
			equipos[i] = new Equipo(auxNombre, auxCiudad);
		}

	}

	public void cargarPersona() {

		System.out.print("Numero de personas para agregar: ");
		nPersonas = sc.nextInt();
		Persona[] personas = new Persona[nPersonas];

		for (int i = 0; i < nPersonas; i++) {
			System.out.println("\n Cargar persona N° " + (i + 1));
			System.out.print("Nombre : ");
			auxNombre = scLetras.nextLine();
			System.out.print("Apellido : ");
			auxApellido = scLetras.nextLine();
			personas[i] = new Persona(auxNombre, auxApellido, i);
		}

	}

	public void cargarCancha() {

		System.out.print("\n Numero de canchas para agregar: ");
		nCanchas = sc.nextInt();
		Cancha[] canchas = new Cancha[nCanchas];

		for (int i = 0; i < nCanchas; i++) {
			System.out.println("\n Cargar cancha N° " + (i + 1));
			System.out.print("Nombre : ");
			auxNombre = scLetras.nextLine();
			System.out.print("Capacidad : ");
			capacidadCancha = sc.nextInt();
			canchas[i] = new Cancha(auxNombre, capacidadCancha);
		}

	}

	public void mostrarElementos() {
        
        System.out.println("\n Personas cargadas: ");
        System.out.println(" ");
        for(int i=0;i<nPersonas;i++){
        System.out.println(personas[i].toString());
       }
        
        System.out.println(" ");
        System.out.println("\n Equipos cargados: ");
        System.out.println(" ");
        for(int i=0;i<nEquipos;i++){
        System.out.println(equipos[i].toString());
       }
            
        System.out.println(" ");
        System.out.println("\n Canchas cargadas: ");
        System.out.println(" ");
        for(int i=0;i<nCanchas;i++){
        System.out.println(canchas[i].toString());
       }
    
}
	
}
