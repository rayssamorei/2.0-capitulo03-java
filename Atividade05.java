
import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double price, newPrice = 0;

        //entrada de dados
        System.out.println("Informe o preço: ");
        price = entrada.nextDouble();

        //processamento de dados
        newPrice = price - price * 0.1;
        
        //saida
        System.out.println("O novo preço "+ newPrice);
        entrada.close();
    }
}
