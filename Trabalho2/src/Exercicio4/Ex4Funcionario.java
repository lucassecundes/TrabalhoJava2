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
public class Ex4Funcionario {
    private String nome;
    private String cargo;
    private String superior;

    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public String gersuperior() {
        return superior;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setsuperior(String superior) {
        this.superior = superior;
    }
        @Override
        public String toString(){
            return "Nome: " + this.nome + "Cargo: " + this.cargo + "Chefe: " + this.superior;
    }
}
