package Fundamentos;

public class Temperatura {

	  public static void main(String[] args) {
          // ( F - 32) * 5/9 = C
		  final double PI = 5 / 9.0;
		  final double RAIO = 32;
		  
		  double fahrenheit = 52;
		  double celsius = (fahrenheit - RAIO) * PI;
		  System.out.println(" O valor de celsius: " + celsius);
		  
		  fahrenheit = 0;
		  celsius = (fahrenheit - RAIO) * PI; 	  
		  System.out.println(" O valor de celsius: " + celsius);
		  
		  
		
				
	}
}
