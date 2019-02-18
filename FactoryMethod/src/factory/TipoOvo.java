
package factory;

/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public enum TipoOvo {
	
	CAPOEIRA(1, "Ovo de Capoeira"), GRANJA(2, "Ovo de Granja");

	private int codigo;
	private String descricao;

	TipoOvo(int codigo, String descricao) {
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
