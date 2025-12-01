package bucles;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable para guardar el número introducido por el usuario
		int filas;
		
		//Preguntamos al usuario por un número
		System.out.print("Introduzca el número de filas: ");
		filas = sc.nextInt();

		//Bucle eterno para las filas
		for (int i = 1 ; i<=filas; i++) {
			//Bucle para la parte creciente
			for(int j = 1 ; j <= i; j++) {
				System.out.print(j);
			}
			//Bucle para la parte decreciente
			for(int k = i-1 ; k >=1 ; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		//Cerramos escaner
		sc.close();
	}
}