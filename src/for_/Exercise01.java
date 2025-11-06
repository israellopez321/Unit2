package for_;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		
		//Variable para almacenar el numero introducido por el usuario
		int num;
		
		//Le pedimos al usuario un numero
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//for: desde 1 hasta num de 1 en 1
		for(int cont = 1; cont<= num; cont++) {
			System.out.println(cont);
		}
		sc.close();
	}	
}
