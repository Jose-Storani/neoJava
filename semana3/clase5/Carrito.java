package semana3.clase5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.*;

//Se que el ejercicio pedia que fueran 3 productos "estaticos", pero me resulto mas escalable hacerlo con ArrayList para que al momento de crear un carrito, se pasen la cantidad de productos que se quiera y no quede atado a solo 3.
public class Carrito {
	Persona cliente;
	List<Producto> productos;
	LocalDateTime fechaCompra;
	Producto producto1;
	
	public Carrito(Persona cliente,List<Producto> productos) {
		this.cliente = cliente;
		this.productos = new ArrayList<>(productos);
		this.fechaCompra = LocalDateTime.now();
		
	}
	
	public float costoFinal() {
		
		float costoFinal = 0;
		for(Producto producto: this.productos) {
			costoFinal += producto.precio;
		}
		return costoFinal;
		

	}
	
	@Override
	public String toString(){
		DecimalFormat df = new DecimalFormat("0.00");
		String numeroFormateado = df.format(this.costoFinal());
		return "El monto a pagar es de: " + numeroFormateado;
	}
	public static void main(String[] args) throws IOException {
		String archivoProductos = "src/semana3/clase5/productos.txt";
		List<Producto> listadoProductos = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivoProductos));
			String linea;
			int contador = 0;
			//leo cada linea de producto dl archivo de texto
			while((linea = br.readLine()) != null && contador <3) {
				String[] partes = linea.split(" ");
				listadoProductos.add(new Producto(partes[0],partes[1],Float.parseFloat(partes[2])));
			}
			br.close();
			
			Carrito carrito001 = new Carrito(new Persona("Martin", "Esmeralda", LocalDateTime.of(1991, 4,20,12,0)),listadoProductos);
			System.out.println(carrito001);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
					
		
		
		
	}
}
