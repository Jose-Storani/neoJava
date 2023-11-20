package semana3.clase5.descuentos;

public abstract class Descuento {
	private float valor;
	
	public Descuento(float valorDelDescuento) {
		this.valor = valorDelDescuento;
	}
	public float getValorDesc() {
		return this.valor;
	}
	public void setValorDesc( float valor) {
		this.valor = valor;
	}
	
	public abstract float valorFinal(float valorInicial) throws ExceptionDiscount;
	
}
