package controle;

import java.util.Scanner;

public class Dowhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Fale a palavrinha magica...!" );
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("Por favor"));
		
		
		
		System.out.println("Obrigado");
		entrada.close();
		
		
			
		
		
		
	}

}
