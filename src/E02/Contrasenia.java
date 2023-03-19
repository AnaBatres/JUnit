package E02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Contrasenia 
{
	public Contrasenia() {
	}
	
	public static boolean stringContainsNumber( String s )
	{
	    return Pattern.compile( "[0-9]" ).matcher( s ).find();
	}
	
	public static boolean stringContainsMayus( String s )
	{
	    return Pattern.compile( "[A-Z]" ).matcher( s ).find();
	}
	
	public static boolean stringContainsMinus( String s )
	{
	    return Pattern.compile( "[a-z]" ).matcher( s ).find();
	}
	
	public static boolean validador ()
	{
		String usuario;
		String password;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******Hola, por favor introduce tu usuario*******");
		usuario=sc.nextLine();
		System.out.println("*******Hola, por favor introduce tu contrase�a*******");
		password=sc.nextLine();
		
		if(stringContainsMayus(password)) 
		{ 
			if(stringContainsNumber(password)) 
			{ 
				  if(stringContainsMinus(password)) 
				  { 
					  if(password.length()>=8) 
					  {
		  
					  } else { System.out.println("Longitud menor que 8"); return false;} 
				} else { System.out.println("No contiene min�sculas"); return false; } 
			} else { System.out.println("No contiene numeros"); return false;} 
		} else { System.out.println("No contiene may�sculas"); return false; }
		System.out.println("Bienvenido al sistema: "+usuario);
		sc.close();
		return true;
	}
		
	public static void main(String[] args) 
	{	
		validador();
	}

}
