import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteRaizCuadrada {


	Calculadora c= new Calculadora();
	
	@Test
	public void Test() {
		System.out.println("Caso de prueba 5:");
		assertEquals("Raiz cuadra", 5, c.raiz_cuadrada(25), 0);
	}
}
