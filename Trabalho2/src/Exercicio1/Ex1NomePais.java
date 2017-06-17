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
 * @author Lucas
 */
public class Ex1NomePais {
       
    public class Pais {
        private String nome;
        private String capital;
        private double dimensao;
        private Pais vizinhos[];

    public String getNome() {return nome;
    }

    public String getCapital() {return capital;
    }

    public double getDimensao() {return dimensao;
    }

    public void setNome(String nome) {this.nome = nome;
    }

    public void setCapital(String capital) {this.capital = capital;
    }

    public void setDimensao(double dimensao) {this.dimensao = dimensao;
    }

    public Pais(String nome, String capital, double dimensao) {
        
        this.nome = nome;
        
        this.capital = capital;
        
        this.dimensao = dimensao;
    }

    public boolean equals(Pais outro_pais) {
        return this.nome.equals(outro_pais.getNome())&& this.capital.equals(outro_pais.getCapital());
    }

    public void setvizinhos(Pais... paisVizinho) {
        int paisesIguais = 0;
        for (int i = 0; i < paisVizinho.length; i++) {
        if (!this.equals(paisVizinho[i])) {paisesIguais++;}
        }
        this.vizinhos = new Pais[paisVizinho.length - paisesIguais];
        int contVizinhos = 0;
        for (int i = 0; i < paisVizinho.length; i++) {
            if (!this.equals(paisVizinho[i])) {this.vizinhos[contVizinhos] = paisVizinho[i];contVizinhos++;}
        }
    }

    public Pais[] getVizinhos() {
        return vizinhos;
    }

    public Pais[] vizinhosComum(Pais outro_pais) {
        int totalVizinhos = 0;
        
        for (Pais paisVizinhos : vizinhos) {
            
        for (Pais outroVizinho : outro_pais.vizinhos) {
                
            
        if (paisVizinhos.equals(outroVizinho)) {totalVizinhos++;}
            }
        }
        if (totalVizinhos > 0) {
        int contVizinhoComum = 0; Pais[] vizinhoComum = new Pais[totalVizinhos];
        
        for (Pais paisVizinhos : vizinhos) {
        
        for (Pais outroVizinho : outro_pais.vizinhos) {
        
        if (paisVizinhos.equals(outroVizinho)) {vizinhoComum[contVizinhoComum] = outroVizinho; contVizinhoComum++;}
             }
            }
           return vizinhoComum;
        }
        return null;
    }
    public void listaVizinhos(Pais[] lista){
        for(Pais pais : lista){
            
        System.out.println(pais.getNome());
        }
        
        System.out.println();
    }
    public Pais(){
        
   }
  }
}