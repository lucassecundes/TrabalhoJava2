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

/**
 *
 * @author Lucas
 */
public class Ex2Arrays {

    static int somaInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int[] arrayInt;
	
    public void setQuantidade(int quantidade) {
		arrayInt = new int[quantidade];
	}

	public void setValorEPosicao(int posicao, int valor) {
		if (arrayInt != null) {
			arrayInt[posicao] = valor;
		}
	}

   
    public int Soma(){
		int total = 0;

		for (int i = 0; i < arrayInt.length; i++) {
			total += arrayInt[i];
		}
		return total;
	}
}