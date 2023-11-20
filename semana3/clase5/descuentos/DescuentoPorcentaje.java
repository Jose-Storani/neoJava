package semana3.clase5.descuentos;

public class DescuentoPorcentaje extends Descuento {

	public DescuentoPorcentaje(float valorDelDescuento) {
		super(valorDelDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) {
		// TODO Auto-generated method stub
		return valorInicial - (valorInicial * this.getValorDesc());
	}

}
