package factory;

/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public enum TipoPao {

	BOLA(1, "P�o Bola"), FRANCES(2, "P�o Franc�s"), INTEGRAL(3, "P�o Integral");

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
