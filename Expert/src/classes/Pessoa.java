package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

public abstract class Pessoa {

	private String nome;
	private String matricula;

	public Pessoa(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public abstract void adicionar(Disciplina disciplina);

	public abstract void listar();

	public abstract void getHorario();

}
