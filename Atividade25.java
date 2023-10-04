import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Receber a hora
        System.out.print("Digite a hora (formato 24 horas): ");
        int hora = entrada.nextInt();

        // Receber os minutos
        System.out.print("Digite os minutos: ");
        int minutos = entrada.nextInt();

        // Calcular a hora em minutos
        int horaEmMinutos = hora * 60;

        // Calcular o total de minutos digitados
        int totalMinutosDigitados = horaEmMinutos + minutos;

        // Calcular o total de minutos convertidos em segundos
        int totalSegundos = totalMinutosDigitados * 60;

        // Exibir os resultados
        System.out.println("Hora digitada em minutos: " + horaEmMinutos + " minutos");
        System.out.println("Total de minutos digitados mais a conversão: " + totalMinutosDigitados + " minutos");
        System.out.println("Total de minutos convertidos em segundos: " + totalSegundos + " segundos");

        entrada.close();
    }
}
