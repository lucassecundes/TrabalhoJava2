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
public class Ex5Livro {
    private String name;
    private Ex5Author author;
    private double price;
    private int qntInStock;

    public Ex5Livro(String name, Ex5Author author, double price, int quantidadeStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qntInStock = quantidadeStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidadeStock() {
        return qntInStock;
    }

    public void setQntInStock(int qntInStock) {
        this.qntInStock = qntInStock;
    }

    public Ex5Author getAuthor() {
        return author;
    }

    public void setAuthor(Ex5Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\n Quantidade: " + this.qntInStock + "\n Preço: " + this.price;
    }
}