
package git;


import java.util.*;

public class Git {

	public static void main(String[] args) 
	{
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Introduce el numero 1");
		
		double numero1=src.nextDouble();
		
		System.out.println("Introduce el numero 2");
		
		double numero2=src.nextDouble();
		
		menu(numero1,numero2);

	}
	
	public static void menu(double numero1,double numero2) 
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Introduce 1 para sumar");
		System.out.println("Introduce 2 para restar");
		System.out.println("Introduce 3 para dividir");
		System.out.println("Introduce 4 para multiplicar");
		
		int aux=src.nextInt();
		
		switch(aux) 
		{
		case 1 -> System.out.println("El resultado de la suma es "+(numero1+numero2));
		case 2 -> System.out.println("El resultado de la resta es "+(numero1-numero2));
		case 3 -> System.out.println("El resultado de la division es "+(numero1/numero2));
		case 4 -> System.out.println("El resultado de la multiplicacion es "+(numero1*numero2));
		}
		
		
		
	}

}
