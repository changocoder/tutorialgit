package com.model;

public class Equipo {

	private String nombreEquipo;
	private String lugarEquipo;

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getLugarEquipo() {
		return lugarEquipo;
	}

	public void setLugarEquipo(String lugarEquipo) {
		this.lugarEquipo = lugarEquipo;
	}

	public Equipo(String nombreEquipo, String lugarEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.lugarEquipo = lugarEquipo;
	}

	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", lugarEquipo=" + lugarEquipo + "]";
	}

}
