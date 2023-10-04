
import java.util.Scanner;
public class Atividade02 {
    public static void main(String[]args){
        //declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double num1, num2, num3, res;

        //entrada de dados
        System.out.println("Informe eum número: ");
        num1 = entrada.nextDouble();
        System.out.println("Informe um número ");
        num2 = entrada.nextDouble();
        System.out.println("Informe um número ");
        num3 = entrada.nextDouble();

        //processamento de dados
        res = num1 * num2 * num3;
        
        //saida de dados
        System.out.println("A multiplicação desses números: "+res);

        entrada.close();
    }

}
