package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

public class Sala {
	private int codigo;
	private String local;

	public Sala() {
	}

	public Sala(int codigo, String local) {
		this.codigo = codigo;
		this.local = local;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Sala [ codigo = " + codigo + ", local = " + local + " ]";
	}
}
