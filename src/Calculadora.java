
public class Calculadora 
{
	float resultado;
	
	public Calculadora() {

	}
	
	public void pedirOperandos()
	{
		System.out.println("Por favor introduzca el primer operando");
	}
	
	public float suma(float operando1, float operando2)
	{
		resultado = operando1 + operando2;
		return resultado;
	}

	public float resta(float operando1, float operando2)
	{
		resultado = operando1 - operando2;
		return resultado;
	}
	
	public float multiplicacion(float operando1, float operando2)
	{
		resultado = operando1 * operando2;
		return resultado;
	}
	
	public float division(float operando1, float operando2)
	{
		if(operando2!=0)
		{
			resultado = operando1 / operando2;
			return resultado;
		}
		else 
		{
			System.out.println("El segundo operando no puede ser 0");
			return -1;
		}
	}
	
	public float raiz_cuadrada(float operando1)
	{
		if(operando1>=1)
		{
			return (float) Math.sqrt(operando1);
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		System.out.println("Metodo suma: "+c1.suma(1, 2));
		System.out.println("Metodo resta: "+c1.resta(1, 2));
		System.out.println("Metodo multiplicacion: "+c1.multiplicacion(1, 2));
		System.out.println("Metodo division: "+c1.division(1, 0));
		System.out.println("Metodo raiz cuadrada: "+c1.raiz_cuadrada(-4));
	}

}
