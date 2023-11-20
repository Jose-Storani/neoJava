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
	public float valorFinal(float valorInicial) {
		// TODO Auto-generated method stub
		if(this.getValorDesc() > tope)return  valorInicial - (valorInicial * tope);
		return valorInicial - (valorInicial * this.getValorDesc());
	}
	
	

}
