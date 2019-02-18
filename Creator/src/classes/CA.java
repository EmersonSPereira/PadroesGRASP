package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class CA {

	private int codCurso;
	private List<Curso> cursos;

	public CA() {
		cursos = new ArrayList<>();
		codCurso = 0;
	}

	// Adiciona um novo curso
	public Curso addNovoCurso(String nome) {
		codCurso++;

		Curso curso = new Curso(codCurso, nome);

		// Verifica se o curso já foi inserido
		if (!cursos.contains(curso)) {
			cursos.add(curso);
			return curso;
		}
		return null;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "CA [cursos = " + cursos + "]";
	}
}
