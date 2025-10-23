package ejercicios_condicionales;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		
		
		// Entrada 900km y 6 dias || Resultado esperado: Coste billete  || Resultado obtenido: El precio del billete de tren cuesta: 2250.0 euros.
		// Entrada 900km y 8 dias || Resultado esperado: Coste billete  || Resultado obtenido: El precio del billete de tren cuesta: 675.0 euros.
		// Entrada -4km y 5 dias || Resultado esperado: Coste billete || Resultado obtenido: El número de días de estancia y distancia no pueden ser negativos.
		// Entrada 5km y -5 dias|| Resultado esperado: Coste billete  || Resultado obtenido: El número de días de estancia y distancia no pueden ser negativos.
		
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos unas variables para contener la distancia y dia de estancias
		int distancia;
		int diasEstancia;

		// Declaramos las variables para contener las contantes del descuento
		final double DESCUENTO = 0.30;
		final int DIAS_PARA_DESCUENTO = 7;
		final int DISTANCIA_PARA_DESCUENTO = 800;
		final double PRECIO_KM = 2.5;

		// Declaramos una variable para contener la solucion
		double precioBillete = 0;

		// Le preguntamos al usuario por el la distancia
		System.out.println("A partir de los 800km y 7 días de estancia se le aplicara un descuento del 30%.");
		System.out.println("Introduzca la distancia a recorrer:");
		distancia = sc.nextInt();

		// Le preguntamos al usuario por los dias de estancia
		System.out.println("Introduzca los días de estancia:");
		diasEstancia = sc.nextInt();

		// Usamos el if para calcular el precio del billete segun los km, estancia y mostramos el resultado
		if (distancia >= 0 && diasEstancia >= 0) {
			if (distancia >= DISTANCIA_PARA_DESCUENTO && diasEstancia >= DIAS_PARA_DESCUENTO) {
				precioBillete = distancia * PRECIO_KM * DESCUENTO;
			} else {
				precioBillete = distancia * PRECIO_KM;
			}
			
			System.out.println("El precio del billete de tren cuesta: " + precioBillete + " euros.");	
		} else {
			System.out.println("El número de días de estancia y distancia no pueden ser negativos.");
		}

		sc.close();
	}
}
