
import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i;

        System.out.print("Digite um número para ver sua tabuada: ");
        numero = entrada.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        
        //um loop "for" para calcular e exibir a tabuada desse número, multiplicando-o pelos números de 1 a 10 e imprimindo os resultados na tela
        for ( i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        entrada.close();

    }
}