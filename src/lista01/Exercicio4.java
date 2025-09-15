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

        System.out.println("Digite a 3ª palavra (Ex: carnivoro): ");
        palavra3 = leia.nextLine();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    animal = "Águia";
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "Pomba";
                }
            } else if (palavra2.equalsIgnoreCase("mamifero")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "Homem";
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    animal = "Vaca";
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    animal = "Pulga";
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    animal = "Lagarta";
                }
            } else if (palavra2.equalsIgnoreCase("anelideo")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    animal = "Sanguessuga";
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "Minhoca";
                }
            }
        }

        if (!animal.isEmpty()) {
            System.out.println("\nAnimal: " + animal);
        } else {
            System.out.println("\nCombinação de palavras inválida!");
        }

        leia.close();

	}

}
