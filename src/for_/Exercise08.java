package for_;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variables para contener los numeros introducidos por el
		// usuario
		int numA;
		int numB;

		// Le pedimos al usuario el primer numero
		System.out.println("Introduzca el primer número:");
		numA = sc.nextInt();

		// Le pedimos al usuario el segundo numero
		System.out.println("Introduzca el segundo número:");
		numB = sc.nextInt();

		// Usamos if para saber cual numero es mayor y for para mostrar todos los
		// numeros entre ellos
		if (numA > numB) {
			for (int cont = numB; cont <= numA; cont++) {
				if (cont != numA && cont != numB) {
					System.out.print(cont);
					if (cont != numA-1) {
						System.out.print(", ");
					} else {
						System.out.print(".");
					} // Fin else
				}//Fin if
			} // Fin for			
		} else if (numA < numB) {
			for (int cont = numB; cont >= numA; cont--) {
				if (cont != numA && cont != numB) {
					System.out.print(cont);
					if (cont != numA+1) {
						System.out.print(", ");
					} else {
						System.out.print(".");
					} // Fin else
				}//Fin if
			} // Fin for	
		}

		// Cerramos el escaner
		sc.close();
	}
}
