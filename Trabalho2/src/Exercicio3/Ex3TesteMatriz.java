/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author Lucas
 */
public class Ex3TesteMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex3Matriz matrizes = new Ex3Matriz();
 		
 	int[][] matrizUm = new int[2][2];
        
            matrizUm[0][0] = 1;
            matrizUm[1][1] = 2;
            matrizUm[0][1] = 3;
            matrizUm[1][0] = 4;
       
 		
 	int[][] matrizDois = new int [2][2];
        
            matrizUm[0][0] = 1;
            matrizUm[1][0] = 2;
            matrizUm[0][1] = 3;
            matrizUm[1][1] = 4;
        
        
        System.out.println("Matriz A");
 	matrizes.imprimirMatriz(matrizUm);        
        
 		
 	System.out.println("Matriz B");
 	matrizes.imprimirMatriz(matrizDois); 
        
 		
 	int[][] multiplicacao = new int [2][2];
 	System.out.println("Resultado das multiplicações de matriz é: ");
 	multiplicacao = matrizes.multiplicarMatrizes (matrizUm, matrizDois, 2, 2);
 	matrizes.imprimirMatriz(multiplicacao);
 		
 	
 	}
 
 }