import java.util.Scanner;
public class Atividade19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double comprimento, largura, area, potencia;

        System.out.print("Digite o comprimento do cômodo (em metros): ");
        comprimento = entrada.nextDouble();

        System.out.print("Digite a largura do cômodo (em metros): ");
        largura = entrada.nextDouble();

        area = comprimento * largura;
        potencia = area * 18;

        System.out.println("A área do cômodo é " + area + " m²");
        System.out.println("A potência de iluminação necessária é " + potencia + " W");

        entrada.close();
    }
}
