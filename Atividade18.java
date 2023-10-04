
import java.util.Scanner;
public class Atividade18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c, f;

        System.out.println("Informe a temperatura em Celsius: ");
        c = entrada.nextDouble();

        f = 180 * (c + 32)/100;

        System.out.println("A temperatura em Fahrenheit: " + f);
        entrada.close();
    }
}
