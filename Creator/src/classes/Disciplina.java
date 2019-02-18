package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private int codigo;
	private int cargaHoraria;
	private String nome;
	private List<Turma> turmas;

	private int codigoTurma;

	public Disciplina(int codigo, int cargaHoraria, String nome) {
		turmas = new ArrayList<>();
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.nome = nome;
		codigoTurma = 0;
	}

	public Turma abrirTurma() {
		Turma turma = new Turma(++codigoTurma, this);
		if (!turmas.contains(turma)) {
			turmas.add(turma);
			return turma;
		}
		return null;
	}

	// lista os alunos matriculados na disciplina.
	public List<Aluno> getAlunos() {
		List<Aluno> alunos = new ArrayList<>();
		for (Turma t : turmas) {
			alunos.addAll(t.getAlunos());
		}
		return alunos;
	}

	// Rertorna o total de alunos matriculados.
	public int getQuatAlunos() {
		return getAlunos().size();
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Disciplina [ codigo = " + codigo + ", cargaHoraria = " + cargaHoraria + ", nome = " + nome + " ]";
	}
}
