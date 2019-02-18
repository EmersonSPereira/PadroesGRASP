package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */
public class Horario {
	private String descricao;

	public Horario() {
	}

	public Horario(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Horario [ descricao = " + descricao + "]";
	}
}
