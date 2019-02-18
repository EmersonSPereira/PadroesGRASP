package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

	Aluno(String nome, String matricula) {
		super(nome, matricula);
	}

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public void adicionar(Disciplina disciplina) {
		disciplinas.add(disciplina);

	}

	@Override
	public void listar() {
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.print(disciplinas.get(i).getNome() + " | ");
		}

	}

	@Override
	public void getHorario() {
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i).getNome() + ": " + disciplinas.get(i).getHorario().getHoraInicio()
					+ " as " + disciplinas.get(i).getHorario().getHoraFim());
		}

	}

}
