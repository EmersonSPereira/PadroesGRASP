package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private String nome;
	private Horario horario;
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void adicionarAlunos(Aluno aluno) {
		alunos.add(aluno);
	}

	public void listaAlunos() {
		for (int i = 0; i < getAlunos().size(); i++) {
			System.out.print(getAlunos().get(i).getNome() + "|");
		}
	}

	public int quatAlunos() {
		return getAlunos().size();
	}

}
