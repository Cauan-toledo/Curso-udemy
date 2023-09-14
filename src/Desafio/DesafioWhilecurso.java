package Desafio;

import java.util.Scanner;

public class DesafioWhilecurso {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDenotas = 0;
		double nota = 0;
		double total = 0;
	    while(nota!=-1) {
	    System.out.println("Informe a nota: ");
	    nota = entrada.nextDouble();
	    
	   if(nota <= 10 && nota >= 0) {
	    total += nota;
	    quantidadeDenotas++;
	    
	    }
	   }
	    double media = total / quantidadeDenotas;
	    System.out.println("Media =" + media);
	    
	    entrada.close(); 
	}

}
