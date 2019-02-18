package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

public class Main {
	public static void main(String[] args) {
		CA ca = new CA();
		Curso computacao = ca.addNovoCurso("Computação");
		Curso matematica = ca.addNovoCurso("Matematica");

		// Criando novas disciplinas do curso
		computacao.addNovaDisciplinaCC("Metodos Avançados de Programação", 60);
		computacao.addNovaDisciplinaCC("Laboratorio de Programação", 60);
		computacao.addNovaDisciplinaCC("Paradigmas Educacionais", 60);
		computacao.addNovaDisciplinaCC("Calculo 1", 60);

		matematica.addNovaDisciplinaCC("Calculo 1", 60);
		matematica.addNovaDisciplinaCC("Calculo 2", 60);
		matematica.addNovaDisciplinaCC("Calculo 3", 60);

		// Adicionando alunos ao curso
		Aluno al1 = computacao.addNovoAluno("Joanes Miranda");
		Aluno al2 = computacao.addNovoAluno("Emerson Pereira");

		// Criando professores do curso
		Professor pf1 = computacao.addNovoPrefessor("Fabio");
		Professor pf2 = computacao.addNovoPrefessor("Edson");
		Professor pf3 = computacao.addNovoPrefessor("Camila");

		Professor pf4 = matematica.addNovoPrefessor("Fred");

		// Criando Horarios
		Horario h1 = new Horario("Segunda 7:00 as 9:00");
		Horario h2 = new Horario("Segunda 9:00 as 11:00");
		Horario h3 = new Horario("Terça 7:00 as 9:00");
		Horario h4 = new Horario("Terça 9:00 as 11:00");
		Horario h5 = new Horario("Quarta 7:00 as 9:00");
		Horario h6 = new Horario("Quinta 11:00 as 13:00");
		Horario h7 = new Horario("Sexta 11:00 as 13:00");

		// Criando Salas
		Sala sala1 = new Sala(1, "LAB.INF.II (CIAC)");
		Sala sala2 = new Sala(1, "LAB.INF.III (CIAC)");
		Sala sala3 = new Sala(1, "Lab. I.A (A204)");
		Sala sala4 = new Sala(1, "220 (CIAC)");

		// definindo os horarios da disciplina
		Disciplina map = computacao.buscarDisciplina("Metodos Avançados de Programação");
		Turma t1 = map.abrirTurma();
		t1.alocaHorario(h1);
		t1.alocaHorario(h7);
		t1.alocaSala(sala2);
		t1.alocaSala(sala3);

		// Alocando professor a turma
		t1.alocaProfessor(pf1);

		// Matriculando alunos a uma turma
		t1.matriculaAluno(al1);
		t1.matriculaAluno(al2);

		// definindo os horarios da turma de Laboratorio de Programação
		Disciplina lab = computacao.buscarDisciplina("Laboratorio de Programação");
		Turma t2 = lab.abrirTurma();
		t2.alocaHorario(h2);
		t2.alocaHorario(h7);
		t2.alocaSala(sala4);
		t2.alocaProfessor(pf2);
		t2.matriculaAluno(al1);

		// definindo os horarios da turma Paradigmas Educacionais
		Disciplina paradigmas = computacao.buscarDisciplina("Paradigmas Educacionais");
		Turma t3 = paradigmas.abrirTurma();
		t3.alocaHorario(h3);
		t3.alocaHorario(h7);
		t3.alocaSala(sala2);
		t3.alocaProfessor(pf2);
		t3.matriculaAluno(al1);

		System.out.println("a. Quais disciplinas um professor esta ministrando;");
		System.out.println();
		System.out.println("Disciplinas do professor(a): " + pf1.getNome() + "\n" + pf1.getDisciplinas());
		System.out.println();
		System.out.println();

		System.out.println("b. Qual o horário de um professor;");
		System.out.println();
		System.out.println("Horario do professor(a): " + pf1.getNome() + "\n" + pf1.getHorario());
		System.out.println();
		System.out.println();

		System.out.println("c. Quais os alunos de uma dada disciplina;");
		System.out.println();
		System.out.println("Alunos matriculados na disciplina: " + map.getNome() + "\n" + map.getAlunos() + "\n");
		System.out.println();
		System.out.println();

		System.out.println("d. Quais as disciplinas de um aluno;");
		System.out.println();
		System.out.println("Disciplina do aluno(a): " + al1.getNome() + "\n" + al1.getRDM().getDisciplinas());
		System.out.println();
		System.out.println();

		System.out.println("e. Qual o horário de um aluno;");
		System.out.println();
		System.out.println("Horario do aluno: " + al1.getNome() + "\n" + al1.getRDM().getHorario());
		System.out.println();
		System.out.println();

		System.out.println("f. Qual o número de alunos de uma disciplina.");
		System.out.println();
		System.out.println("Total de alunos matriculados na disciplina: " + map.getNome() + "\n" + map.getQuatAlunos());
	}
}
