package bucles;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		// Creamos un nuevo escaner
				Scanner sc = new Scanner(System.in);

				// Declaramos las variables para contener las horas, min y segundos
				int horas;
				int min;
				int seg;
				
				//Declaramos una variable para contener la cantidad de segundos a incrementar
				int incrementoseg;

				// Le preguntamos al usuario sobre la hora
				System.out.println("Introduzca las horas:");
				horas = sc.nextInt();

				// Le preguntamos al usuario sobre la min
				System.out.println("Introduzca las minutos:");
				min = sc.nextInt();

				// Le preguntamos al usuario sobre la seg
				System.out.println("Introduzca las segundos:");
				seg = sc.nextInt();
				
				//Le preguntamos al usuario por los segundos a incrementar
				System.out.println("Cuántos segundos quieres incrementarlo:");
				incrementoseg = sc.nextInt();
				
				// Comprobamos que pasaria si pasara x segundos
				
				
				// Imprimos al usuario la hora trascurrido un segundo
				System.out.println("Pasado un segundo son las " + horas + ":" + min + ":" + seg);

				sc.close();
	}
}
