package semana2.clase4;

import java.util.Scanner;

public class IngresoDatos {
	//para utilizar argumentos por consola, usamos el args.
	//run configuration, arguments, y colocamos la informacion correspondiente que queremos usar.
	//podemos usar la clase Scanner para tomar datos por consola
public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	int datoIngresado = keyboardInput.nextInt();
	System.out.println(datoIngresado);
	int resultado = 0;
	for(int i = 0; i < args.length; i++) {
		resultado += Integer.parseInt(args[i]);
	}
	System.out.println(resultado);
	keyboardInput.close();
}
}
