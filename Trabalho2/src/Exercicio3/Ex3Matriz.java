/*
 3. Implementação da classe Matriz
    Criar uma classe chamada Matrizes
    Criar um método para imprimir uma matriz recebida por parâmetro
    Criar um método que tenha como parâmetros duas matrizes e retorne a matriz
    correspondente a multiplicação delas
    Declare, construa e inicialize 2 matrizes com números fixos de tamanhos diferentes
    Imprimir a matriz de resultado na tela
 */
package Exercicio3;

/**
 *
 * @author Lucas
 */
public class Ex3Matriz {
    
    public void imprimirMatriz(int[][] matriz){
        
        for (int[] matrizA : matriz) {
            for (int a = 0; a < matrizA.length; a++) {
            System.out.println("--" + matrizA[a] + "--");
            }
        }
 	}
 	public int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB, int qtda, int qtdb){
 		int[][] resultado = new int[qtda][qtdb];
 		for (int i = 0; i < matrizA.length; i++ ){
 		for (int j = 0; j < matrizA.length; j++){
 		resultado[i][j] = (matrizA[i][j] * matrizB[i][j]);}
 		
                }
 	return resultado;
 	}
}
