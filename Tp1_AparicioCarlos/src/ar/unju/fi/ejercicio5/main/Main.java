package ar.unju.fi.ejercicio5.main;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int num;
		System.out.println("Ingrese un numero del 1 al 9: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if (num >= 1 && num <= 9) {
			for (int i=1;i<=10;i++) {
				System.out.println(num+" x "+i+" = "+num*i);
			}
		}else {
			System.out.println("El numero ingresado esta fuera del rango permitido.");
		}
	}
}