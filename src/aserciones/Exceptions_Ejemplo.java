package aserciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions_Ejemplo {

	public static void main(String[] args) {
		
		//Creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la edad
		int edad;
		
		// Preguntamos la edad del usuario
		System.out.println("Introduce tu edad: ");
		
		try {
			// BLOQUE TRY
			//Aqui va el código que puede fallar
			//Si cualquier instruccion de ste bloque genera un excepcion,
			//Java va a SALTAR al bloque CATCH correspondiente.
			
			edad = sc.nextInt(); // Esta línea puede lanzar InputMissmatchException
			
			//ASERCION
			//Comprobar si la edad introducida tiene sentido.
			//Las aserciones son comprobaciones internas del programador. Se activan con -ea
			//Si la condición es falta---> se lanza AssertionError
			
			assert(edad >= 0 && edad <= 130) : "Edad fuera de rango.";
			
			//Si no ha fallado nada, llegamos aquí
			
			System.out.println("Registro completado correctamente.");
			System.out.println("Edad introducida: " + edad);
			
		} catch(InputMismatchException e) {
			//PRIMER CATCH
			//Este bloque captura errores de tipo InputMismatchException, es decir,
			//cuando el usuario introduce algo que no es un número entero
			
			System.out.println("Error: Deber introducir un número entero válido.");
		} catch (AssertionError e) {
			//SEGUNDO CATCH
			//Captura los errores de asercion.
			//Esto ocurre si la edad NO esta dentro del rango que hemos definido.
			System.out.println("ERROR DE VALIDACIÓN INTERNA: " + e.getMessage());
		} catch (Exception e) {
			//ULTIMO CATCH (General)
			//Captura cualquier otro tipo de excepcion no prevista en casos anteriores
			System.out.println("Error no indentificado.");
		} finally {
			//BLOQUE FINALLY
			//Este bloque se ejecuta SI-EM-PRE:
			// - Halla o no excepción
			// - Se hayan cumplido o no las aserciones
			// - Sa igual cuántos Catch se ejecutan
			
			System.out.println("Cerrando recursos...");
			sc.close();
		}
		
		//Fin del programa
		//Ya fuera del TRY-CATCH-FINALLY el rpograma se ejecuta normalmente
		
		System.out.println("Programa terminado!");		
	}
}
