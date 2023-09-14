package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		 
		Produto p1 = new Produto("Notebook", 4356.89);
		
        var p2 = new Produto (); 
		p2.nome = "Caneta Preta";
		p2.preço = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preço * (1 - p1.desconto);
		double precoFinal2 = p2.preço * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Medeia do carrinho = r$%.2f.", mediaCarrinho);
		
	}
}
