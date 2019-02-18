
package factory;

/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public enum TipoQueijo {

	CHEDDAR(1, "Queijo Cheddar"), PRATO(2, "Queijo Prato"), MUSSARELA(3, "Queijo Mussarela");

	private int codigo;
	private String descricao;

	TipoQueijo(int codigo, String descricao) {
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
