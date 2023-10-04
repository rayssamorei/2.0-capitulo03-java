import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Receber o número de lados do polígono
        System.out.print("Digite o número de lados do polígono convexo: ");
        int numeroLados = entrada.nextInt();

        // Calcular o número de diagonais usando a fórmula
        int numeroDiagonais = (numeroLados * (numeroLados - 3)) / 2;

        // Exibir o resultado
        System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);
        entrada.close();
    }
}
