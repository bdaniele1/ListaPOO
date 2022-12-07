import java.util.Scanner;

class Raizes {
  public static void main(String[] args) {
    double A, B, C;
    double delta, x1, x2;

    System.out.println("Programa para encontrar raizes de um equaçao.");

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor de A:");
    A = scan.nextDouble();

    System.out.println("Digite o valor de B:");
    B = scan.nextDouble();

    System.out.println("Digite o valor de C:");
    C = scan.nextDouble();

    delta = (B * B - 4 * A * C);

    if (delta >= 0) {
      x1 = (-B + (delta)) / 2 * A;
      x2 = (-B - (delta)) / 2 * A;

      System.out.printf("A equacao eh igual a:" + A, B, C);
      System.out.printf("As raizes sao:" + x1, x2);
    } else {
      System.out.println("Nao existem raizes.");
    }

  }
}
