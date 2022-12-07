import java.util.Scanner;

class Temperatura {
    public static void main (String [] args){
        double C,F;
        

        System.out.println("Programa para transformar temperatura.");
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o valor da temperatura(°F):");
        F = entrada.nextDouble();

        C = (5*(F – 32)/9);




    }
}