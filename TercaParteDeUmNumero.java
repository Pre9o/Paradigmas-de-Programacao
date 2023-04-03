import java.util.Scanner;

public class TercaParteDeUmNumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero_usuario = scanner.nextInt();

        System.out.println("A terça parte do número digitado é: " + (numero_usuario / 3.0));

        scanner.close();
    }
}
