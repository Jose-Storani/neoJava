package semana3.clase5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarritoTest {
	private Carrito carrito;
	
	@BeforeEach
	 void setupCarrito() {
		String archivoProductos = "src/semana3/clase5/productos.txt";
		List<Producto> listadoProductos = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivoProductos));
			String linea;
			int contador = 0;

			// leo cada linea de producto dl archivo de texto
			while ((linea = br.readLine()) != null && contador < 3) {
				String[] partes = linea.split(" ");
				listadoProductos.add(new Producto(partes[0], partes[1], Float.parseFloat(partes[2])));
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Ejecutando setup antes de cada prueba.");
        carrito = new Carrito(new Persona("Martin", "Esmeralda", LocalDateTime.of(1991, 4,20,12,0)),listadoProductos,0,0.10f,0.05f);
    }

	@Test
	void test1() {
		assertEquals(carrito.redondearCosto(), 143,83f);
	}
	
	@Test
	void test2() {
		 assertNotEquals(carrito.redondearCosto(), 143);
	}

}
