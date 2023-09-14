package Desafio;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		 
	 
	String email = "suzylinda@gmail.com";
	String senha = "suzymaravilhosa";
	
	System.out.println("===================================================");
	System.out.println("=  				 FAÇA SEU LOGIN 	 =");
	System.out.println("===================================================");
	
	
	/*
	 * -> sistema deve pedir pra informar email e a senha
	 * -> se a senha ou email estiverem inválidos pedir para que o usuário digite novamente
	 * -> limmite de tentativas: 5 se exeder escrever "senha ou email inválido tente novamente mais tarde"
	 * -> se estiver email e senha válido escrever "Usuário logado seja bem-vindo!"
	 */
	
	Scanner entrada = new Scanner(System.in);
	
	do {
		System.out.println("Informe o email:");
		email = entrada.nextLine(); 
		
	    System.out.println("informe a senha:");
		senha = entrada.nextLine();
		
       }while(!email.equalsIgnoreCase("suzylinda@gmail.com"));
	    while(!senha.equalsIgnoreCase("suzymaravilhosa"));

	    
	  
	
	
	entrada.close();
	
	
	
		
		
	
	 
	}

}
