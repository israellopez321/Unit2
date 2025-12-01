package bucles;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		// Numero introducido por el usuario 
		int num;
		
		// Variable para saber si es primo o no
		boolean esPrimo;
		
		// Contador de numeros primos
		int contadorPrimos = 0;
		
		//Le preguntamos al usuario por el número
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		
		for (int cont = 2; cont <= num ; cont++ ) {
			esPrimo = true;
			
			for (int i = 2; i <= Math.sqrt(cont); i++) {
				if (cont % i == 0) {
                    esPrimo = false;
				}
			}
			
			if (esPrimo) {
				contadorPrimos++;
			}
		}
		
		// Le mostramos al usuario el resultado
		System.out.println("Entre el 1 y el " + num + " hay " + contadorPrimos + " números primos.");
		
		
		sc.close();
	}
}
