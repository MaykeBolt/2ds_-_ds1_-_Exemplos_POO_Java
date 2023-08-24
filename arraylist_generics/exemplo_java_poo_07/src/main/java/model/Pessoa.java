package model;

public class Pessoa {
	public String nome;
	public int idade;
	
	//Construtor;
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Override necessário para me retornar o atributo "nome" e "idade";
	public String toString() {
		return "Nome: "+nome+"; Idade: "+idade;
	}
}


