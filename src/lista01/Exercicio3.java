package lista01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        String nomeDoador;
        int idadeDoador = 0;
        String generoDoador;
        boolean primeiraDoacao = false;
        boolean entradaValida;
        String aptidaoFinal;

        System.out.println("Digite o Nome do doador: ");
        nomeDoador = leia.nextLine();
        
        // Validação da Idade
        do {
            try {
                System.out.println("Digite a Idade do doador: ");
                idadeDoador = leia.nextInt();
                entradaValida = true;
            } catch (InputMismatchException erro) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                leia.next();
                entradaValida = false;
            }
        } while (!entradaValida);

        leia.nextLine(); // Limpa o buffer para a próxima leitura

        // Nova entrada para o gênero
        do {
            System.out.println("Digite o Gênero do doador (F/M): ");
            generoDoador = leia.nextLine().toUpperCase();
            if (generoDoador.equals("F") || generoDoador.equals("M")) {
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida! Por favor, digite 'F' para Feminino ou 'M' para Masculino.");
                entradaValida = false;
            }
        } while (!entradaValida);
        
        // Validação da Primeira Doação
        do {
            try {
                System.out.println("É a primeira doação de sangue? (true/false) ");
                primeiraDoacao = leia.nextBoolean();
                entradaValida = true;
            } catch (InputMismatchException erro) {
                System.out.println("Entrada inválida! Por favor, digite 'true' ou 'false'.");
                leia.next();
                entradaValida = false;
            }
        } while (!entradaValida);

        // Lógica para determinar se a pessoa é apta
        boolean aptoParaDoar = (idadeDoador >= 18 && idadeDoador < 60) || 
                               (idadeDoador >= 60 && idadeDoador <= 69 && !primeiraDoacao);

        // Lógica para definir a palavra 'apto' ou 'apta'
        if (aptoParaDoar) {
            aptidaoFinal = (generoDoador.equals("F")) ? "apta" : "apto";
        } else {
            aptidaoFinal = (generoDoador.equals("F")) ? "não está apta" : "não está apto";
        }
        
        System.out.println("\nDoador: " + nomeDoador);
        System.out.println("Status: " + aptidaoFinal + " para doar sangue.");

        leia.close();
    }
}