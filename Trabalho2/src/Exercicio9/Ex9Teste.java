/*
 Crie uma classe java MaiorNumero que contenha um método que receba dois
números inteiros e imprima o maior entre eles.
 */
package Exercicio9;

/**
 *
 * @author Lucas
 */
public class Ex9Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex9MaiorNumero numero = new Ex9MaiorNumero(10, 9);
	
        System.out.println(numero.getMaiorNumero());
    }
}