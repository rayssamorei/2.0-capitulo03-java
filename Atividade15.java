
import java.util.Scanner;
public class Atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, multa, valorFinal, conta1, conta2, totalBoletos;

        System.out.println("Informe seu salário: ");
        salario = entrada.nextDouble();
        System.out.println("Qual o valor de uma das contas atrasadas? ");
        conta1 = entrada.nextDouble();
        System.out.println("Qual o valor da outra conta atrasada? ");
        conta2 = entrada.nextDouble();

        multa = conta1 * 0.02 + conta2 * 0.02;
        totalBoletos = conta1 + conta2;
        valorFinal = salario - (totalBoletos + multa);

        System.out.println("O valor que restará do salário é: " + valorFinal);

        entrada.close();
    }
}
