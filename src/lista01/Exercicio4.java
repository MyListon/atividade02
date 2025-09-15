package lista01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		// Cria um objeto chamado 'leia' que permite ler a entrada do usuário através do console.
		Scanner leia = new Scanner(System.in);
        
		// Declara três variáveis do tipo String para armazenar as palavras que o usuário vai digitar. 
        String palavra1, palavra2, palavra3;
        // Declara a variável 'animal' que vai armazenar o nome do animal encontrado. Ela começa vazia.
        String animal = "";
        
        // Imprime uma mensagem na tela para pedir a primeira palavra.
        System.out.println("Digite a 1ª palavra (Ex: vertebrado): ");
        // Lê a linha digitada pelo usuário e armazena na variável 'palavra1'.
        palavra1 = leia.nextLine();
        
        // Pede a segunda palavra.
        System.out.println("Digite a 2ª palavra (Ex: ave): ");
        // Lê e armazena na variável 'palavra2'.
        palavra2 = leia.nextLine();
        
        // Pede a terceira palavra.
        System.out.println("Digite a 3ª palavra (Ex: carnívoro): ");
        // Lê e armazena na variável 'palavra3'.
        palavra3 = leia.nextLine();
        
        // --- Início da verificação das palavras ---
        
        // As 3 condições verificadas de uma vez para cada animal
        // O código verifica a primeira combinação de palavras. O 'equalsIgnoreCase' ignora se o usuário digitou maiúsculas ou minúsculas.
        if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnívoro")) {
        	// Se a combinação for "vertebrado", "ave" e "carnívoro", a variável 'animal' recebe o valor "Águia".
        	animal = "Águia";
        // Se a condição acima for falsa, o programa verifica a próxima.
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onívoro")) {
        	// Se for a combinação "vertebrado", "ave" e "onívoro", o animal é "Pomba".
        	animal = "Pomba";
        // Continua verificando as próximas combinações.
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("onívoro")) {
            animal = "Homem";
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("herbívoro")) {
            animal = "Vaca";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematofago")) {
            animal = "Pulga";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbívoro")) {
            animal = "Lagarta";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("hematofago")) {
            animal = "Sanguessuga";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("onívoro")) {
            animal = "Minhoca";
        }
        
        // --- Fim da verificação e início da saída de dados ---

     	// Imprime uma linha divisória para organizar o resultado.
        
        // Saída aprimorada para o usuário
        System.out.println("\n-------------------------------------------");
        // Mostra ao usuário as palavras que ele digitou.
        System.out.println("Combinação digitada: " + palavra1 + ", " + palavra2 + ", " + palavra3);
        
        // Verifica se a variável 'animal' não está vazia, o que significa que uma combinação foi encontrada.
        if (!animal.isEmpty()) {
        	// Se encontrou, imprime o nome do animal.
            System.out.println("Animal identificado: " + animal);
        } else {
        	// Se a variável 'animal' continuar vazia, significa que a combinação não foi encontrada.
            System.out.println("Animal não identificado. Combinação inválida!");
        }
        
        // Imprime outra linha divisória.
        System.out.println("-------------------------------------------");

        // Fecha o objeto 'leia' para liberar os recursos do sistema que foram usados.
        leia.close();
	}
}