package for_;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos un variable para contener los numeros introducidos por el usuario
		int num;
		
		//Declaramos unas variables para contener la suma y media de los numeros
		int suma = 0;
		double media;
		
		//Usamos for para pedir el numero y sumarlo 10 veces
		for (int contador = 1; contador<=10 ; contador++ ) {
			System.out.println("Introduzca un número para calcular la media:");
			num = sc.nextInt();
			suma += num;
		}
		
		//Calculamos la media
		media = suma / 10;
		
		//Le mostramos al usuario la media
		System.out.println("La media de los numeros es: " + media );
		
		//Cerramos el escaner
		sc.close();
	}
}
