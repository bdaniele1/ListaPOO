import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        int opcao;

        System.out.println("Programa de menu de opcoes.");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Opcao 1 - Aprender");
        System.out.println("Opcao 2 - Escrever");
        System.out.println("Opcao 3 - Falar");
        System.out.println("Opcao S - Sair\n\n");

        System.out.println("Escolha uma opcao:");
        opcao = entrada.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Opcao Aprender Selecionada.");
                break;

            case 2:
                System.out.println("Opcao Escrever Selecionada");
                break;

            case 3:
                System.out.println("Opcao Falar Selecionada");
                break;

            default:
                System.out.println("Opcao inválida.");
                break;
        }

        while (opcao == S) {
            System.out.println("Deseja encerrar o programa?");
        }

    }
}