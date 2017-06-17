/*
    5.Baseado no diagrama abaixo:
    Criar um método main que leia os nomes e cargos dos funcionários do console.
    Crie objetos Funcionario com cada um deles e armazene no vetor da classe empresa
    Criar as duas classes e seu relacionamento
    Criar uma classe separada para testes que cria uma instância de cada uma das classes
    Note que para criar um livro é preciso criar um autor
    Imprimir o nome do livro, preço e quantidade no estoque
    Através da instância de livro, recuperar o autor e imprimir o seu nome, email e sexo
 */
package Exercicio5;

/**
 *
 * @author Lucas
 */
public class Ex5Author {
    private String name;
    private String email;
    private char genero;

    public Ex5Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\n Email: " + this.email + "\n Sexo: " + this.genero;
    }
}