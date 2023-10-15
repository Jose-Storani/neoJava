package semana2.clase3;

public class Ejercicio2 {
	String abecedario = "abcdefghijklmnñopqrstuvwxyz";
	public String codificar(String texto, int numeroDesplazamiento) {
		String textoLower = texto.toLowerCase().trim();
		String textoCodificado = "";
		for(int i = 0; i < textoLower.length();i++) {
			int indice = abecedario.indexOf(textoLower.charAt(i));
			if(indice != -1) textoCodificado += abecedario.charAt(indice + numeroDesplazamiento);
			else {
				textoCodificado += abecedario.charAt(numeroDesplazamiento - 1);
			}
			System.out.println(textoCodificado);
			
		}
		return textoCodificado;
		
	}

	public static void main(String[] args) {
		Ejercicio2 ejercicio2 = new Ejercicio2();
		System.out.println(ejercicio2.codificar("Hola como estas?", 1));
		
		
	}
}
