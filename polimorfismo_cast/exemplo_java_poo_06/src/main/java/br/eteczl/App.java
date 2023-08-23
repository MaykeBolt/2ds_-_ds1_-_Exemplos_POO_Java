package br.eteczl;
import br.model.Animal;
import br.model.Gato;
import br.model.Cachorro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal planet = new Animal("Raça", "Sexo", "Tipo");
        Gato cat = new Gato("Ragdoll", "Feminino", "Carnivoro", "Milly");
        Cachorro dog = new Cachorro ("Pitbull", "Masculino", "Carnivoro", "Toby");
        
        
        dog.fazersom();
    }
    
    
    // Polimorfismo então é a reutilização de métodos da classe Pai nas classes Filhos
    // Mas com ajustes feitos para a classe que irá herdar esse método.
}
