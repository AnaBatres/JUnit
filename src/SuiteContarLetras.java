import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteContarLetras {

	ContarLetras c= new ContarLetras();
	
	@Test
	public void Test() {
		System.out.println("El contador de letras funciona de puta madre.");
		assertEquals("Na to rayao", 4, c.contarLetras("ana y aaron", 'a'), 0);
	}
	
	
}
