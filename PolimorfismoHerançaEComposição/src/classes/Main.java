package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */

public class Main {

	public static void main(String[] args) {

		//Criando Filme
		Filme filme1 = new Filme("A procura da Felicidade", 2007, "Globo Filmes");

		filme1.adicionarTrilhaSonora("Openning", "Andrea Guerra");
		filme1.adicionarTrilhaSonora("Homelles", "Andrea Guerra");

		//Criando Funcionários
		Funcionario funcionario1 = new Funcionario("Emerson");

		funcionario1.adicionarFuncoes("Ator");
		funcionario1.adicionarFuncoes("Elenco");
		funcionario1.adicionarFilmografia("Duplex", 2003, "Warner Bros", "Ator");
		funcionario1.adicionarFilmografia("A casa branca", 2001, "Netflix", "Diretor");
		funcionario1.adicionarFilmografia("Duplex", 1998, "Universal", "Maquiador");
		filme1.adicionarFuncionarios(funcionario1);

		Funcionario funcionario2 = new Funcionario("Joanes");

		funcionario2.adicionarFuncoes("Diretor");
		funcionario2.adicionarFuncoes("Camêra");
		funcionario2.adicionarFilmografia("O caçador", 2007, "Warner Bros", "Ator");
		funcionario2.adicionarFilmografia("O atirador de Elite", 2000, "Warner Bros", "Roteirista");
		filme1.adicionarFuncionarios(funcionario2);

		Funcionario funcionario3 = new Funcionario("Wendel");

		funcionario3.adicionarFuncoes("Cinegrafista");
		funcionario3.adicionarFilmografia("Tropa de Elite", 2007, "Universal Studios", "Ator");
		filme1.adicionarFuncionarios(funcionario3);

		Funcionario funcionario4 = new Funcionario("Adriano");

		funcionario4.adicionarFuncoes("Roteirista");
		funcionario4.adicionarFilmografia("Tropa de Elite", 2007, "Universal Studios", "Cinegrafista");
		filme1.adicionarFuncionarios(funcionario4);
		
		//Imorimindo todas as informações do filme
		System.out.println("Filme Produzido: " + filme1.getNome() + ", Ano de Lançamento: " + filme1.getAno());
		System.out.println("Empresa: " + filme1.getEmpresa());
		System.out.println();

		System.out.println("Trilha Sonora: ");
		filme1.listarTrilhaSonora();
		System.out.println();

		System.out.println("Todos os envolvido no filme: ");
		filme1.listarFuncionarios();
		System.out.println();
		
		//imprimindo informções de funcionários
		System.out.println("Filmografia de: " + funcionario1.getNome());
		funcionario1.listarFilmografia();
		System.out.println();

		System.out.println("Filmografia de: " + funcionario2.getNome());
		funcionario2.listarFilmografia();
		System.out.println();

		System.out.println("Filmografia de: " + funcionario3.getNome());
		funcionario3.listarFilmografia();
		System.out.println();

		System.out.println("Filmografia de: " + funcionario4.getNome());
		funcionario4.listarFilmografia();

	}

}
