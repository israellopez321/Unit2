package do_while;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener las respuestas de los jugadores
		String jugador1;
		String jugador2;
		
		//Declaramos una variable en boleano para preguntar al usuario si repetir el juego
		boolean otraVez;
		
		//Uso de do para saber que jugador gana en piedra papel y tijeras
		do {
			do {
				System.out.println("Jugador 1 introduzca piedra, papel, o tijeras:");
				jugador1 = sc.next();
			}while(!jugador1.equals("tijeras") && !jugador1.equals("piedra") && !jugador1.equals("papel"));
			do {
				System.out.println("Jugador 2 introduzca piedra, papel, o tijeras:");
				jugador2 = sc.next();
			}while(!jugador2.equals("tijeras") && !jugador2.equals("piedra") && !jugador2.equals("papel"));	
			
			if (jugador1.equals("piedra") && jugador2.equals("tijeras") || jugador1.equals("papel") && jugador2.equals("piedra") || jugador1.equals("tijeras") && jugador2.equals("papel")) {
				System.out.println("El jugador 1 gana");
			} else if (jugador1.equals(jugador2)) {
				System.out.println("Empate");
			}else {
				System.out.println("El jugador 2 gana");
			}
		System.out.println("¿Quieres volver a jugar? true o false");
		otraVez = sc.nextBoolean();
		}while (otraVez == true);
		
		//Cerramos escaner
		sc.close();	
		}
	}