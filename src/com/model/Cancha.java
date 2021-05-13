package com.model;

public class Cancha {

	private String nombreCancha;
	private int capacidadCancha;

	public String getNombreCancha() {
		return nombreCancha;
	}

	public void setNombreCancha(String nombreCancha) {
		this.nombreCancha = nombreCancha;
	}

	public int getCapacidadCancha() {
		return capacidadCancha;
	}

	public void setCapacidadCancha(int capacidadCancha) {
		this.capacidadCancha = capacidadCancha;
	}

	public Cancha(String nombreCancha, int capacidadCancha) {
		super();
		this.nombreCancha = nombreCancha;
		this.capacidadCancha = capacidadCancha;
	}

	public Cancha() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cancha [nombreCancha=" + nombreCancha + ", capacidadCancha=" + capacidadCancha + "]";
	}

}
