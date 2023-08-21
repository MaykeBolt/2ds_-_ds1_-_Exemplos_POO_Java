package model;

// O "extends Pessoa" irá fazer *herança* dos atributos presentes na classe "Pessoa" para a
//  classe "Professor";
// Ou seja, tudo que a classe "Pessoa" tem, a classe "Professor" *herda*;

public class Professor extends Pessoa {
	
	// Construtor;
	public Professor (String nome, int idade) {
	// O "super" faz o "Professor" herdar os atributos "nome" e "idade" da "Pessoa";
		super(nome, idade);
	}
}
