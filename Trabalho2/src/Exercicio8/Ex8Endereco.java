/*
 8.Crie uma classe chamada Endereco que possua uma String rua e outra cep. Use o
conceito de Encapsulamento para armazenar o valor de um cep de forma que a
String que corresponda ao número do cep fique sempre no formato: “XXXXXXXX”
onde X representa um número de 0 a 9.

 */
package Exercicio8;

/**
 *
 * @author Lucas
 */
public class Ex8Endereco {
    private String rua;
    private String cep;
    
    public String getRua(){return rua;
    }
    public String getCep(){return cep;
    }
    public void setRua(String rua){this.rua = rua;
    }
    public void setCep(String cep){this.cep = cep;
    }
    public String formataCep(){
       return cep.substring(0,5)+"|"+cep.substring(5,8);           
    }

    void formataCep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}