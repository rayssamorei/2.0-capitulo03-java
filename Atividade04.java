
import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, mediaPonderada;

        //entrada de dados
        System.out.println("Informe uma nota ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe uma nota ");
        nota2 = entrada.nextDouble();

        //processamento de dados
        mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;

        //saida de dados
        System.out.println("A Media Poderada dessas notas: "+mediaPonderada);

        entrada.close();
    }
}
