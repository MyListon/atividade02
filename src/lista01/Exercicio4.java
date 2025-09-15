package lista01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
        
        String palavra1, palavra2, palavra3;
        String animal = "";

        System.out.println("Digite a 1ª palavra (Ex: vertebrado): ");
        palavra1 = leia.nextLine();

        System.out.println("Digite a 2ª palavra (Ex: ave): ");
        palavra2 = leia.nextLine();

        System.out.println("Digite a 3ª palavra (Ex: carnívoro): ");
        palavra3 = leia.nextLine();
        
        // As 3 condições verificadas de uma vez para cada animal
        if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnívoro")) {
            animal = "Águia";
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onívoro")) {
            animal = "Pomba";
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

        // Saída aprimorada para o usuário
        System.out.println("\n-------------------------------------------");
        System.out.println("Combinação digitada: " + palavra1 + ", " + palavra2 + ", " + palavra3);
        
        if (!animal.isEmpty()) {
            System.out.println("Animal identificado: " + animal);
        } else {
            System.out.println("Animal não identificado. Combinação inválida!");
        }
        
        System.out.println("-------------------------------------------");

        leia.close();
	}
}