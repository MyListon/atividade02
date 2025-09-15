package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        int operacao;
        float valor, saldo = 1000.00f;
        
        System.out.println("Código da Operação (1-Saldo, 2-Saque, 3-Depósito): ");
        operacao = leia.nextInt();
        
        switch (operacao) {
            case 1:
                System.out.println("\nOperação - Saldo");
                System.out.println("Saldo: R$ " + df.format(saldo));
                break;
            case 2:
                System.out.println("Valor: ");
                valor = leia.nextFloat();
                System.out.println("\nOperação - Saque");
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Novo Saldo: R$ " + df.format(saldo));
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            case 3:
                System.out.println("Valor: ");
                valor = leia.nextFloat();
                System.out.println("\nOperação - Depósito");
                saldo += valor;
                System.out.println("Novo Saldo: R$ " + df.format(saldo));
                break;
            default:
                System.out.println("\nOperação Inválida!");
                break;
        }

        leia.close();

	}

}
