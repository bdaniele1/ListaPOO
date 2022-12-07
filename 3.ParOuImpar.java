import java.util.Scanner;

class ParOuImpar {

    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para verificar se um numero eh par ou impar.");

        System.out.println("Digite um numero:");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse numero eh par!");

        }

        else {
            System.out.println("Esse numero eh impar!");
        }

    }

}
