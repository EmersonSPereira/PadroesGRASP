package fachada;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Professor {

	public Professor() {
	}

	// disciplinas Alocadas
	public void buscarRegistroProfessor() {
		System.out.println("Registro de professor encontrado");
	}

	public void buscarDisciplinasProfessor() {
		System.out.println("Disciplinas Encontradas");
	}

	public void ListarDisciplinasAlocadas() {
		System.out.println("o professor ministra aula para as seguintes disciplinas: LP1,Lab de LP1");
	}

	// horas casas
	public void calcularHorasAulas() {
		System.out.println("Horas de Aula Calculada");
	}

	public void calcularHorasProjetosEExtencao() {
		System.out.println("Horas de Projeto e Extanção calculadas");
	}

	public void calcularHorasAtivadadesCaseiras() {
		System.out.println("O professor deve reservar X Horas para ativades caseiras");
	}
}
