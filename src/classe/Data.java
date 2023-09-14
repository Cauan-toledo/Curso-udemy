package classe;

public class Data {
	
	int Dia;
	int mes; 
	int ano;
	
	Data() {
		Dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data(int diainteiro,int mesinteiro,int anointeiro) {
	    Dia = diainteiro;
		mes = mesinteiro;
		ano = anointeiro;
	}
	
	
	
	String obterData() {
	  return String.format("%d/%d/%d/", Dia, mes, ano);
	} 
	  
	
			  
 
	
}
