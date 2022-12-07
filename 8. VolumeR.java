import java.util.Scanner;

class VolumeR {
    private static final double 𝜋 = 3.14;

    public static void main(String[] args) {
        double R, volume;

        System.out.println("Programa para calcular volume da esfera de um raio.");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio:");
        R = scan.nextDouble();

        if (R > 0) {
            volume = (4 * 𝜋 * R * R * R) / 3;
        } else {
            System.out.println("Nao eh possivel realizar o calculo. ");
        }

    }
}