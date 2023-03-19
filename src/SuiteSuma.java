import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteSuma {
	
	Calculadora c= new Calculadora();
	
	@Test
	public void Test() {
	System.out.println("Caso de prueba 1:");
	assertEquals("Suma erronea", 4,c.suma(2,2),0);
	}
}
