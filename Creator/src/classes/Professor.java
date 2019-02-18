package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 **/

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private int matricula;
	private String nome;
	private Curso curso;
	private List<Turma> turmas;

	public Professor() {
	}

	public Professor(int matricula, String nome, Curso curso) {
		turmas = new ArrayList<>();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	// lista todas as disciplinas .
	public List<Disciplina> getDisciplinas() {
		List<Disciplina> disciplinasProfessor = new ArrayList<>();
		for (Turma t : turmas) {
			if (t.getProfessor().equals(this)) {
				disciplinasProfessor.add(t.getDisciplina());
			}
		}
		return disciplinasProfessor;
	}

	// mostra todos os horarios do professor
	public List<Horario> getHorario() {
		List<Horario> horariosProfessor = new ArrayList<>();
		for (Turma t : turmas) {
			if (t.getProfessor().equals(this)) {
				horariosProfessor.addAll(t.getHorarios());
			}
		}
		return horariosProfessor;
	}

	public void addTurma(Turma turma) {
		if (!turmas.contains(turma))
			turmas.add(turma);
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
		return "Professor [ matricula = " + matricula + ", nome = " + nome + ", curso = " + curso + ", turmas = " + turmas
				+ " ]";
	}
}
