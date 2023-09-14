package Desafio;

import java.util.Scanner;

public class Desafio_conversao {
	

       public static void main(String[] args) {
		
       Scanner leia = new Scanner(System.in);
       
       System.out.println("Qual o valor do primeiro salario?:");
       String salario01 = leia.next().replace(",", ".");
   
       System.out.println("Qual o valor do segundo salario?:");
       String salario02 = leia.next().replace(",", ".");
       
       System.out.println("Qual o valor do terceiro salario?:");
       String salario03 = leia.next().replace(",", ".");
       
       double salario1 = Double.parseDouble(salario01);
       double salario2 = Double.parseDouble(salario02);
       double salario3 = Double.parseDouble(salario03);
       
       double media =(salario1 + salario2 + salario3) /3;
       System.out.println("A media de salario e de: " + media );
    
       leia.close();
    	
  
    	
    	
	}

}
