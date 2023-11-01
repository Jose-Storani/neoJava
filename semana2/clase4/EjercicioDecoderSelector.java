package semana2.clase4;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import semana2.clase3.Ejercicio2;

public class EjercicioDecoderSelector {
	
	public static void coderOrDecoder(String opcion, String valorDesplazamiento, String entrada, String salida) throws IOException {
		File archivoEntrada = new File(entrada);
		FileWriter archivoSalida = new FileWriter(salida);
		Scanner scanner = new Scanner(archivoEntrada);
		String mensaje = "";
		while(scanner.hasNextLine()) {
			String lineaMensaje = scanner.nextLine();
			mensaje += lineaMensaje;
		}
		
		
		if(opcion.equals("codificar")) {
			String mensajeCodificado = Ejercicio2.codificar(mensaje, Integer.parseInt(valorDesplazamiento));
			archivoSalida.write(mensajeCodificado);
			System.out.println("Codificacion completada");
		}
		else{
			String mensajeDecodificado = Ejercicio2.decodificar(mensaje, Integer.parseInt(valorDesplazamiento));
			archivoSalida.write(mensajeDecodificado);
			System.out.println("Decodificacion completada");
		}
		
		scanner.close();
		archivoSalida.close();
		
		
	}
	
	public static void main(String[] args) throws IOException {
//debera pasar por parametros en orden: codificar o decodificar, el valor del desplazamiento, archivo de entrada y archivo de salida		
		coderOrDecoder(args[0], args[1], args[2], args[3]);
		
		
		
	}
}
