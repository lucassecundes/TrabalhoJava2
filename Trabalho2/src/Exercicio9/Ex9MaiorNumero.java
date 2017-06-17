/*
 Crie uma classe java MaiorNumero que contenha um método que receba dois
números inteiros e imprima o maior entre eles.
 */
package Exercicio9;

/**
 *
 * @author Lucas
 */
public class Ex9MaiorNumero {
        private int primeiroNumero;
	private int segundoNumero;

	public Ex9MaiorNumero(int primeiroNumero, int segundoNumero) {this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}

	public int getMaiorNumero() {
		if ( segundoNumero < primeiroNumero ) { 
                    return primeiroNumero;
		}
		return segundoNumero;
	}
}

