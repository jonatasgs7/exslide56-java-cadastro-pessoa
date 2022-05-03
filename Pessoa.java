package ExSlide56Construtores;

public class Pessoa {
	public String nome = "";
	public int idade;
	
	public void insereDados(String nomePessoa, int idadePessoa) {
		this.nome = nomePessoa;
		this.idade = idadePessoa;
	}
	
	public void insereDados(int idadePessoa) {
		this.idade = idadePessoa;
	}
	
	public void exibeDados() {
		if(!nome.isEmpty()) {
			System.out.println("Nome: "+nome+" - Idade: "+idade);
		} else {
			System.out.println("Idade: "+idade);
		}
	}
}
