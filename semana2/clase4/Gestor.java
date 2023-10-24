package semana2.clase4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Gestor {
	
public static void main(String[] args) {
	//Para utilizar este tipo de metodos y clases que son riesgosos, es necesario utilizar exepciones con el bloque try/catch
	 // Especifica la ruta relativa del archivo
    String rutaArchivo = "archivos\\listaDeberes.txt";

    // Intenta abrir el archivo
    File archivo = new File(rutaArchivo);

    try {
        Scanner scanner = new Scanner(archivo);

        // Lee el archivo línea por línea
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(linea);
        }

        // Cierra el scanner
        scanner.close();
    } catch (FileNotFoundException e) {
        System.err.println("No se pudo encontrar el archivo: " + e.getMessage());
    }
	

}


}
