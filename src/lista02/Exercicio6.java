package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        String nome;
        int codigoCargo;
        float salario, reajuste = 0.0f;
        String cargo = "";

        System.out.println("Nome do colaborador: ");
        leia.skip("\\R?");
        nome = leia.nextLine();

        System.out.println("Código do Cargo: ");
        codigoCargo = leia.nextInt();

        System.out.println("Salário: ");
        salario = leia.nextFloat();

        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido!");
                leia.close();
                return;
        }

        float novoSalario = salario + (reajuste * salario);

        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + df.format(novoSalario));

        leia.close();

	}

}
