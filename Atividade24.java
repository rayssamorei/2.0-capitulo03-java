import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Receber a quantidade de dinheiro em reais
        System.out.print("Digite a quantidade de dinheiro em reais (BRL): ");
        double quantidadeReais = entrada.nextDouble();

        // Taxas de câmbio
        double taxaDolar = 1.80;
        double taxaMarcoAlemao = 2.00;
        double taxaLibraEsterlina = 3.57;

        // Converter para dólares, marcos alemães e libras esterlinas
        double quantidadeDolares = quantidadeReais / taxaDolar;
        double quantidadeMarcoAlemao = quantidadeReais / taxaMarcoAlemao;
        double quantidadeLibraEsterlina = quantidadeReais / taxaLibraEsterlina;

        // Exibir os resultados
        System.out.println("Quantidade em dólares (USD): $" + quantidadeDolares);
        System.out.println("Quantidade em marcos alemães (DEM): " + quantidadeMarcoAlemao + " DEM");
        System.out.println("Quantidade em libras esterlinas (GBP): £" + quantidadeLibraEsterlina);
        
        entrada.close();
    }
}
