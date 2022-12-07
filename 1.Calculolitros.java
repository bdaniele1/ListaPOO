import java.util.Scanner;

class CalculoPorLitro {
    public static void main(String[] args) {
        double tempo;
        double velocidadeM;
        double distancia;
        double quantLitros;

        System.out.println("Calcular quantidade de litros de uma viagem.\n\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tempo gasto de viagem (horas): ");
        tempo = entrada.nextDouble();

        System.out.println("Digite a velocidade media gasta(km/h):");
        velocidadeM = entrada.nextDouble();

        System.out.println(distancia = tempo * velocidadeM);

        System.out.println(quantLitros = distancia / 12);

    }

}