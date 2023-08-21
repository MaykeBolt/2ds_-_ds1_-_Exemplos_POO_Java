// Exemplo: Classes e Instâncias;

package br.eteczl;

// Importa a classe Pessoa;
import model.Pessoa;

public class App 
{
    public static void main( String[] args )
    {
    // Aqui é se criada a Instância, ou seja, a Pessoa "p1" começa a existir na realidade;
    // Tudo dentro da classe "Pessoa" é abstrato, ou sejá, não existe *ainda*;
    // Até você colocar "new", ai ela passa a existir, ou sejá, virá um Objeto;
    Pessoa p1 = new Pessoa("Amogus");
    
    // Aqui irei dizer para mostrar o nome da Pessoa "p1" com o comando de "println";
    System.out.println("Nome: "+p1.nome);
    }
}
