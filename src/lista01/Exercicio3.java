package lista01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        
        String nomeDoador;
        int idadeDoador;
        boolean primeiraDoacao;

        System.out.println("Digite o Nome do doador: ");
        nomeDoador = leia.nextLine();

        System.out.println("Digite a Idade do doador: ");
        idadeDoador = leia.nextInt();

        System.out.println("Primeira doação de sangue? (true/false) ");
        primeiraDoacao = leia.nextBoolean();

        boolean aptoParaDoar = false;

        if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && idadeDoador <= 69) {
                if (!primeiraDoacao) {
                    aptoParaDoar = true;
                }
            } else {
                aptoParaDoar = true;
            }
        }

        if (aptoParaDoar) {
            System.out.println("\n" + nomeDoador + " está apto(a) para doar sangue!");
        } else {
            System.out.println("\n" + nomeDoador + " não está apto(a) para doar sangue!");
        }

        leia.close();

	}

}
