package Desafio;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho01 = false;
		boolean trabalho02 = false;
		
		boolean comprouatv50 = trabalho01 && trabalho02;
		boolean comproutv32 = trabalho01 ^ trabalho02;
		boolean tomouSorvete = trabalho01 || trabalho02;
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("comprou a TV de 50\"? " + comprouatv50);
		System.out.println("comprou a TV de 32\"? " + comproutv32);
		System.out.println("comprou o sorvete\"? " + tomouSorvete);
		System.out.println("Ficou mais saldavel\"?" + maisSaudavel);
		
		
		
	
		
		
		
		
		
	}

}
