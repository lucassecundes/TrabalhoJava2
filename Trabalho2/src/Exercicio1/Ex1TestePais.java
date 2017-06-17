/*
 1. Escreva uma classe que represente um país. Um país tem como atributos o seu
nome, o nome da capital, sua dimensão em Km2 e uma lista de países com os quais
ele faz fronteira. Represente a classe e forneça os seguintes construtores e método:

a) Construtor que inicialize o nome, capital e a dimensão do país;

b) Métodos de acesso (obter/get) para as propriedades indicadas no item (a);

c) Um método que permita verificar se dois países são iguais. Dois países são iguais se
tiverem o mesmo nome e a mesma capital. A assinatura deste método deve ser:

d) public boolean equals(final Pais outro);

e) Um método que define quais outros países fazem fronteira (note que um país não pode
fazer fronteira com ele mesmo);

f) Um método que retorne a lista de países que fazem fronteira;
g) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos
comuns aos dois países
 */
package Exercicio1;



/**
 *
 * @author TADS
 */
public class Ex1TestePais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pais pais = new Pais();
       
        Pais brasil = new Pais("Brasil", "Basília", 123456);
        
        Pais paraguai = new Pais("Paraguai", "Assunção", 123457);
        
        Pais uruguai = new Pais("Uriguai", "Montevidéu", 123458);
        
        Pais venezuela = new Pais("Venezuela", "Caracas", 123459);
        
        
        System.out.println("\n");
        
        System.out.println(brasil.equals(brasil));
        
        System.out.println(paraguai.equals(paraguai));
       
        System.out.println(uruguai.equals(uruguai));
        
        System.out.println(venezuela.equals(venezuela));
        
        brasil.setvizinhos(paraguai,uruguai,venezuela);
        
        paraguai.setvizinhos(brasil);
        
        uruguai.setvizinhos(brasil);
        
        venezuela.setvizinhos(brasil);
        
        
        System.out.println("\n");
        
        pais.listaVizinhos(brasil.getVizinhos());
        
        pais.listaVizinhos(paraguai.getVizinhos());
        
        pais.listaVizinhos(uruguai.getVizinhos());
        
        pais.listaVizinhos(venezuela.getVizinhos());
        
        System.out.println("\n");
        pais.listaVizinhos(paraguai.vizinhosComum(brasil));
       
        pais.listaVizinhos(brasil.vizinhosComum(uruguai));
	}
}
