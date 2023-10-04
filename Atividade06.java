
import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double salarioFixo, vendas, salarioFinal, comissao;

        //entrada de dados
        System.out.println("Informe o salário fixo do funcionário: R$ ");
        salarioFixo = entrada.nextDouble();
        System.out.println("Informe o valor de suas vendas: ");
        vendas = entrada.nextDouble();

        //processamento de dados
        salarioFinal = salarioFixo + (0.04*vendas);
        comissao = 0.04 * vendas;

        //saida de dados
        System.out.println("O salário final do funcionário é: R$ "+salarioFinal);
        System.out.println("A comissão do funcionário é: "+comissao);

        entrada.close();

    }
}
