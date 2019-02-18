package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

public class Main {

	public static void main(String[] args) {

		// criando os alunos(nome/matricula)

		Aluno aluno1 = new Aluno("Fabio", "11");
		Aluno aluno2 = new Aluno("Douglas", "12");
		Aluno aluno3 = new Aluno("Emerson", "13");
		Aluno aluno4 = new Aluno("Lucas", "14");
		Aluno aluno5 = new Aluno("Luis", "15");

		// criando a disciplina1: matematica
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matematica");

		// definindo um horario para a disciplina1
		Horario horario1 = new Horario("Manhã", 7, 9);
		disciplina1.setHorario(horario1);

		// criando a disciplina2: Informatica
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Informatica");

		// definindo um horario para a disciplina2
		Horario horario2 = new Horario("Manhã", 9, 11);
		disciplina2.setHorario(horario2);

		// adicionando os alunos a disciplina1
		disciplina1.adicionarAlunos(aluno2);
		disciplina1.adicionarAlunos(aluno3);
		disciplina1.adicionarAlunos(aluno4);
		disciplina1.adicionarAlunos(aluno5);

		aluno2.adicionar(disciplina1);
		aluno2.adicionar(disciplina2);

		// adicionando os alunos a disciplina2
		disciplina2.adicionarAlunos(aluno1);
		disciplina2.adicionarAlunos(aluno2);
		disciplina2.adicionarAlunos(aluno3);
		disciplina2.adicionarAlunos(aluno4);
		disciplina2.adicionarAlunos(aluno5);

		// criando um professor para as disciplinas(nome/matricula)
		Professor professor1 = new Professor("Sabrina", "1011");

		// adicionando as disciplinas 1 e 2 para o professor1
		professor1.adicionar(disciplina1);
		professor1.adicionar(disciplina2);

		System.out.println("a. Quais disciplinas um professor esta ministrando;");
		System.out.println();
		System.out.println("Professor: " + professor1.getNome());
		System.out.println("Disciplinas ministradas:");
		professor1.listar();
		System.out.println();
		System.out.println();

		System.out.println("b. Qual o horário de um professor;");
		System.out.println();
		System.out.println("Professor: " + professor1.getNome());
		System.out.println("Horario: ");
		professor1.getHorario();
		System.out.println();

		System.out.println("c. Quais os alunos de uma dada disciplina;");
		System.out.println();
		System.out.println("Alunos da diciplina " + disciplina1.getNome() + ": ");
		disciplina1.listaAlunos();
		System.out.println();
		System.out.println();

		System.out.println("d. Quais as disciplinas de um aluno;");
		System.out.println();
		System.out.println("Aluno: " + aluno2.getNome());
		System.out.println("Disciplinas: ");
		aluno2.listar();
		System.out.println();
		System.out.println();

		System.out.println("e. Qual o horário de um aluno;");
		System.out.println();
		System.out.print("Aluno: " + aluno2.getNome());
		System.out.println();
		System.out.println("Horario: ");
		aluno2.getHorario();
		System.out.println();
		System.out.println();

		System.out.println("f. Qual o número de alunos de uma disciplina.");
		System.out.println();

		System.out.println("Disciplina: " + disciplina1.getNome());
		System.out.println("Qauntidade de alunos: " + disciplina1.quatAlunos());

	}

}
