package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private int codigo;
	private Disciplina disciplina;
	private Professor professor;
	private List<Aluno> alunos;
	private List<Sala> salas;
	private List<Horario> horarios;

	public Turma(int codigo, Disciplina disciplina) {
		this.codigo = codigo;
		this.disciplina = disciplina;
		alunos = new ArrayList<>();
		salas = new ArrayList<>();
		horarios = new ArrayList<>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void alocaProfessor(Professor professor) {
		this.professor = professor;
		this.professor.addTurma(this);
	}

	public void alocaSala(Sala sala) {
		if (!salas.contains(sala))
			salas.add(sala);
	}

	public void alocaHorario(Horario horario) {
		if (!horarios.contains(horario))
			horarios.add(horario);
	}

	// faz a matricula de um aluno
	public void matriculaAluno(Aluno aluno) {
		if (!alunos.contains(aluno)) {
			aluno.getRDM().addTurma(this);
			alunos.add(aluno);
		}
	}

	@Override
	public String toString() {
		return "Turma [ codigo = " + codigo + ", disciplina = " + disciplina + ", professor = " + professor
				+ ", alunos = " + alunos + ", salas = " + salas + ", horarios = " + horarios + " ]";
	}
}
