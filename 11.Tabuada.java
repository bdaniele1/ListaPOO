import java.util.Scanner;

class Tabuada {

    public static void main(String[] args) {
        int num, i;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para imprimir tabuada de soma e multiplicacao.\n");

        System.out.println("Digite um numero entre 1 e 10:");
        num = entrada.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println("" + num * i);
            System.out.println("" + (num + i));
        }
    }

}
