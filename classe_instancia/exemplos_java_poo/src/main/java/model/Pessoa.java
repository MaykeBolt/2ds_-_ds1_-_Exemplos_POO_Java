package model;

// Aqui você estará definindo uma classe "Pessoa" (Ou seja, a planta(blueprint) de como é 
//  uma pessoa);
public class Pessoa {
// Ela tera um "atributo" publico do tipo "String" com o nome "nome";
	public String nome;
	
// Se cria o construtor;
	public Pessoa (String nome) {
	this.nome = nome; //Irá forçar que utilize a atributo "nome";
	}
}
