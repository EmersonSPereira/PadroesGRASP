package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */

import java.util.ArrayList;
import java.util.List;

public class Funcionario implements Pessoa {

	private String nome;
	private List<Funcao> funcoes;
	private List<Filmografia> filmografia;

	public Funcionario(String nome) {
		this.nome = nome;
		funcoes = new ArrayList<Funcao>();
		filmografia = new ArrayList<Filmografia>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcao> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(List<Funcao> funcoes) {
		this.funcoes = funcoes;
	}

	public List<Filmografia> getFilmografia() {
		return filmografia;
	}

	public void setFilmografia(List<Filmografia> filmografia) {
		this.filmografia = filmografia;
	}

	// adiciona todas as funões exercidas no filme
	public void adicionarFuncoes(String nome) {
		funcoes.add(new Funcao(nome));
	}

	// adiciona todos os filmes que o funcionario participou e sua função
	public void adicionarFilmografia(String nomeFilme, int ano, String empresa, String funcao) {
		filmografia.add(new Filmografia(nomeFilme, ano, empresa, new Funcao(funcao)));
	}

	// lista a filmografia de um determinado funcionario do filme
	public void listarFilmografia() {
		for (int i = 0; i < filmografia.size(); i++) {
			System.out.println("[ Nome do Filme: " + filmografia.get(i).getNome() + ", " + "Função: "
					+ filmografia.get(i).getFuncao().getNome() + ", Ano: " + filmografia.get(i).getAno() + ", Empresa: "
					+ filmografia.get(i).getEmpresa() + " ]");
		}
	}

}
