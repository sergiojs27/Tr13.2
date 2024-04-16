
package git;


import java.util.*;
/*
 * Esta calse se encarga de ejecutar mediante dos numeros la operacion matematica escojida, tiene 2 metodos
 * @author Sergio Junquera
 * @date 15/04/2024
 */
public class Git {
    /*
     * Este metodo pide los numeros al usuario y llama al otro metodo pasando los numeros por parametro
     */
	public static void main(String[] args) 
	{
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Introduce el numero 1");
		
		double numero1=src.nextDouble();
		
		System.out.println("Introduce el numero 2");
		
		double numero2=src.nextDouble();
		
		menu(numero1,numero2);

	}
	/*
	 * Estemetodo recive dos numeros por parametro y se encarga de realizar la operacion elejida
	 */
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
