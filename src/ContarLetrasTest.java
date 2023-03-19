import static org.junit.Assert.*;

import org.junit.Test;

public class ContarLetrasTest {

	ContarLetras c = new ContarLetras();
	
	@Test
	public void test() {
		System.out.println("Caso de prueba 1:");
		assertEquals("Error", 4,c.contarLetras("ana y aaron", 'a'), 0);
	}

}
