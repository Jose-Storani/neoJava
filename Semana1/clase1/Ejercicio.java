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
		
		System.out.println("UTILIZANDO BUCLE FOR, LOS NUMEROS PARES A LA INVERSA SON: ");
		for(int i = numeroFinal; i >= numeroInicio; i--) {
			if(i %2 ==0) {
				System.out.println(i);
			}
		}
	
		}
		;
		
	public void resolverCaso2() {
		//ingresos mayores o iguales a 489083
		//3 o mas vehiculos con antiguedad menr a 5 años
		// 3 o mas inmuebles
		//tener embarcacion, aeronave de lujo o ser titular de activos societarios que demuestren capacidad economica plena
		
		System.out.println("Ingrese ingresos mensuales totales");
		int ingresosMensuales = keyboardInput.nextInt();
		System.out.println("Ingrese cantidad de vehiculos en posesion cuya antiguedad sea menor a 5 años");
		int vehiculos = keyboardInput.nextInt();
		System.out.println("Posee embaracion, aeronave o es titular de activos societarios? Escriba true para si o false para no");
		boolean activos = keyboardInput.nextBoolean();
		
		if(ingresosMensuales >= 489083 || vehiculos >= 3 || activos == true) System.out.println("Pertenece a la clase de ingresos altos");
		System.out.println("No pertenece a la clase de ingresos altos");
	}
		

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
		//ejercicio1.resolverCaso1();
		ejercicio1.resolverCaso2();

	}

};
