package model;

public class Pessoa {
	// Criando as váriaveis (atributos) desta classe;
	public String nome; // Atributo "nome";
	public int idade; // Atributo "idade";
	
	// Construtor;
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Criando um método (função dentro de uma classe) "andar";
	public void andar() {
		System.out.println("*Andando*...");
	}
}
