import java.util.Scanner;

class Premio {

    private static int i;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numero = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        String[] premios = { "Carro", "Bicicleta", "Moto", "Bola", "Panela", "Videogame", "TV", "Computador",
                "Celular" };

        System.out.println("Escolha um numero de 1 a 9 para receber seu premio: ");
        numero[0] = scan.nextLine();

        for (int i = 0; i < premios.length; i++)
            ;

        System.out.println("Premio:" + premios[i]);

    }

}
