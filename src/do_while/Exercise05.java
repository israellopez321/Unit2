package do_while;

import java.util.Random;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la clase random
		Random rand = new Random();
		
		//Declaramos unas variables para contener el max y min del generador de numero
		int min = 1;
		int max = 101;
		
		//Declaramos una variable para contener el resultado
		String resultado;
		
		//Declaramos una variable para un numero aleatorio
		int numAleatorio;

		//Usamos do para acercarnos al numero pensado y adivinarlo
		do {
			numAleatorio = rand.nextInt(max,min);
			System.out.println("El número que piensas es mayor, menor o igual que " + numAleatorio + "?");
			resultado = sc.next();
			if (resultado.equals("menor")) {
				max = numAleatorio;
			} else if (resultado.equals("mayor")) {
				min = numAleatorio + 1;
			}
		} while (!resultado.equals("iguales"));
		
		//Imprimir al usuario que ha salido bien
		System.out.println("Has acertado");
		
		//Cerramos escaner
		sc.close();
	}

}
