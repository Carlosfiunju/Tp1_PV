package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		String n;
		int l;
		double s;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese Nombre de empleado: ");
			n = sc.next();
			System.out.println("Ingrese Legajo: ");
			l = sc.nextInt();
			System.out.println("Ingrese Salario");
			s = sc.nextDouble();
		}
		Empleado e = new Empleado(n, l, s);
		e.MostrarDatos(e);
		e.AumentarSalario(s);
		e.MostrarDatos(e);
	}

}
