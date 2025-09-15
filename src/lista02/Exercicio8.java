package lista02;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        int operacao = 0;
        float valor = 0.0f;
        float saldo = 1000.00f;
        
        System.out.println("--- CONTA BANCÁRIA ---");

        // Loop principal para permitir múltiplas operações
        do {
            try {
                // Menu de opções
                System.out.println("\nSelecione a Operação:");
                System.out.println("1 - Saldo");
                System.out.println("2 - Saque");
                System.out.println("3 - Depósito");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                operacao = leia.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("\nOperação - Saldo");
                        System.out.println("Saldo atual: R$ " + df.format(saldo));
                        break;
                    case 2:
                        System.out.print("Valor do Saque: R$ ");
                        valor = leia.nextFloat();
                        System.out.println("\nOperação - Saque");
                        if (saldo >= valor) {
                            saldo -= valor;
                            System.out.println("Saque de R$ " + df.format(valor) + " realizado com sucesso.");
                            System.out.println("Novo Saldo: R$ " + df.format(saldo));
                        } else {
                            System.out.println("Saldo Insuficiente!");
                        }
                        break;
                    case 3:
                        System.out.print("Valor do Depósito: R$ ");
                        valor = leia.nextFloat();
                        System.out.println("\nOperação - Depósito");
                        saldo += valor;
                        System.out.println("Depósito de R$ " + df.format(valor) + " realizado com sucesso.");
                        System.out.println("Novo Saldo: R$ " + df.format(saldo));
                        break;
                    case 4:
                        System.out.println("\nObrigado por utilizar nossos serviços. Saindo...");
                        break;
                    default:
                        System.out.println("\nOperação Inválida! Por favor, escolha uma opção entre 1 e 4.");
                        break;
                }
            } catch (InputMismatchException erro) {
                System.out.println("\nEntrada inválida! Por favor, digite um número.");
                leia.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            }

        } while (operacao != 4);

        leia.close();
    }
}