/*
 6. (lembrar das palavras reservadas: extends e abstract) Criar as classes
Pessoa
CPF, nome e idade
Funcionario que estende de pessoa
Núm. de cadastro na empresa e salário
Gerente que estende de Funcionario
Vetor de funcionários que ele gerencia e bônus anual
Cliente que estende de pessoa
Endereço e telefone
Cliente especial que estende de cliente
Desconto fixo em todas as compras
Definir corretamente os modificadores de acesso
public, protected, package-private e private

 */
package Exercicio6;

/**
 *
 * @author Lucas
 */
public class Ex6Gerente extends Ex6Funcionario {
    private Ex6Funcionario[] funcionariosGerencia;
 	private int bonus;
  
}

