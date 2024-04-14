package ar.edu.unju.fi.ejercicio4.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int acum=1;
		System.out.println("Ingrese un numero entre 0 y 10: ");
		Scanner scanner = new Scanner (System.in);
		num = scanner.nextInt();
		if (num >= 0 && num <= 10) {
			if (num == 0) {
				System.out.println("El factorial es: "+acum);
			}else {
				while(num>=1) {
					acum = acum*num;
					num = num-1;
				}
				System.out.println("El factorial del numero ingresado es: "+acum);
			}
		}else {
			System.out.println("El numero ingresado esta fuera del rango permitido.");
		}
	}

}
