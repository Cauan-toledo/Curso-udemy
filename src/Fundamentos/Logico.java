package Fundamentos;

public class Logico {
	public static void main(String[] args) {
		
		boolean condicao01 = true;
		boolean condicao02 = 3 > 7;
		
		System.out.println(condicao01 && condicao02);
		System.out.println(condicao01 || condicao02);
		System.out.println(condicao01 ^ condicao02);
		System.out.println(!condicao02);
		
		System.out.println("tabela verade E (AND,)"); // &&
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("tabela verade OU (OR)"); // ||
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("tabela verade OU Exlusivo(XOR)"); // ^
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("tabela verade NOT)"); // nega�ao !! dupla nega�ao
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}

}
