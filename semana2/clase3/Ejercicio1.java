package semana2.clase3;

public class Ejercicio1 {
	public void contarLetras(String texto,char letra) {
		int contador = 0;
		for(int i = 0; i <texto.length();i++ ) {
			if(texto.charAt(i) == letra)contador++;
			
		}
		System.out.print("La cantidad de \"" + letra + "\" en el texto: \"" + texto + "\" es de: " + contador);
		
	}
	
	public int[] ordenarNumeros(int numero1,int numero2, int numero3, String orden){
		int[] numerosOrdenados = new int[3];
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
	
	public int sumarElementosVector(int[] arrayNumeros, int numeroComparacion) {
		int suma = 0;
		for(int elemento: arrayNumeros) {
			if(elemento > numeroComparacion) suma+=elemento;
		}
		System.out.println("La suma de elementos mayores a " + numeroComparacion + " es de: " + suma);
		return suma;
	}
	public static void main(String[] args) {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		ejercicio1.contarLetras("Hola mama como estas?", 'a');
		ejercicio1.ordenarNumeros(10, 12, 5, "descendente");
		ejercicio1.sumarElementosVector(new int[]{4,5,10,3,2,2,2,15},2);
		
		
	}
}

