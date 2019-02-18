
package factory;

/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public enum TipoPresunto {

	PERU(1, "Presunto de Peru"), FRANGO(2, "Presunto de Frango");

	private int codigo;
	private String descricao;

	TipoPresunto(int codigo, String descricao) {
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
