import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteDivision {


	Calculadora c= new Calculadora();
	
	@Test
	public void Test() {
		System.out.println("Caso de prueba 4:");
		assertEquals("Division erronea", 10, c.division(20, 2), 0);
	}
}
