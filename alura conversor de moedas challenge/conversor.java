import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taxas de câmbio fixas (exemplo)
        final double TAXA_BRL_PARA_USD = 0.19; // 1 BRL = 0.19 USD
        final double TAXA_USD_PARA_BRL = 5.24; // 1 USD = 5.24 BRL

        System.out.println("Escolha a conversão:");
        System.out.println("1. Reais (BRL) para Dólares (USD)");
        System.out.println("2. Dólares (USD) para Reais (BRL)");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o valor em Reais (BRL): ");
                double valorBRL = scanner.nextDouble();
                double valorUSD = valorBRL * TAXA_BRL_PARA_USD;
                System.out.printf("Valor em Dólares (USD): %.2f%n", valorUSD);
                break;
            case 2:
                System.out.print("Digite o valor em Dólares (USD): ");
                double valorUSD2 = scanner.nextDouble();
                double valorBRL2 = valorUSD2 * TAXA_USD_PARA_BRL;
                System.out.printf("Valor em Reais (BRL): %.2f%n", valorBRL2);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }
}
