
import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, diagMaior, diagMenor;

        System.out.print("Informe a diagonal maior do losango: ");
        diagMaior = entrada.nextDouble();
        System.out.print("Informe a diagonal menor do losango: ");
        diagMenor = entrada.nextDouble();

        area = (diagMaior * diagMenor)/2;

        System.out.print("A área do losango é: " + area);

        entrada.close();
    }
}
