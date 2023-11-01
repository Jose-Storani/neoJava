package semana2.clase4;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
//1-a		
//ordenarNumeros(args, "descendente");
		
//1-b
	//ordenarNumerosConsola(new int[3], "descendente");
		
//1-c
		seleccionarProgramaOrdenarNumeros(args,"descendente");

}
	
	public static int[] ordenarNumeros(String args[], String orden){
		int[] numerosOrdenados = new int[3];
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		int numero3 = Integer.parseInt(args[2]);
		int numeroMayor;
		int numeroMedio;
		int numeroMenor;
		
		if(numero1 <= numero2 && numero1 <= numero3) {
			numeroMenor = numero1;
			
			if(numero2<= numero3) {
				numeroMayor = numero3;
	
				numeroMedio = numero2;
			}
			else {
				numeroMayor = numero2;
				numeroMedio = numero3;
			}
		
		}
		else if(numero2 <= numero1 && numero2<= numero3) {
			numeroMenor = numero2;
			if(numero1<=numero3) {
				numeroMedio = numero1;
				numeroMayor = numero3;
			}
			else {
				numeroMedio = numero3;
				numeroMayor = numero1;
			}
		}
		
		else {
			numeroMenor = numero3;
			if(numero1 <=numero2) {
				numeroMedio = numero1;
				numeroMayor = numero2;
			}
			else {
				numeroMayor = numero2;
				numeroMedio = numero1;
			}
		}
		
		numerosOrdenados[0] = numeroMenor;
		numerosOrdenados[1] = numeroMedio;
		numerosOrdenados[2] = numeroMayor;
		
		if(orden.equals("descendente")) {
			numerosOrdenados[0] = numeroMayor;
			numerosOrdenados[2] = numeroMenor;
		}
		
		for(int numeros: numerosOrdenados) {
			System.out.println(numeros);
		}
		return numerosOrdenados;
	}
	
	public static int[] ordenarNumerosConsola(int numeros[], String orden){
		int[] numerosOrdenados = new int[3];
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int numero1 = keyboardInput.nextInt();
		numeros[0] = numero1;
		System.out.println("Ingrese el segundo numero");
		int numero2 = keyboardInput.nextInt();
		numeros[1] = numero2;
		System.out.println("Ingrese el tercer numero");
		int numero3 = keyboardInput.nextInt();
		numeros[2] = numero3;
		int numeroMayor;
		int numeroMedio;
		int numeroMenor;
		keyboardInput.close();
		
		if(numero1 <= numero2 && numero1 <= numero3) {
			numeroMenor = numero1;
			
			if(numero2<= numero3) {
				numeroMayor = numero3;
	
				numeroMedio = numero2;
			}
			else {
				numeroMayor = numero2;
				numeroMedio = numero3;
			}
		
		}
		else if(numero2 <= numero1 && numero2<= numero3) {
			numeroMenor = numero2;
			if(numero1<=numero3) {
				numeroMedio = numero1;
				numeroMayor = numero3;
			}
			else {
				numeroMedio = numero3;
				numeroMayor = numero1;
			}
		}
		
		else {
			numeroMenor = numero3;
			if(numero1 <=numero2) {
				numeroMedio = numero1;
				numeroMayor = numero2;
			}
			else {
				numeroMayor = numero2;
				numeroMedio = numero1;
			}
		}
		
		numerosOrdenados[0] = numeroMenor;
		numerosOrdenados[1] = numeroMedio;
		numerosOrdenados[2] = numeroMayor;
		
		if(orden.equals("descendente")) {
			numerosOrdenados[0] = numeroMayor;
			numerosOrdenados[2] = numeroMenor;
		}
		
		for(int numerosArray: numerosOrdenados) {
			System.out.println(numerosArray);
		}
		return numerosOrdenados;
	}

	public static int[] seleccionarProgramaOrdenarNumeros(String[] args,String orden) {
		if(args.length == 0) return ordenarNumerosConsola(new int[3], orden);
		else return ordenarNumeros(args, orden);
	}
};