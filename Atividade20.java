import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ângulo formado pela escada com o chão (em graus): ");
        double anguloGraus = entrada.nextDouble();
        
        System.out.print("Digite a distância da escada à parede (em metros): ");
        double distanciaParede = entrada.nextDouble();
        
        double anguloRadianos = Math.toRadians(anguloGraus);

        double comprimentoEscada = distanciaParede / Math.cos(anguloRadianos);
        
        System.out.println("O comprimento da escada necessário é de " + comprimentoEscada + " metros.");
        entrada.close();
    }
}
