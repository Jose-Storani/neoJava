package semana3.clase5.descuentos;

import semana3.clase5.Carrito;

public class ExceptionDiscount extends Exception {
	private Carrito carrito;
	public ExceptionDiscount(String mensaje) {
		super(mensaje);
	}
	
}
