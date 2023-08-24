package br.eteczl;

import model.Veiculo;
import model.carro;

public class App 
{
    public static void main( String[] args )
    {
       Veiculo v1= new Veiculo("modelo", 0);
       carro car= new carro ("corsa", 30, 0);       
       
       v1.setVelocidade(0);
       car.setVelocidade(40);
       car.passmarc();
       car.carbrand();
    }
    
    //É um conceito do polimorfismo que nos permite reescrever um método.
    //Podemos reescrever nas classes filhas métodos criados inicialmente na classe pai, os métodos que serão sobreposto.
}
