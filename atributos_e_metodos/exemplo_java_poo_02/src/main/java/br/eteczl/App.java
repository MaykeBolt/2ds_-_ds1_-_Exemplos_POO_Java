//Exemplo de Atributos e Métodos;

package br.eteczl;

// Importando as classes;
import model.Pessoa;
import model.Professor;

public class App 
{
    public static void main( String[] args )
    {
    	// Levando as classes "Pessoa" e "Professor" a realidade (Instânciando); 
        Pessoa p = new Pessoa("Huginho", 12); 
        Professor pr = new Professor("Augusto", 37);
        
        // Mostrando quem está andando pela chamada do atributo "nome";
        System.out.print(p.nome+": ");
        p.andar(); // Chamando o método "andar" do objeto "Pessoa"
        
        // Só para separar os personagens;
        System.out.println("");
        
        // O professor andou até a sala para começar a lecionar;
        System.out.print(pr.nome+": ");
        pr.andar(); // Como o Professor herdou o objeto "Pessoa", ele também consegue andar;
        System.out.print("Cheguei na sala, agora ");
        pr.lecionar(); // Chamando o método "andar" do objeto "Professor";
        // Somente o Professor tem acesso ao método "lecionar", uma Pessoa comum não consegue;
    }
}
