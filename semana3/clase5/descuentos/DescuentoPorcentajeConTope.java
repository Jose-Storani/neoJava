package semana3.clase5.descuentos;

public class DescuentoPorcentajeConTope extends Descuento {
	private float tope;;
	public DescuentoPorcentajeConTope(float valorDelDescuento,float tope) {
		super(valorDelDescuento);
		this.tope = tope;
		// TODO Auto-generated constructor stub
	}

	//En caso de que el descuento a aplicar sea mayor al tope determinado, devuelvo el descuento maximo aplicado con tope.
	@Override
	public float valorFinal(float valorInicial) throws ExceptionDiscount {
		if(valorInicial ==0) throw new ExceptionDiscount("No se puede aplicar descuento a un carrito de valor 0");
		if(this.getValorDesc() < 0) throw new ExceptionDiscount("El valor del descuento no puede ser negativo");
		if(this.getValorDesc() > tope)return  valorInicial - (valorInicial * tope);
		return valorInicial - (valorInicial * this.getValorDesc());
	}
	
	

}
