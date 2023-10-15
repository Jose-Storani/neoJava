package Semana1.clase1;

import java.util.Scanner;

public class Ejercicio {
	Scanner keyboardInput = new Scanner(System.in);

	public void resolverCaso1() {
		System.out.println("Ingrese el numero inicial");
		int numeroInicio = keyboardInput.nextInt();
		System.out.println("Ingrese el numero final");
		int numeroFinal = keyboardInput.nextInt();

		// caso 1 - A
		if (numeroInicio > numeroFinal)
			System.err.print("ERROR: EL NUMERO INICIAL DEBE SER MENOR O IGUAL AL FINAL");
		int contador = numeroInicio;
		while (contador <= numeroFinal) {
			System.out.println(contador);
			contador++;
		}
		contador = numeroInicio;

		// CASO B
		this.mostrarPares(contador, numeroFinal);
		contador = numeroInicio;

		// CASO C

		System.out.println("Ingrese 1 si desea mostrar numeros impares o 0 si desea mostrar numeros pares de intervalo");
		int selection = keyboardInput.nextInt();
		while (selection != 0 && selection != 1) {
			System.err.println("DEBE INGRESAR 1 o 0");
			System.out.println(
					"Ingrese 1 si desea mostrar numeros impares o 0 si desea mostrar numeros pares de intervalo");
			selection = keyboardInput.nextInt();
		}

		if (selection == 0) {
			this.mostrarPares(contador, numeroFinal);
		} else {
			this.mostrarImpares(contador, numeroFinal);
			}
		contador = numeroInicio;
		
		System.out.println("UTILIZANDO BUCLE FOR, LOS NUMEROS PARES SON: ");
		for(int i = numeroFinal; i >= numeroInicio; i--) {
			if(i %2 ==0) {
				System.out.println(i);
			}
		}
	
		}
		;
		

	public void mostrarPares(int numeroContador, int numeroFinal) {
		System.out.println("LOS NUMEROS PARES DEL INTERVALO SON: ");
		while (numeroContador <= numeroFinal) {
			if (numeroContador % 2 == 0)
				System.out.println(numeroContador);
			numeroContador++;
		}

	};
	
	public void mostrarImpares(int numeroContador, int numeroFinal) {
		System.out.println("LOS NUMEROS IMPARES DEL INTERVALO SON: ");
		while (numeroContador <= numeroFinal) {
			if (numeroContador % 2 != 0)
				System.out.println(numeroContador);
			numeroContador++;
		}
	}

	public static void main(String[] args) {
		Ejercicio ejercicio1 = new Ejercicio();
		ejercicio1.resolverCaso1();

	}

};
