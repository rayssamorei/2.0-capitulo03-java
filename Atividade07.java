
import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double pesoAtual, aumento15, menos20;

        //entrada de dados
        System.out.println("Digite seu peso atual: ");
        pesoAtual = entrada.nextDouble();

        //processamento de dados
        aumento15 = pesoAtual + (pesoAtual*15/100);
        menos20 = pesoAtual - (pesoAtual * 20/100);
        //pesoAtual = peso - (peso *  20/100);

        //saida de dados
        System.out.println("Se a pessoa engordar 15%, o aumento será de: "+ aumento15+ " kg.");
        System.out.println("Se a pessoa emagrecer 20%, o peso será: "+ menos20 + " kg.");
        
        entrada.close();

    }
}
