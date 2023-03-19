import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora c = new Calculadora();
	
	@Test
	public void testSuma() {
		System.out.println("Caso de prueba 1:");
		assertEquals("Suma erronea", 4,c.suma(2,2),0);
	}
	
	public void testResta() {
		System.out.println("Caso de prueba 2:");
		assertEquals("Resta erronea" ,33, c.resta(55, 22), 0);
	}
	
	public void testMultiplicacion() {
		System.out.println("Caso de prueba 3:");
		assertEquals("Multiplicación erronea", 6, c.multiplicacion(2, 3), 0);
	}	
	
	public void testDivision() {
		System.out.println("Caso de prueba 4:");
		assertEquals("Division erronea", 10, c.division(20, 2), 0);
	
	}
	
	public void testRaizCuadrada() {
		System.out.println("Caso de prueba 5:");
		assertEquals("Raiz cuadra", 5, c.raiz_cuadrada(25), 0);
	}
}
