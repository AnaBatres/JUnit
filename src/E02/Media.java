package E02;
import java.util.Scanner;

public class Media {

	public Media() {
	}

	public static float media() 
	{	
		int i=0, n=0, suma=0, resultado=0; 	
		Scanner sc = new Scanner(System.in);
		System.out.println("*******Hola, por favor introduzca la cantidad de n�meros para calcular la media*******");
		n=sc.nextInt();
		while (i<n) 
		{
			System.out.println("Introduzca el siguiente n�mero");
			suma=suma+sc.nextInt();
			i++;
		}
		resultado = suma/n;
		System.out.println("la media es: "+resultado);
		sc.close();
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		media();
	}

}
