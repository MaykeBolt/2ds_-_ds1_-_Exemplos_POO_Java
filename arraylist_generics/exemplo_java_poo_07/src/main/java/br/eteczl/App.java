package br.eteczl;

//Importando o ArrayList;
import java.util.ArrayList;
//Importando a classe "Pessoa";
import model.Pessoa;

public class App 
{
 public static void main( String[] args )
 {    	
 	// Instânciando as duas Pessoas;
 	Pessoa p1 = new Pessoa("Amanda", 18);
 	Pessoa p2 = new Pessoa("Arthur", 15);
 	
 	// Criando um grupo de pessoas atráves de uma ArrayList;
 	// O "Pessoa" dentro dos "<>" está sendo considerado um objeto generico, ou seja, ele
 	//  é um generic e então aceita um número maior de tipos de atributos;
 	ArrayList<Pessoa> grupo = new ArrayList<>();
 	grupo.add(p1); //Adicionando elas ao grupo;
 	grupo.add(p2);
 	
 	System.out.print(grupo.toString()); //Mandando mandar no console o nome delas;
 	// Só consigo mandar o nome delas graças ao Override do "toString()" no objeto Pessoa;
 	// Se não retornaria "model.Pessoa@" e um monte de números após o "@";
 }
}
