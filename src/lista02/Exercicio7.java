package lista02;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.0");
        
        int operacao = 0;
        float numero1, numero2;

        System.out.println("--- CALCULADORA SIMPLES ---");

        // Loop principal para permitir várias operações
        do {
            try {
                // Menu de opções
                System.out.println("\nSelecione a operação:");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");
                System.out.print("Opção: ");
                operacao = leia.nextInt();

                if (operacao >= 1 && operacao <= 4) {
                    System.out.print("Digite o 1º número: ");
                    numero1 = leia.nextFloat();
                    
                    System.out.print("Digite o 2º número: ");
                    numero2 = leia.nextFloat();

                    switch (operacao) {
                        case 1:
                            System.out.println("\n" + df.format(numero1) + " + " + df.format(numero2) + " = " + df.format(numero1 + numero2));
                            break;
                        case 2:
                            System.out.println("\n" + df.format(numero1) + " - " + df.format(numero2) + " = " + df.format(numero1 - numero2));
                            break;
                        case 3:
                            System.out.println("\n" + df.format(numero1) + " * " + df.format(numero2) + " = " + df.format(numero1 * numero2));
                            break;
                        case 4:
                            if (numero2 != 0) {
                                System.out.println("\n" + df.format(numero1) + " / " + df.format(numero2) + " = " + df.format(numero1 / numero2));
                            } else {
                                System.out.println("\nErro: Não é possível dividir por zero!");
                            }
                            break;
                    }
                } else if (operacao == 5) {
                    System.out.println("\nObrigado por usar a calculadora. Saindo...");
                } else {
                    System.out.println("\nOperação Inválida! Por favor, escolha uma opção entre 1 e 5.");
                }

            } catch (InputMismatchException erro) {
                System.out.println("\nEntrada inválida! Por favor, digite um número.");
                leia.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            }

        } while (operacao != 5);

        leia.close();
	}
}