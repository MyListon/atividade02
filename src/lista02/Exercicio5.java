package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        int codigo, quantidade;
        float precoUnitario = 0.0f, valorTotal = 0.0f;
        String produto = "";

        System.out.println("Código do Produto: ");
        codigo = leia.nextInt();

        System.out.println("Quantidade: ");
        quantidade = leia.nextInt();

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                precoUnitario = 10.00f;
                break;
            case 2:
                produto = "X-Salada";
                precoUnitario = 15.00f;
                break;
            case 3:
                produto = "X-Bacon";
                precoUnitario = 18.00f;
                break;
            case 4:
                produto = "Bauru";
                precoUnitario = 12.00f;
                break;
            case 5:
                produto = "Refrigerante";
                precoUnitario = 8.00f;
                break;
            case 6:
                produto = "Suco de laranja";
                precoUnitario = 13.00f;
                break;
            default:
                System.out.println("Código de produto inválido!");
                leia.close();
                return;
        }

        valorTotal = quantidade * precoUnitario;

        System.out.println("\nProduto: " + produto);
        System.out.println("Valor total: R$ " + df.format(valorTotal));

        leia.close();

	}

}
