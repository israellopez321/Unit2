package if_else;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaration a variable for contain a number
		int numero;
		
		//Ask the user for the number for find out if it is even or odd
		System.out.println("Introduzca un número para saber si es par o impar:");
		numero = sc.nextInt();
		
		//Checking if the number is even or odd
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par.");
		} else {
			System.out.println("El número " + numero + " es impar.");
		}
		sc.close();
	}
}
