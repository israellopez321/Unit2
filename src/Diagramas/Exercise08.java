package Diagramas;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		//Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables para contener tres numeros
		int num1;
		int num2;
		int num3;
		
		//Le preguntamos al usuario por el primer numero
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		//Le preguntamos al usuario por el segundo numero
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();
		
		//Le preguntamos al usuario por el tercer numero
		System.out.println("Introduzca el tercer número:");
		num3 = sc.nextInt();
		
		//Comprobamos que numero es mayor y lo imprimimos
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " es mayor.");
			} else {
				System.out.println(num3 + " es mayor.");
			}
		} else {
			if (num2 > num3) {
				System.out.println(num2 + " es mayor.");
			} else {
				System.out.println(num3 + " es mayor.");
			}
		}
		
		sc.close();
	}	
}
