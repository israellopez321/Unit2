package Ejercicios_De_Examenes_Anteriores;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable donde almacenar el tamaño
		int lado;
		
		//Le pedimos al usuario el lado del cuadrado
		System.out.println("Introduzca el tamaño del cuadrado:");
		lado = sc.nextInt();
		
		//Bucle for para las filas
		for(int fila = 1; fila <= lado; fila++) {
			//Bucle para columnas
			
			if(fila == 1 || fila == lado) {
				for(int col = 1; col <= lado; col++) {
					System.out.print("*");	
					}
			} else {
			//Pinta asterisco y espacios en medio
			System.out.print("*");
			
			//For para pintar los espacio
			for(int espacio = 1; espacio <= lado-2; espacio++) {
				System.out.print(" ");
			}
			System.out.print("*");
			}
			System.out.println();
			
		}
		//Cerramos el escaner
		sc.close();
		
		
	}
}
