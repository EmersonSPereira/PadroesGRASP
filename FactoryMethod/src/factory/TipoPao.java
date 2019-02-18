package factory;

/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public enum TipoPao {

	BOLA(1, "Pão Bola"), FRANCES(2, "Pão Francês"), INTEGRAL(3, "Pão Integral");

	private int codigo;
	private String descricao;

	TipoPao(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return codigo;
	}
}
