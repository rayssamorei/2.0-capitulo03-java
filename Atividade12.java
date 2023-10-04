
import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salMin, salario, salarioFinal;

        System.out.print("Quanto é o salário mínimo? ");
        salMin = entrada.nextDouble();
        System.out.print("Qual o seu salário? ");
        salario = entrada.nextDouble();

        salarioFinal = salario / salMin;
        
        System.out.print("O total de salários mínimos que o funcionário recebe é: " + salarioFinal + " salários.");
        
        entrada.close();
    }
}
