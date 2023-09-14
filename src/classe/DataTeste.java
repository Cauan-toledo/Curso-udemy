package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(31,12,2023);
		
		
        String obterData1 = d1.obterData();	
		System.out.println(obterData1);
		System.out.printf(d2.obterData());
		
		//var d3 = new Data();
		//d3.produto = "celular";
		//d3.preço = "750";
		//d3.cor = "branco";
		
		
		//System.out.printf("\n" + d3.produto + "\n" + d3.preço + 
				 //"\n" + d3.cor);
	}

}
