package fachada;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		SigFachada sig = new SigFachada();

		/**
		 * Administrativas (reuniões agendadas com a diretoria, entrevistas);
		 */
		System.out.println("Administrativas (reuniões agendadas com a diretoria, entrevistas):");
		System.out.println();
		System.out.println("Administrativas (reuniões agendadas com a diretoria):");
		sig.agendaEntrevista();
		System.out.println();

		System.out.println("Administrativas (entrevistas):");
		sig.agendarReunião();
		System.out.println();
		System.out.println();

		/**
		 * Financeiras (balanço de contas, folha de pagamento);
		 */
		System.out.println("Financeiras (balanço de contas, folha de pagamento):");
		System.out.println();
		System.out.println("Financeiras (balanço de contas):");
		sig.calcularBalanço();
		System.out.println();
		System.out.println("Financeiras (folha de pagamento):");
		sig.folhaDePagamento();
		System.out.println();
		System.out.println();

		/**
		 * Relacionadas ao professores (alocação por disciplina, tempo de casa);
		 */
		System.out.println("Relacionadas ao professores (alocação por disciplina, tempo de casa):");
		System.out.println();
		System.out.println("Relacionadas ao professores (alocação por disciplina):");
		sig.disciplinasAlocadas();
		System.out.println();
		System.out.println("Relacionadas ao professores (tempo de casa):");
		sig.calcularHorarioCasa();
		System.out.println();
		System.out.println();

		/**
		 * Relacionada aos alunos (histórico e mensalidade);
		 */
		System.out.println("Relacionada aos alunos (histórico e mensalidade):");
		System.out.println();
		System.out.println("Relacionada aos alunos (histórico):");
		sig.emitirHistoricoAluno();
		System.out.println();
		System.out.println("Relacionada aos alunos (mensalidade):");
		sig.pagarMensalidade();
		System.out.println();
		System.out.println();
		/**
		 * Ao almoxarifado (estoque, pedido de compra);
		 */
		System.out.println("Ao almoxarifado (estoque, pedido de compra):");
		System.out.println();
		System.out.println("Ao almoxarifado (estoque):");
		sig.emitirRelatorioDeEstoque();
		System.out.println();
		System.out.println("Ao almoxarifado (pedido de compra):");
		sig.realizarVenda();
		System.out.println();
		System.out.println();
		/**
		 * À infra-estrutura (alocação de salas);
		 */
		System.out.println("À infra-estrutura (alocação de salas):");
		sig.alocarSala();

	}

}
