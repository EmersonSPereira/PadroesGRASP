package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Curso {
	private int codigo;
	private String nome;
	private ComponenteCurricular cc;
	private List<Aluno> alunos;
	private List<Professor> professores;

	private int matriculaAluno;
	private int matriculaProfessor;

	public Curso(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;

		cc = new ComponenteCurricular();
		alunos = new ArrayList<>();
		professores = new ArrayList<>();

		matriculaAluno = 0;
		matriculaProfessor = 0;
	}

	// Adiciona uma nova disciplina
	public Disciplina addNovaDisciplinaCC(String nome, int cargaHoraria) {
		return cc.addNovaDisciplina(nome, cargaHoraria);
	}

	// Adiciona um novo aluno ao curso.
	public Aluno addNovoAluno(String nome) {
		matriculaAluno = Integer.parseInt(Calendar.getInstance().get(Calendar.YEAR) + "" + ++matriculaAluno);
		Aluno aluno = new Aluno(matriculaAluno, nome, this);

		if (!alunos.contains(aluno)) {
			alunos.add(aluno);
			return aluno;
		}
		return null;
	}

	// Adiciona um novo professor
	public Professor addNovoPrefessor(String nome) {
		Professor professor = new Professor(++matriculaProfessor, nome, this);

		if (!professores.contains(professor)) {
			professores.add(professor);
			return professor;
		}
		return null;
	}

	// Realiza busca por uma disciplina alocada ao curso
	public Disciplina buscarDisciplina(String nome) {
		for (Disciplina d : cc.getDisciplinas()) {
			if (d.getNome().equals(nome))
				return d;
		}
		return null;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ComponenteCurricular getCc() {
		return cc;
	}

	public void setCc(ComponenteCurricular cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Curso [ codigo = " + codigo + ", nome = " + nome + ", CC = " + cc + " ]";
	}
}
