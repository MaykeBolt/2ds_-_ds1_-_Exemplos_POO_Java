//Exemplo de Herança;

package br.eteczl;

// Importando as classes "Pessoa" e "Professor";
import model.Pessoa;
import model.Professor;

public class App 
{
    public static void main( String[] args )
    {
    	// Instância;
    	Pessoa p = new Pessoa ("Huginho", 12);
    	Professor pr = new Professor ("Augusto", 37);
    
    	// Para mostrar o nome e idade do objeto "Professor" no console;
    	System.out.println("Professor}  Nome: "+pr.nome+" | Idade: "+pr.idade);
    }
}