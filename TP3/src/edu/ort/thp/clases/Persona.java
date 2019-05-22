package edu.ort.thp.clases;

public class Persona {

	private String nombre;
	private String apellido;
	private String direccion;

	// Getter and Setter
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String ape) {
		this.apellido = ape;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String dire) {
		this.direccion = dire;
	}

	// Constructor
	public Persona(String nom, String ape, String dire) {
		this.nombre = nom;
		this.apellido = ape;
		this.direccion = dire;
	}

	// Constructor S/parametros
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
	}
	
	//toString
	@Override
	public String toString(){
		return "[Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Direccion: " + this.direccion;
	}
	
	

}
