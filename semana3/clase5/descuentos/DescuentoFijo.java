package semana3.clase5.descuentos;

public class DescuentoFijo extends Descuento {

	public DescuentoFijo(float valorDelDescuento) {
		super(valorDelDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) {
		// TODO Auto-generated method stub
		return valorInicial - this.getValorDesc();
	}

}
