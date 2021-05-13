/*
 *  TP N° 3 - INTEGRANTES: Maldonado Dario ELSI453 ; Luna Bazán Mateo ELSI597 ; Ortiz, Gustavo ELSI515
 */

package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.model.Gestor;

public class Main {

	public static void main(String[] args) {

		try {
			while (true) {
				mostrarMain();
				gestionarMain(recogerOpcion());
				System.out.println();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void mostrarMain() {
		System.out.println("1. Cargar Equipos");
		System.out.println("2. Cargar Personas");
		System.out.println("3. Cargar Canchas");
		System.out.println("4. Mostrar Elementos Cargados");
		System.out.println("5. Salir");
		System.out.print("Introduce tu opción: ");

	}

	public static int recogerOpcion() throws NumberFormatException, IOException {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(consola.readLine());
		return r;
	}

	public static void gestionarMain(int opcion) throws NumberFormatException, IOException {
		Gestor gb = new Gestor();
		
		switch (opcion) {
		case 1:
			gb.cargarEquipo();
			break;
		case 2:
			gb.cargarPersona();
			break;
		case 3:
			gb.cargarCancha();
			break;
		case 4:
			gb.mostrarElementos();
			break;
		case 5:
			System.exit(0);
			break;		
		default:
			System.out.println("Opcion no encontrada");
			break;
		}
	}

}
