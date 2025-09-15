package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.0");
        
        float numero1, numero2;
        int operacao;
        float resultado = 0.0f;
        boolean operacaoValida = true;

        System.out.println("Digite o 1º número: ");
        numero1 = leia.nextFloat();

        System.out.println("Digite o 2º número: ");
        numero2 = leia.nextFloat();

        System.out.println("Operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("\n" + df.format(numero1) + " + " + df.format(numero2) + " = " + df.format(resultado));
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("\n" + df.format(numero1) + " - " + df.format(numero2) + " = " + df.format(resultado));
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("\n" + df.format(numero1) + " * " + df.format(numero2) + " = " + df.format(resultado));
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("\n" + df.format(numero1) + " / " + df.format(numero2) + " = " + df.format(resultado));
                } else {
                    System.out.println("\nNão é possível dividir por zero!");
                }
                break;
            default:
                System.out.println("\nOperação Inválida!");
                operacaoValida = false;
                break;
        }

        leia.close();

	}

}
