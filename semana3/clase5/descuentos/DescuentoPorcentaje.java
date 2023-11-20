package semana3.clase5.descuentos;

public class DescuentoPorcentaje extends Descuento {

	public DescuentoPorcentaje(float valorDelDescuento) {
		super(valorDelDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) throws ExceptionDiscount {
		if(valorInicial ==0) throw new ExceptionDiscount("No se puede aplicar descuento a un carrito de valor 0");
		if(this.getValorDesc() < 0) throw new ExceptionDiscount("El valor del descuento no puede ser negativo");
		return valorInicial - (valorInicial * this.getValorDesc());
	}

}
