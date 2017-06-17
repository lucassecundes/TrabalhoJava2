/*
    2.Implementação da classe Arrays
    Criar uma classe Arrays que contém um array de inteiros
    Criar um método “soma” que percorra e retorne a soma de todos os elementos do vetor
    Criar um método main que:
    Crie uma instância da classe Arrays
    Leia inteiros do console e armazene os valores no vetor da classe Arrays.
    Imprima a soma dos números através do método soma
 */
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ex2TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    Scanner sc = new Scanner(System.in);
    Ex2Arrays arrays = new Ex2Arrays(); 

    System.out.println("Digite a quantidade de numeros:");
    int quantidade = sc.nextInt();
    arrays.setQuantidade(quantidade);

    for (int f = 0; f < quantidade; f++) { System.out.println("Digite o numero:");
       int valor = sc.nextInt();
       arrays.setValorEPosicao(f, valor);
    }

    int soma = Ex2Arrays.somaInt();
    System.out.println("O Resultado da soma é: " + soma);
    }	
}