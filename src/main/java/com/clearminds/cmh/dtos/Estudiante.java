package com.clearminds.cmh.dtos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudiante {
	
	
	
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String fecha;
	
	private static String formato = "yyyy/MM/dd HH:mm:ss";
	

	public Estudiante() {
	}

	public Estudiante(int id, String nombre, String apellido, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		SimpleDateFormat formateador = new SimpleDateFormat(formato);
		this.fecha = formateador.format(new Date());
	}

	public String getFecha() {
		SimpleDateFormat formateador = new SimpleDateFormat(formato);
		this.fecha = formateador.format(new Date());
		return fecha;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
