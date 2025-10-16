package diagramas;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para contener las horas, min y segundos
		int horas;
		int min;
		int seg;

		// Le preguntamos al usuario sobre la hora
		System.out.println("Introduzca las horas:");
		horas = sc.nextInt();

		// Le preguntamos al usuario sobre la min
		System.out.println("Introduzca las minutos:");
		min = sc.nextInt();

		// Le preguntamos al usuario sobre la seg
		System.out.println("Introduzca las segundos:");
		seg = sc.nextInt();

		// Comprobamos que pasaria si pasara 1 segundo
		if (seg < 59) {
			seg++;
		} else {
			seg = 0;
			if (min < 59) {
				min++;
			} else {
				min = 0;
				if (horas < 23) {
					horas++;
				} else {
					horas = 0;
				} // Fin else de los horas
			} // Fin else de los minutos
		} // Fin else de los segundos

		// Imprimos al usuario la hora trascurrido un segundo
		System.out.println("Pasado un segundo son las " + horas + ":" + min + ":" + seg);

		sc.close();
	}
}
