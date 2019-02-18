package fachada;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Aluno {

	public Aluno() {

	}

	// historico
	public void buscarAluno() {
		System.out.println("Aluno encontrado");
	}

	public void verificarEstadoDaMatricula() {
		System.out.println("Matricula Regurar");
	}

	public void emitirHistorico() {
		System.out.println("Historico Emitido");
	}

	// Mensalidade
	public void buscarMensalidadeAVencer() {
		System.out.println("Mensalidade Encontrada");
	}

	public void realizarPagamento() {
		System.out.println("Pagamente Realizado");
	}

	public void emitirComprovanteDePagamento() {
		System.out.println("comprovante Emitido");
	}

}
