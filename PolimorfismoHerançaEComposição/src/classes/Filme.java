package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */

import java.util.ArrayList;
import java.util.List;

public class Filme {

	private String nomeFilme;
	private int ano;
	private String empresa;

	List<Funcionario> funcionarios;
	List<TrilhaSonora> trilhaSonora;

	public Filme(String nome, int ano, String empresa) {
		this.nomeFilme = nome;
		this.ano = ano;
		this.empresa = empresa;
		funcionarios = new ArrayList<Funcionario>();
		trilhaSonora = new ArrayList<TrilhaSonora>();
	}

	public String getNome() {
		return nomeFilme;
	}

	public void setNome(String nome) {
		this.nomeFilme = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<TrilhaSonora> getTrilhaSonora() {
		return trilhaSonora;
	}

	public void setTrilhaSonora(List<TrilhaSonora> trilhaSonora) {
		this.trilhaSonora = trilhaSonora;
	}

	// adiciona funcionarios previamente criados ao filme
	public void adicionarFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	// cria uma trilha sonora para o filme
	public void adicionarTrilhaSonora(String nomeMusica, String autor) {
		trilhaSonora.add(new TrilhaSonora(nomeMusica, autor));
	}

	// lista todos os funcionarios do filme e suas respectivas funções
	public void listarFuncionarios() {
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println("Nome: " + funcionarios.get(i).getNome());

			for (int j = 0; j < funcionarios.get(i).getFuncoes().size(); j++) {
				System.out.println("Função: " + funcionarios.get(i).getFuncoes().get(j).getNome());
			}
			System.out.println();
		}
	}

	// lista a trilha sonora do filme
	public void listarTrilhaSonora() {
		for (int i = 0; i < trilhaSonora.size(); i++) {
			System.out.println("[ Nome da Musica: " + trilhaSonora.get(i).getNomeMusica() + " " + "Autor: "
					+ trilhaSonora.get(i).getAutor() + "]");
		}
	}

}
