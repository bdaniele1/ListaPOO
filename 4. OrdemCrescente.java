import java.util.Arrays;
import java.util.Scanner;

class OrdemCrescente {

    private static int i;

    public static void main(String[] args) {

        System.out.println("Programa para organizar numeros em ordem crescente.");

        Scanner entrada = new Scanner(System.in);

        int[] listaNumeros = new int[4];
        System.out.println("Digite o primeiro numero inteiro aleatorio:");
        listaNumeros[0] = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro aleatorio:\n");
        listaNumeros[1] = entrada.nextInt();

        System.out.println("Digite o terceiro numero inteiro aleatorio:\n");
        listaNumeros[2] = entrada.nextInt();

        System.out.println("Digite o quarto numero inteiro aleatorio:\n");
        listaNumeros[3] = entrada.nextInt();

        Arrays.sort(listaNumeros);

        System.out.println("Ordem Crescente:   ");
        for (i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i] + "");
        }

    }

}