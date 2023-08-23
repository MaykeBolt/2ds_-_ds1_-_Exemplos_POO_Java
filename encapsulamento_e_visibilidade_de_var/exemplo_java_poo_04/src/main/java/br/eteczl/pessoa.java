package br.eteczl;

public class pessoa {
	    private String nome;
	    private int idade;

	    // Construtor
	    public pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    // Métodos de acesso para o atributo 'nome'
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    // Métodos de acesso para o atributo 'idade'
	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        if (idade >= 0) {
	            this.idade = idade;
	        } else {
	            System.out.println("Idade inválida.");
	        }
	    }
	}
