package semana2.clase4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioArchivo {
	
	public static void main(String[] args) {
		String rutaArchivo = args[0];
		File archivo = new File(rutaArchivo);
		
		try {
			Scanner scanner = new Scanner(archivo);
			Scanner keyboardInput = new Scanner(System.in);
			
			System.out.println("Escriba suma o multiplicacion");
			String operacion = keyboardInput.nextLine();
			
			int resultado = 0;
			if(operacion.equals("multiplicar")) resultado = 1;
			
			
			 while (scanner.hasNextLine()) {
		            int lineaNumero = Integer.parseInt(scanner.nextLine());
		            if(operacion.equals("suma") ) {
		            	resultado += lineaNumero;
		            }
		            else resultado *= lineaNumero;	            
		            
		        }
			 System.out.println(resultado);
			 scanner.close();
			 keyboardInput.close();
			 
			
		} catch (FileNotFoundException e) {
			System.err.println("No se pudo encontrar el archivo: " + e.getMessage());
		}
		
		
	}
}
