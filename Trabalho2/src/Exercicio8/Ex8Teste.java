/*
 8.Crie uma classe chamada Endereco que possua uma String rua e outra cep. Use o
conceito de Encapsulamento para armazenar o valor de um cep de forma que a
String que corresponda ao número do cep fique sempre no formato: “XXXXXXXX”
onde X representa um número de 0 a 9.

 */
package Exercicio8;

/**
 *
 * @author Lucas
 */
public class Ex8Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ex8Endereco endereco =  new Ex8Endereco();
 		
 		endereco.formataCep(79083500);
 		System.out.println(endereco.getCep());
 	}
}	