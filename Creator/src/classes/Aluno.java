package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

public class Aluno {

	private int matricula;
	private String nome;
	private Curso curso;
	private RDM rdm;

	public Aluno() {

	}

	public Aluno(int matricula, String nome, Curso curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		rdm = new RDM();
	}

	public RDM getRDM() {
		return rdm;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula = " + matricula + ", nome = " + nome + ", curso = " + curso + "]";
	}
}
