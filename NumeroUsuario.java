import java.util.Scanner;

public class NumeroUsuario {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiro_numero_usuario = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int segundo_numero_usuario = scanner.nextInt();
        
        System.out.println("Digite outro número: ");
        int terceiro_numero_usuario = scanner.nextInt();

        double media = (primeiro_numero_usuario + segundo_numero_usuario + terceiro_numero_usuario) / 3.0;

        System.out.println("A média dos números digitados é: " + media);

        scanner.close();

    }
}
