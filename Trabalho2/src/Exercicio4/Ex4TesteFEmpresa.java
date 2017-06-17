/*
    4.Implementação da classe Matriz
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
public class Ex4TesteFEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ex4Funcionario funcionario = new Ex4Funcionario();
        
        funcionario.setNome("Lucas Secundes");
        
        funcionario.setCargo("Aux. de Suporte");
        
        funcionario.setsuperior("José Valdir");
        
        Ex4Empresa empresa = new Ex4Empresa();
        
        empresa.cadastarFuncionario(funcionario);
        
        empresa.listaFuncionario();
    }
    
}