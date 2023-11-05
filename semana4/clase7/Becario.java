package semana4.clase7;

public class Becario extends Estudiante{
	protected String numeroBeca;
	public Becario(String nombre, String apellido, String dni,String numeroBeca) {
		super(nombre, apellido, dni);  
		this.numeroBeca = numeroBeca;
	}
	@Override
	public void presentarEstudiante() {
		System.out.println(this.nombre + " " + this.apellido + " " + this.numeroBeca);
	}
	
	public static void main(String[] args) {
		Estudiante e1 = new Becario("Jose","Storani","35702514","12245");
		e1.presentarEstudiante();
	}

}
