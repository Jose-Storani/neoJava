package semana3.clase5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import semana3.clase5.descuentos.Descuento;
import semana3.clase5.descuentos.DescuentoFijo;
import semana3.clase5.descuentos.DescuentoPorcentaje;
import semana3.clase5.descuentos.DescuentoPorcentajeConTope;



//Se que el ejercicio pedia que fueran 3 productos "estaticos", pero me resulto mas escalable hacerlo con ArrayList para que al momento de crear un carrito, se pasen la cantidad de productos que se quiera y no quede atado a solo 3.
public class Carrito {
	Persona cliente;
	List<Producto> productos;
	LocalDateTime fechaCompra;
	Producto producto1;
	float descuentoFijo;
	float descuentoPorcentaje;
	float topeDescuento;
	
	public Carrito(Persona cliente,List<Producto> productos,float descuentoFijo, float descuentoPorcentaje, float topeDescuento) {
		this.cliente = cliente;
		this.productos = new ArrayList<>(productos);
		this.fechaCompra = LocalDateTime.now();
		this.descuentoFijo = descuentoFijo;
		this.descuentoPorcentaje = descuentoPorcentaje;
		this.topeDescuento = topeDescuento;
		
	}
	
	public float determinarCostoTotal() {
		
		float costoInicial = 0;
		for(Producto producto: this.productos) {
			costoInicial += producto.precio;
		}
		
		
		
		if(this.descuentoFijo != 0) {
			Descuento descuentoFijo = new DescuentoFijo(this.descuentoFijo);
			return descuentoFijo.valorFinal(costoInicial);
			
		}
		else if(this.descuentoPorcentaje !=0) {
			if(this.topeDescuento != 0) {
				Descuento descuentoPorcentajeConTope = new DescuentoPorcentajeConTope(this.descuentoPorcentaje,this.topeDescuento);
				return descuentoPorcentajeConTope.valorFinal(costoInicial);
			}
			Descuento descuentoPorcentaje = new DescuentoPorcentaje(this.descuentoPorcentaje);
			
			return descuentoPorcentaje.valorFinal(costoInicial);
		}
		else return costoInicial;
		

	}
	
	public float redondearCosto() {
		DecimalFormat df = new DecimalFormat("0.00");
		String numeroFormateado = df.format(determinarCostoTotal());
		return Float.parseFloat(numeroFormateado);
	}
	@Override
	public String toString(){
		
		return "El monto a pagar es de: " + redondearCosto();
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
			
			Carrito carrito001 = new Carrito(new Persona("Martin", "Esmeralda", LocalDateTime.of(1991, 4,20,12,0)),listadoProductos,0,0.10f,0.05f);
			System.out.println(carrito001);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
					
		
		
		
	}
}
