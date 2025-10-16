package Diagramas;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		// Creamos un escaner nuevo
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable para contener el nombre
		String nombre;

		// Declaramos la variable para contener las horas y tarifa por hora
		int numHoras;
		double tarifaHora;
		double salBruto;
		double salNeto;
		double tasas = 0;
		// Le pregutamos al usuario su nombre
		System.out.println("Introduzca su nombre:");
		nombre = sc.next();

		// Le pregutamos al usuario el numero de horas trabajados
		System.out.println("Introduzca las horas trabajadas esta semana:");
		numHoras = sc.nextInt();

		// Le pregutamos al usuario su tarifa por semana
		System.out.println("Introduzca la tarifa por semana:");
		tarifaHora = sc.nextDouble();

		// Comprobamos
		if (numHoras <= 35) {
			salBruto = numHoras * tarifaHora;
		} else {
			salBruto = 35 * tarifaHora + (numHoras - 35) * tarifaHora * 1.5;
		}

		if (salBruto <= 500) {
			salNeto = salBruto;
		} else if (salBruto <= 900) {
			tasas = salBruto * 0.25;
			salNeto = salBruto - tasas;
		} else {
			tasas = salBruto * 0.45;
			salNeto = salBruto - tasas;
		}

		// Le mostramos a los usuarios su nombre, salario bruto, tasas y salario neto
		System.out.println("Resumen de: " + nombre);
		System.out.println("Su salario en bruto es: " + salBruto);
		System.out.println("Las tasas aplicadas son: " + tasas);
		System.out.println("Su salario en neto es: " + salNeto);
		
		sc.close();
	}
}
