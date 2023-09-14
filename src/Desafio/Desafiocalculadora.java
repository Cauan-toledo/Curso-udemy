package Desafio;

import java.util.Scanner;

public class Desafiocalculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
	    double num1 = entrada.nextDouble();		
		
	    System.out.print("Informe um numero: ");
		double num2 = entrada.nextDouble();	
		
		System.out.println("Informe a operaçao: ");
		String op = entrada.next();	
		
		//logica
		
		System.out.printf("%f %S %f = ?", num1, op, num2);
		entrada.close();
	}

}
