
import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double baseMaior, baseMenor, area, altura;

        //entrada de dados
        System.out.print("Qual é o valor da base menor? ");
        baseMenor = entrada.nextDouble();
        System.out.print("Qual é o valor da base maior? ");
        baseMaior = entrada.nextDouble();
        System.out.print("Qual é a altura do trapézio? ");
        altura = entrada.nextDouble();

        //processamento de dados
        area = ((baseMaior + baseMenor) * altura)/2;

        //saida de dados -- CONCATENAÇÃO
        System.out.print("A área do trapézio é: "+ area);

        entrada.close();
    }
}
