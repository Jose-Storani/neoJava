package semana4.clase8;

public class Excepciones extends Exception {
	//con extender de la clase Exception convierto mi clase en una exepcion.
	//Existen dos tipos de exceptions, las uncheckeable, donde java no tiene forma de saber que en ese lugar podría existir un error y las chequeable, que son aquellas que se realizan antes de compilar y que java avisa que se necesitan tratar para poder continuar. Por ej el caso de los try catch cuando se usa el buffered reader.
	
	//es importante saber el orden y como se van generando las distintas exepciones para saber que clase o metodo las va a tratar utilizando try/catch. Por una lado, se crea la exception, por otro lado, se utiliza con el throw cuando un metodo puede llegar a arrojarla y por otra lado, se trata con el try/catch desde algun metodo determinado de una clase.
	
	public Excepciones(String mensaje) {
		//una excepcion siempre recibe en su constructor, un mensaje;
		super(mensaje);
		
	}
	
	public static void main(String[] args) {
		try {
			String cadena = null;
			System.out.println(cadena.charAt(0));
		} catch (NullPointerException e) {
			System.err.println("La cadena es nula");
		}
	
		
	}
}

