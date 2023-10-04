
import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double res, num1, num2;
        
        //entrada de dados
        System.out.println("Informe um número");
        num1 = entrada.nextDouble();
        System.out.println("Informe um número");
        num2 = entrada.nextDouble();

        //processamento de dados
        res = num1 / num2;
        
        //saida
        System.out.println("O resultado da divisão do primeiro pelo o segundo é: "+res);
        entrada.close();
    }
}
