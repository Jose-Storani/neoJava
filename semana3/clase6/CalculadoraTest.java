package semana3.clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	//JUNIT utiliza anotations. 1 anotation es como avisar a un metodo que tiene que comportarse de cierta manera
	//cuando se ejecute, no es como main, se ejecuta con el bton de al lado del run.
	@Test	
	public void probarMultiplicar() {
		//debemos utilizar las metodos de testing. En el caso de assertEquals, te pide el resultado obtenido y el resultado esperado
			assertEquals(Calculadora.multiplicar(80, 3), 240);
		}
	
	@Test
	public void probarSumaryDividir() {
		assertEquals(Calculadora.dividir(Calculadora.sumar(150, 180),3), 110);
	}
	
	@Test
	public void restarYmultiplicar() {
		assertNotEquals(Calculadora.multiplicar(Calculadora.restar(90, 50),15), 605);
	}
	
	@Test
	public void sumarYmultiplicar() {
		assertNotEquals(Calculadora.multiplicar(Calculadora.sumar(70, 40), 25), 2700);
	}

}
