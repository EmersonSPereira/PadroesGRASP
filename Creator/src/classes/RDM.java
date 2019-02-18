package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class RDM {

	private List<Turma> turmas;

	public RDM() {
		turmas = new ArrayList<>();
	}

	// lista todas as disciplinas
	public List<Disciplina> getDisciplinas() {
		List<Disciplina> disciplinasAluno = new ArrayList<>();
		for (Turma t : turmas) {
			disciplinasAluno.add(t.getDisciplina());
		}

		return disciplinasAluno;
	}

	// mostra o horario de um aluno
	public List<Horario> getHorario() {
		List<Horario> horariosAluno = new ArrayList<>();
		for (Turma t : turmas) {
			horariosAluno.addAll(t.getHorarios());
		}

		return horariosAluno;
	}

	public void addTurma(Turma turma) {
		if (!turmas.contains(turma))
			turmas.add(turma);
	}

	@Override
	public String toString() {
		return "RDM [ turmas = " + turmas + " ]";
	}
}
