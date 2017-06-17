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
public class Ex5TesteDiagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex5Author author = new Ex5Author("Lucas Secundes", "lssecundes@gmail.com", 'M');
        Ex5Livro book = new Ex5Livro("Java", author, 100, 50);

        System.out.println(book.toString());
        System.out.println(book.getAuthor().toString());
    }
}