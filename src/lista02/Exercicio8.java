package lista02;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		// Cria um objeto para ler a entrada do usuário a partir do teclado.
		Scanner leia = new Scanner(System.in);
        // Cria um objeto para formatar números com duas casas decimais, ideal para valores monetários.
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        // Declara a variável 'operacao' para guardar a opção escolhida pelo usuário.
        int operacao = 0;
        // Declara a variável 'valor' para guardar o valor do saque ou depósito.
        float valor = 0.0f;
        // Declara a variável 'saldo' e a inicializa com um valor padrão de 1000.00.
        float saldo = 1000.00f;
        
        // Imprime o título do programa no console.
        System.out.println("--- CONTA BANCÁRIA ---");

        // Inicia um loop 'do-while', que garante que o código dentro dele será executado pelo menos uma vez.
        do {
            // Inicia um bloco 'try' para tentar executar o código. Isso é usado para capturar erros.
            try {
                // Imprime o menu de opções para o usuário.
                System.out.println("\nSelecione a Operação:");
                System.out.println("1 - Saldo");
                System.out.println("2 - Saque");
                System.out.println("3 - Depósito");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                // Lê a opção digitada pelo usuário e armazena na variável 'operacao'.
                operacao = leia.nextInt();

                // Usa a instrução 'switch' para executar um bloco de código diferente dependendo do valor da variável 'operacao'.
                switch (operacao) {
                    case 1:
                        // Se 'operacao' for 1, imprime o saldo atual formatado.
                        System.out.println("\nOperação - Saldo");
                        System.out.println("Saldo atual: R$ " + df.format(saldo));
                        // 'break' sai do 'switch'.
                        break;
                    case 2:
                        // Se 'operacao' for 2, pede o valor do saque.
                        System.out.print("Valor do Saque: R$ ");
                        // Lê o valor e armazena na variável 'valor'.
                        valor = leia.nextFloat();
                        System.out.println("\nOperação - Saque");
                        // Verifica se o saldo é suficiente para o saque.
                        if (saldo >= valor) {
                            // Se for, subtrai o valor do saque do saldo.
                            saldo -= valor;
                            System.out.println("Saque de R$ " + df.format(valor) + " realizado com sucesso.");
                            System.out.println("Novo Saldo: R$ " + df.format(saldo));
                        } else {
                            // Se o saldo for insuficiente, imprime uma mensagem de erro.
                            System.out.println("Saldo Insuficiente!");
                        }
                        break;
                    case 3:
                        // Se 'operacao' for 3, pede o valor do depósito.
                        System.out.print("Valor do Depósito: R$ ");
                        // Lê o valor e armazena na variável 'valor'.
                        valor = leia.nextFloat();
                        System.out.println("\nOperação - Depósito");
                        // Adiciona o valor do depósito ao saldo.
                        saldo += valor;
                        System.out.println("Depósito de R$ " + df.format(valor) + " realizado com sucesso.");
                        System.out.println("Novo Saldo: R$ " + df.format(saldo));
                        break;
                    case 4:
                        // Se 'operacao' for 4, imprime uma mensagem de saída.
                        System.out.println("\nObrigado por utilizar nossos serviços. Saindo...");
                        break;
                    default:
                        // Se a opção digitada não for 1, 2, 3 ou 4, imprime uma mensagem de erro.
                        System.out.println("\nOperação Inválida! Por favor, escolha uma opção entre 1 e 4.");
                        break;
                }
            // Este bloco 'catch' é executado se um erro do tipo 'InputMismatchException' ocorrer. Isso acontece quando o usuário digita algo que não é um número.
            } catch (InputMismatchException erro) {
                System.out.println("\nEntrada inválida! Por favor, digite um número.");
                // Esta linha limpa o 'buffer' do Scanner para evitar que o programa entre em um loop infinito.
                leia.nextLine();
            }
        // A condição do loop 'do-while' verifica se a 'operacao' é diferente de 4. Se for, o loop continua. Se for 4, o loop para.
        } while (operacao != 4);

        // Fecha o objeto 'Scanner' para liberar os recursos do sistema.
        leia.close();
    }
}