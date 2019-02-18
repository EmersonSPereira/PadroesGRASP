package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ComponenteCurricular {
	private List<Disciplina> disciplinas;
	private int codDisciplina;

	public ComponenteCurricular() {
		disciplinas = new ArrayList<>();
		codDisciplina = 0;
	}

	// Adiciona uma nova disciplina
	public Disciplina addNovaDisciplina(String nome, int cargaHoraria) {
		codDisciplina++;
		Disciplina disciplina = new Disciplina(codDisciplina, cargaHoraria, nome);

		// Verificar já foi adicionada
		if (!disciplinas.contains(disciplina)) {
			disciplinas.add(disciplina);
			return disciplina;
		}
		return null;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "ComponenteCurricular [ disciplinas = " + disciplinas + " ]";
	}
}
