import java.util.Scanner;

class Salario {
   public static void main(String[] args) {
      double hTrabalhadas;
      double ValorHora;
      double percentualDesconto;
      double salarioBruto;
      double totalDesconto;

      System.out.println("Programa para calcular salario com desconto e mostrar salario liquido.");

      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite as horas trabalhadas(horas):");
      hTrabalhadas = entrada.nextDouble();

      System.out.println("Digite o valor das horas trabalhadas:");
      ValorHora = entrada.nextDouble();

      System.out.println("Digite o percentual de desconto:");
      percentualDesconto = entrada.nextDouble();

      System.out.println("Salario Bruto:" + hTrabalhadas * ValorHora);

      System.out.println("Total de desconto:" + (percentualDesconto / 100) / salarioBruto);

      System.out.println("Salario liquido:" + (salarioBruto - totalDesconto));

   }
}
