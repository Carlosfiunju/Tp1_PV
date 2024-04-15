package ar.edu.unju.fi.ejercicio3.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("Ingrese un numero: ");
			num = scanner.nextInt();
		}
		if (num%2==1) {
			System.out.println("El doble del numero es: "+num*2);
		}else {
			System.out.println("El triple de numero es: "+num*3);
		}
	}

}
