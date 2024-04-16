package ar.unju.fi.ejercicio6.main;

import ar.unju.fi.ejercicio6.model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String d;
		String n;
		int a;
		int m;
		int dia;
		String p;
		System.out.println("Ingrese DNI: ");
		try (Scanner scanner = new Scanner (System.in)) {
			d = scanner.next();
			System.out.println("Ingrese Nombre: ");
			n = scanner.next();
			System.out.println("Ingrese año de nacimiento: ");
			a = scanner.nextInt();
			System.out.println("Ingrese mes de nacimiento: ");
			m = scanner.nextInt();
			System.out.println("Ingrese dia de nacimiento: ");
			dia = scanner.nextInt();
			LocalDate f = LocalDate.of(a, m, dia);
			System.out.println("Ingrese provincia: ");
			p = scanner.next();
			Persona datos = new Persona();
			datos.setDni(d);
			datos.setNombre(n);
			datos.setFecha(f);
			datos.setProvincia(p);
			datos.MostrarDatos(datos);
			Persona datos2 = new Persona(d, n, f);
			datos.MostrarDatos(datos2);
			Persona datos3 = new Persona(d, n, f, p);
			datos.MostrarDatos(datos3);
		}
	}
}
