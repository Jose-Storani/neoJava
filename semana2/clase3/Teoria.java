package semana2.clase3;

public class Teoria {

	
	
	public static void main(String[] args) {
		//Los arrays son estructuras de datos que agrupan conjuntos de elementos del mismo tipo.
		//declaracion:
		int notasParcialFisica[] = new int[5];
		//de esta manera, se crean 10 "slots" para elementos del tipo INT dentro del array, a llenar posteriormente
		notasParcialFisica[0] = 8;
		
		//tambien se puede inicializar directamente:
		int notasParcialHistoria[] = {2,10,4,8,4};
		System.out.println(notasParcialHistoria[0]);
		
		//para recorrer cada elemento y realizar una accion: (similar al foreach en JS, por no decir lo mismo)
		for(int element: notasParcialHistoria) System.out.println(element);
		
		//EN JAVA, los arrays son fixed size, por lo que no se le puede agregar o quitar elementos tan facilmente como en JS.
		
		//STRINGS
		//forma de representar cadenas de texto. Son objetos, a diferencia a otros lenguajes de programacion.
		
		String saludo = "Hola Mario";
		//distintas operaciones pueden realizarse con Strings:
		//comparacion:
		String saludo2 = "Chau Mario";
		saludo.equals(saludo2); // false
		saludo2.toLowerCase();//pasa toda la string a miniscula, uso UpperCase para mayusculas
		saludo.contains("Mario");//verifica si la cadena contiene otra string.
		
		//IMPORTANTE. Metodos como tolowercase o replace, no cambian el valor original del string, devuelven un nuevo String.
		String conString = "Ayudando a los \"invalidos\"";
		
}
}
