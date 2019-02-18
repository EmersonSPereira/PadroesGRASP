package fachada;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Almoxarifado {

	public Almoxarifado() {

	}

	// relatorio de estoque
	public void totadeItensEmEstoque() {
		System.out.println(" XX Itens estão dponíveis no estoque");

	}

	public void calcularValorEstoque() {
		System.out.println("Os Itens em Estoque em estoque somar XX R$");
	}

	// Venda

	public void verificarDisponibilidadeDoProduto() {
		System.out.println("Produto disponível");
	}

	public void pagarProduto() {
		System.out.println("Pagamento pelo produto realizado");

	}

	public void emitirNota() {
		System.out.println("Nota Emitida");
	}

	public void realizarEntregaDoProduto() {
		System.out.println("Produto Entegue");
	}

}
