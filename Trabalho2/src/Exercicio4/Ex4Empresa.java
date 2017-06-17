/*
    4. Implementação da classe Matriz
    Criar uma classe Funcionario com as variáveis de instância: nome, cargo e superior
    (chefe)
    Criar uma classe Empresa que contém um Array de funcionários
    Criar um método “listarFuncionarios” que imprima todos os funcionários de uma
    empresa
 */
package Exercicio4;

/**
 *
 * @author Lucas
 */
public class Ex4Empresa {
  
    private final Ex4Funcionario[] vetorFuncionario = new Ex4Funcionario[2];
    
    private int contFuncionario = 0;
    
    public void listaFuncionario(){Ex4Funcionario funcionario;
        for(int i=0; i<vetorFuncionario.length;i++){funcionario = vetorFuncionario[i];
            if(funcionario != null){System.out.println(funcionario.toString());
            }
       }
    }
    public void cadastarFuncionario(Ex4Funcionario funcionario){
        if(contFuncionario < vetorFuncionario.length){
            vetorFuncionario[contFuncionario] = funcionario;
            System.out.println("Funcionario foi Cadastrado!");
            contFuncionario++;
        }else{
            System.out.println("Funcionario não foi Cadastrado!");
        }
    }
}