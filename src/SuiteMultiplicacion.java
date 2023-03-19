import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteMultiplicacion {


	Calculadora c= new Calculadora();
	
	@Test
	public void Test() {
		System.out.println("Caso de prueba 3:");
		assertEquals("Multiplicación erronea", 6, c.multiplicacion(2, 3), 0);
	}
}
