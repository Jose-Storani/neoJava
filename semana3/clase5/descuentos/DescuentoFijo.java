package semana3.clase5.descuentos;

public class DescuentoFijo extends Descuento {

	public DescuentoFijo(float valorDelDescuento) {
		super(valorDelDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) throws ExceptionDiscount {
		if(valorInicial ==0 || valorInicial <0) throw new ExceptionDiscount("No se puede aplicar descuento a un carrito de valor 0 o negativo");
		if(this.getValorDesc() < 0) throw new ExceptionDiscount("El valor del descuento no puede ser negativo");
		return valorInicial - this.getValorDesc();
	}

}
