package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */

public class Filmografia extends Filme {

	private Funcao funcao;

	public Filmografia(String nomeFilme, int ano, String empresa, Funcao funcao) {
		super(nomeFilme, ano, empresa);
		this.funcao = funcao;

	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

}
