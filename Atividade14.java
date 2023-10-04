import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoAtual, anoNasc,idadeAnos, idadeMeses, idadeDias, idadeSem;

        System.out.print("Em que ano você está? ");
        anoAtual = entrada.nextInt();
        System.out.print("Em que ano você nasceu? ");
        anoNasc = entrada.nextInt();

        idadeAnos = anoAtual - anoNasc;
        idadeMeses = idadeAnos * 12;
        idadeSem = idadeAnos * 52;
        idadeDias = idadeAnos * 365;
        
        System.out.println("Sua idade em anos é: " + idadeAnos);
        System.out.println("Sua idade em meses: " + idadeMeses);
        System.out.println("Sua idade em semanas: " + idadeSem);
        System.out.println("Sua idade em dias: " + idadeDias);

        entrada.close();
    }
}
