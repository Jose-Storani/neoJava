package semana3.clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	//JUNIT utiliza anotations. 1 anotation es como avisar a un metodo que tiene que comportarse de cierta manera
	//cuando se ejecute, no es como main, se ejecuta con el bton de al lado del run.
	@Test	
	public void probar() {
		//debemos utilizar las metodos de testing. En el caso de assertEquals, te pide el resultado obtenido y el resultado esperado
			assertEquals(Calculadora.sumar(5, 5), 10);
		}
	
	@Test
	public void sumarTestResultadoString() {
		assertEquals(Calculadora.sumar(3, 3), "6");
	}

}
