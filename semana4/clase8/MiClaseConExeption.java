package semana4.clase8;

public class MiClaseConExeption {
	public void ingresarUsuario() throws Excepciones{
		boolean condicion = false;
		if(!condicion) {
			throw new Excepciones("No se cumplio la condicion");
		}
	}
	
	public void solicitarIngreso() {
		
	}
	
	public static void main(String[] args) {
		MiClaseConExeption clase1 = new MiClaseConExeption();
		try {
			clase1.ingresarUsuario();
		} catch (Excepciones e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
