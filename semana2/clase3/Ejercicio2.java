package semana2.clase3;

import java.util.Random;

public class Ejercicio2 {
	static private Random random = new Random();
	static private String abecedario = "abcdefghijklmnñopqrstuvwxyz";

	public static String codificar(String texto, int numeroDesplazamiento) {
		String textoLower = texto.toLowerCase().trim();
		String textoCodificado = "";
		for (int i = 0; i < textoLower.length(); i++) {
			int indice = abecedario.indexOf(textoLower.charAt(i));
			if (indice != -1) {
				int posicionFinal = indice + numeroDesplazamiento; // 27
				if (posicionFinal > abecedario.length() - 1) {
					int sobrante = posicionFinal - abecedario.length();
					textoCodificado += abecedario.charAt(sobrante);
				} else
					textoCodificado += abecedario.charAt(indice + numeroDesplazamiento);
			} else {
				textoCodificado += random.nextInt(9 - 1 + 1) + 1;
			}

		}
		return textoCodificado;

	}

	public static String decodificar(String textoCodificado, int numeroDesplazamiento) 
	{
		String textoLimpio = textoCodificado.toLowerCase().trim();
		String textoDecodificado = "";
		for (int i = 0; i < textoLimpio.length(); i++) {
			int indiceCode = abecedario.indexOf(textoLimpio.charAt(i));
				if (indiceCode != -1) {
					int posicionFinal = indiceCode - numeroDesplazamiento;
					if (posicionFinal < 0) {
					textoDecodificado += abecedario.charAt(abecedario.length() - posicionFinal);
					} else {
					textoDecodificado += abecedario.charAt(posicionFinal);
					}
				} 
				else {
					textoDecodificado += " ";
				}
			}
		
		return textoDecodificado;
	}

	public static void main(String[] args) {
		
		System.out.println(codificar("mensaje secreto", 1));
		System.out.println(decodificar("nfñtbkf1tfdsfup", 1));
		

	}
}
