/*
 10. Crie uma classe java NumeroDecrescente que contenha um método que receba
 um número inteiro e imprima, em ordem decrescente, o valor do número até 0.
 */
package Exercicio10;

/**
 *
 * @author Lucas
 */
public class Ex10NumeroDecrescente {

    Ex10NumeroDecrescente(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int ordemDecrescente(int numero){
        int desNumero=0;
        
        for(int i=0;i<=numero;i++){
            desNumero = desNumero - i;
            System.out.println(desNumero);
        }
        return desNumero;
    }

    void printNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

