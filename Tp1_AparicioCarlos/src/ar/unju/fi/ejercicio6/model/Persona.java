package ar.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fecha;
	private String provincia;
	
	public Persona() {
		
	}
	
	public Persona(String dni, String nombre, LocalDate fecha, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fecha) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia ="jujuy";

	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int edad () {
		int edad;
		int anio = LocalDate.now().getYear();
		edad = anio-this.fecha.getYear();
		return edad;
	}
	public boolean mayor() {
		int ed = edad();
		if (ed>18) {
			return true;
		}else {
			return false;
		}
	}
	public void MostrarDatos(Persona a) {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.provincia);
		System.out.println(this.fecha);
		if (mayor()==true) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	}
}