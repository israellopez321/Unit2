package for_;

import java.util.Scanner;

public class Exercise08Correction {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variables para contener los numeros introducidos por el
		// usuario
		int numA;
		int numB;

		// Declaramos una variable para contener al número mayor y menor
		int mayor;
		int menor;

		// Le pedimos al usuario el primer numero
		System.out.println("Introduzca el primer número:");
		numA = sc.nextInt();

		// Le pedimos al usuario el segundo numero
		System.out.println("Introduzca el segundo número:");
		numB = sc.nextInt();
		
		//menor = Math.min(numA, numB);
		//mayor = Math.max(numA, numB);
		
		// Usamos if para saber cual numero es mayor
		if (numA > numB) {
			mayor = numA;
			menor = numB;
		} else {
			mayor = numB;
			menor = numA;
		}

		// Usamos for para mostrar los numeros entre medias
		for (int cont = menor; cont <= mayor; cont++) {
			if (cont != mayor && cont != menor) {
				System.out.print(cont);
				if (cont != mayor - 1) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				} // Fin else
			} // Fin if
		}//Fin for
		// Cerramos el escaner
		sc.close();
	}
}