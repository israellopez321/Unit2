package while_;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos una variable para contener los numeros introducidos por el usuario
		int numero;
		
		// Declaramos unas variables para contener los contadores
		int contador = 0;
		int contadorCero = 0;
		int contadorNeg = 0;
		
		// Declaramos una varibles para contener la suma y media de los numeros introducidos
		int sumaPos = 0;
		int sumaNeg = 0;
		double mediaNeg;
		
		// Le pedimos al usuario que introduzca un numero entero
		System.out.println("Introduzca un número entero:");
		numero = sc.nextInt();
		
		// Usamos while para clasificar los numeros positivos, negativos y ceros
		while (contador < 10) {
			if (numero > 0) {
				sumaPos += numero;
				
			} else if (numero == 0) {
				contadorCero++;

			}else {
				sumaNeg += numero;
				contadorNeg++;
				
			}// Cerramos else
			contador++;
			
			// Le pedimos al usuario que introduzca un numero entero
			System.out.println("Introduzca un número entero:");
			numero = sc.nextInt();
		}
		
		// Calculamos la media de numeros negativos
		mediaNeg = sumaNeg / contadorNeg;
		
		// Le mostasmos al usuario la suma de los numeros positivos, el contador de ceros y la media de numeros negativos
		System.out.println("Suma de números positivo: " + sumaPos);
		System.out.println("Media de números negativos: " + mediaNeg);
		System.out.println("Contador de ceros: " + contadorCero);
		
		sc.close();
	}
}
