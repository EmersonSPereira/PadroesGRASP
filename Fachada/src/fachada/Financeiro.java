package fachada;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Financeiro {

	public Financeiro() {

	}

	// Balanço
	public void calcularEntradaDeRecursos() {
		System.out.println("Entrada de recursos calculada");
	}

	public void calcularDespesas() {
		System.out.println("Despesas calculadas");
	}

	public void calcularLucroBruto() {
		System.out.println("Lucro Bruto calculado");
	}

	public void calcularLucroLiquido() {
		System.out.println("Lucro liquido calculado");
	}

	// folha de pagamento

	public void calcularSalariosFunc() {
		System.out.println("Salarios calculados com sucesso");
	}

	public void realizarPagamentoFunc() {
		System.out.println("Funcionários pagos com sucesso");
	}

}
