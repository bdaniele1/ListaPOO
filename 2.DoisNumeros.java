import java.util.Scanner;

class DoisNumeros {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Programa para ler dois numeros inteiros.\n");

        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Numeros iguais");
        }
        if (num1 != num2) {
            System.out.println("Numeros diferentes");
        }
        if (num1 > num2) {
            System.out.println("Numero maior");
        }
        if (num1 < num2) {
            System.out.println("Numero menor");
        }
        if (num1 >= num2) {
            System.out.println("Numero maior ou igual");

        } else if (num1 <= num2) {
            System.out.println("Numero menor ou igual");
        }

    }
}