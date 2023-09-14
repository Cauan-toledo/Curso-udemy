package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informacoes do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		
		short numerodevoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		
		// Tipos numericos rais 
		float salario = 11_445.44F;
		double VendasAcumuladas = 2_991_707_103.01;
		boolean estadoDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A';// ativo
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// Numeros de  viagens 
		System.out.println(numerodevoos * 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / VendasAcumuladas);
		
		System.out.println(id + ": ganha -> "+ salario);
		System.out.println("Ferias?" + estadoDeFerias);
		System.out.println("Status: " + status);
		
	}
}
