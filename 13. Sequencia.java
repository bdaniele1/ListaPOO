import java.util.Arrays;

class Sequencia {
    private static int i;

    public static void main(String[] args) {

        int[] inteiros = { 5, 15, 35, 9, 55, 41, 98, 3, 27, 7, 18, 30, 90, 54, 49, 110, 43, 101, 13, 66 };

        Arrays.sort(inteiros);

        System.out.println("Ordem crescente:");
        for (i = 1; i <= inteiros.length; i++) {
            System.out.println(inteiros[i] + "");
        }
    }
}