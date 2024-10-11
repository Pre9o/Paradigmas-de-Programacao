import java.util.Scanner;
import java.util.stream.IntStream;

public class contagemIntervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        long intervalo1 = contarNumerosNoIntervalo(numeros, 0, 25);
        long intervalo2 = contarNumerosNoIntervalo(numeros, 26, 50);
        long intervalo3 = contarNumerosNoIntervalo(numeros, 51, 75);
        long intervalo4 = contarNumerosNoIntervalo(numeros, 76, 100);

        System.out.println("Quantidade de números no intervalo [0, 25]: " + intervalo1);
        System.out.println("Quantidade de números no intervalo [26, 50]: " + intervalo2);
        System.out.println("Quantidade de números no intervalo [51, 75]: " + intervalo3);
        System.out.println("Quantidade de números no intervalo [76, 100]: " + intervalo4);
    }

    public static long contarNumerosNoIntervalo(int[] numeros, int inicio, int fim) {
        return IntStream.of(numeros)
                .filter(num -> num >= inicio && num <= fim)
                .count();
    }
}
