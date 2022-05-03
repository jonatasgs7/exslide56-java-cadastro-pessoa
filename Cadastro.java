package ExSlide56Construtores;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		
		String resposta = "";
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Deseja informar o nome para o cadastro? (s) para 'Sim' ou (n) para 'Não'");
		resposta = leitura.nextLine();
		
		while(!resposta.equals("s") && !resposta.equals("n")) {
			System.out.println("Resposta inválida. Informe (s) para 'Sim' ou (n) para 'Não'");
			resposta = leitura.nextLine();
		}
		
		if(resposta.equals("s")) {
			
			Pessoa pessoa = new Pessoa();
			
			System.out.println("Insira o nome: ");
			pessoa.nome = leitura.nextLine();
			
			System.out.println("Insira a idade: ");
			pessoa.idade = leitura.nextInt();
			
			pessoa.insereDados(pessoa.nome, pessoa.idade);
			pessoa.exibeDados();
			
		} else {
			Pessoa pessoa = new Pessoa();
			
			System.out.println("Insira a idade");
			pessoa.idade = leitura.nextInt();
			
			pessoa.insereDados(pessoa.idade);
			pessoa.exibeDados();
		}
		
		
	}

}
