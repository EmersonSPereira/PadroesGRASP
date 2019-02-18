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
		 * Administrativas (reuni�es agendadas com a diretoria, entrevistas);
		 */
		System.out.println("Administrativas (reuni�es agendadas com a diretoria, entrevistas):");
		System.out.println();
		System.out.println("Administrativas (reuni�es agendadas com a diretoria):");
		sig.agendaEntrevista();
		System.out.println();

		System.out.println("Administrativas (entrevistas):");
		sig.agendarReuni�o();
		System.out.println();
		System.out.println();

		/**
		 * Financeiras (balan�o de contas, folha de pagamento);
		 */
		System.out.println("Financeiras (balan�o de contas, folha de pagamento):");
		System.out.println();
		System.out.println("Financeiras (balan�o de contas):");
		sig.calcularBalan�o();
		System.out.println();
		System.out.println("Financeiras (folha de pagamento):");
		sig.folhaDePagamento();
		System.out.println();
		System.out.println();

		/**
		 * Relacionadas ao professores (aloca��o por disciplina, tempo de casa);
		 */
		System.out.println("Relacionadas ao professores (aloca��o por disciplina, tempo de casa):");
		System.out.println();
		System.out.println("Relacionadas ao professores (aloca��o por disciplina):");
		sig.disciplinasAlocadas();
		System.out.println();
		System.out.println("Relacionadas ao professores (tempo de casa):");
		sig.calcularHorarioCasa();
		System.out.println();
		System.out.println();

		/**
		 * Relacionada aos alunos (hist�rico e mensalidade);
		 */
		System.out.println("Relacionada aos alunos (hist�rico e mensalidade):");
		System.out.println();
		System.out.println("Relacionada aos alunos (hist�rico):");
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
		 * � infra-estrutura (aloca��o de salas);
		 */
		System.out.println("� infra-estrutura (aloca��o de salas):");
		sig.alocarSala();

	}

}
