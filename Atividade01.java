import java.util.Scanner;

public class Atividade01{
    public static void main(String[]args){
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double num1, num2, res;

        //entrada de dados
        System.out.print("Informe um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe outro número: ");
        num2 = entrada.nextDouble();

        //processamento de dados
        res = num1 - num2;

        //saida de dados
        System.out.print("O resultado da subtração é: " + res);
    entrada.close();

    }
    
}
