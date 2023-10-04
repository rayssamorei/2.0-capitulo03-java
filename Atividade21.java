import java.util.Scanner;
public class Atividade21 {
    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double horasTrabalhada, salMin, horasExtra, valorHoraExtra, salBruto, salReceber, qntHorasExtra, valorHoraTrab;

        //Entrada de dados
        System.out.print("Informe as horas trabalhadas: ");
        horasTrabalhada = entrada.nextDouble();
        System.out.println("Informe o salário mínimo: ");
        salMin = entrada.nextDouble();
        System.out.print("Informe as horas extras trabalhadas: ");
        horasExtra = entrada.nextDouble();

        //Processamento de dados
        //Calcular o valor da hora trabalhada (1/8 do salário mínimo)
        valorHoraTrab = salMin / 8.0;
        //Calcular o valor da hora extra (1/4 do salário mínimo)
        valorHoraExtra = salMin / 4.0;
        salBruto = valorHoraTrab * horasTrabalhada;
        qntHorasExtra = horasExtra * valorHoraExtra;
        salReceber = salBruto + qntHorasExtra;

        System.out.println("Salário Bruto é: R$ " + salBruto);
        System.out.println("Quantia pelas horas extras: R$ " + qntHorasExtra);
        System.out.println("Quantia a receber: R$ " + salReceber);

        entrada.close();
    }
}
