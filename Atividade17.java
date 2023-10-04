import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, compEsfera, areaEsfera, volEsfera;
        
        System.out.println("Informe o raio: ");
        raio = entrada.nextDouble();
        
        compEsfera = 2 * (3.14 * raio);
        areaEsfera = 3.14 * (raio * raio);
        volEsfera = (4/3) * 3.14 * (raio * raio * raio);

        System.out.println("O comprimento da esfera é: " + compEsfera);
        System.out.println("A area da esfera é: " + areaEsfera);
        System.out.println("O volume da esfera é: " + volEsfera);
        
        entrada.close();
    }
}

