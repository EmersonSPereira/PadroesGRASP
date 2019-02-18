package fachada;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class SigFachada {

	private Aluno aluno;
	private Professor professor;
	private Almoxarifado almoxarifado;
	private Financeiro financeiro;
	private Administracao adm;
	private Estrutura estrutura;

	public SigFachada() {
		aluno = new Aluno();
		professor = new Professor();
		almoxarifado = new Almoxarifado();
		financeiro = new Financeiro();
		adm = new Administracao();
		estrutura = new Estrutura();
	}

	// Administração
	public void agendarReunião() {
		adm.reservarSalaDeReuião();
		adm.marcarHorarioDeReuião();
		adm.avisarParticipantesDaReuião();

	}

	public void agendaEntrevista() {
		adm.reservarSalaDeEntrevista();
		adm.marcarHorarioDeEntrevista();
		adm.avisarImpressaDeEntrevista();
	}

	// Financeiro
	public void calcularBalanço() {
		financeiro.calcularEntradaDeRecursos();
		financeiro.calcularDespesas();
		financeiro.calcularLucroBruto();
		financeiro.calcularLucroLiquido();
	}

	public void folhaDePagamento() {
		financeiro.calcularSalariosFunc();
		financeiro.realizarPagamentoFunc();
	}

	// Professor
	public void disciplinasAlocadas() {
		professor.buscarRegistroProfessor();
		professor.buscarDisciplinasProfessor();
		professor.ListarDisciplinasAlocadas();
	}

	public void calcularHorarioCasa() {
		professor.calcularHorasAulas();
		professor.calcularHorasProjetosEExtencao();
		professor.calcularHorasAtivadadesCaseiras();
	}

	// Aluno
	public void emitirHistoricoAluno() {
		aluno.buscarAluno();
		aluno.verificarEstadoDaMatricula();
		aluno.emitirHistorico();
	}

	public void pagarMensalidade() {
		aluno.buscarAluno();
		aluno.buscarMensalidadeAVencer();
		aluno.realizarPagamento();
		aluno.emitirComprovanteDePagamento();
	}

	// Almoxarifado
	public void emitirRelatorioDeEstoque() {
		almoxarifado.totadeItensEmEstoque();
		almoxarifado.calcularValorEstoque();

	}

	public void realizarVenda() {
		almoxarifado.verificarDisponibilidadeDoProduto();
		almoxarifado.pagarProduto();
		almoxarifado.emitirNota();
		almoxarifado.realizarEntregaDoProduto();
	}

	// Estrutura
	public void alocarSala() {
		estrutura.buscarSalaDispivel();
		estrutura.alocarTurmaNaSala();
	}
}
