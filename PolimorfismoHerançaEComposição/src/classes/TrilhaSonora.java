package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */

public class TrilhaSonora {

	private String nomeMusica;
	private String autor;

	public TrilhaSonora(String nomeMusica, String autor) {
		this.nomeMusica = nomeMusica;
		this.autor = autor;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
