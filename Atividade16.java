import java.util.Scanner;
public class Atividade16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.println("Informe o valor de um dos catetos: ");
        cateto1 = entrada.nextDouble();
        System.out.println("Informe o valor de outro cateto ");
        cateto2 = entrada.nextDouble();

        cateto1 = Math.pow(cateto1, 2);
        cateto2 = Math.pow(cateto2, 2);
        double soma = cateto1 + cateto2;
        hipotenusa = Math.sqrt(soma);

        System.out.println("A hipotenusa é: " + hipotenusa);

        entrada.close();
    }
}
