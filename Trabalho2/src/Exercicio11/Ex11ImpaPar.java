/*
    11.Escreva um programa que imprima na tela a soma dos números ímpares entre 0
    e 30 e a multiplicação dos números pares entre 0 e 30.

 */
package Exercicio11;

/**
 *
 * @author Lucas
 */
public class Ex11ImpaPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int par = 0;
        long impar = 1;
    
          for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                impar *= i;
            } 
            else {

               par += i;

            }
        }
        System.out.printf("Soma dos números ímpares entre 0 e 30: " + par);
        
        System.out.printf("Multiplicação dos números pares entre 0 e 30: " + impar);
    }
    
}