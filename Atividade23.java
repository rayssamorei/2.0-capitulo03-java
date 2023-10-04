import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int angulo1, angulo2, angulo3;

        System.out.print("Informe o ângulo do triângulo: ");
        angulo1 = entrada.nextInt();
        System.out.print("Informe o outro ângulo do triângulo: ");
        angulo2 = entrada.nextInt();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("O terceiro ângulo é: " + angulo3 + " graus");

        entrada.close();
    }
}
