import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteResta {

	Calculadora c= new Calculadora();
	
	@Test
	public void Test() {
		System.out.println("Caso de prueba 2:");
		assertEquals("Resta erronea" ,33, c.resta(55, 22), 0);
	}
}
