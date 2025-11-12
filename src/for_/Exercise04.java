package for_;

public class Exercise04 {
	public static void main(String[] args) {
		
		//Declaramos una variable para contener la suma de los numeros
		int suma = 0;
		
		//Declaramos una variable para contener un contador para los numeros impares sumados
		int contImpares = 0;
		
		//Usamos for para sumar los 10 primero numeros impares
		for (int cont = 1; contImpares<10; cont += 1) {
			
			if (cont%2==1) {
			suma += cont;
			contImpares++;
			}//Fin if
		}
		//Le mostramos al usuario la suma de los numeros impares
		System.out.println("La suma de los primeros 10 números impares es igual a " + suma);
	
	}
}