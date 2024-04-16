package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	public static final double SalarioMinimo = 210000.;
	public static final double AumentoPorMerito = 20000.;
	
	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario>=SalarioMinimo) {
			this.salario = salario;
		}else {
			this.salario = SalarioMinimo;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void MostrarDatos (Empleado e) {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario: "+this.salario);
	}
	public double AumentarSalario (double n) {
		return this.salario+AumentoPorMerito;
	}
}
