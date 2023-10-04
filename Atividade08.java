
import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double pesoQuilos, pesoGramas;

        //entrada de dados
        System.out.print("Informe seu peso em quilogramas: ");
        pesoQuilos = entrada.nextDouble();

        //processamento de dados
        pesoGramas = pesoQuilos * 1000;
        // 1 quilograma equivale a 1000 gramas

        //saida de dados
        System.out.println("O seu peso em gramas é: "+ pesoGramas);
        
        entrada.close();
    }
}
