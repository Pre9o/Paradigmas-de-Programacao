import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiro_numero_usuario = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int segundo_numero_usuario = scanner.nextInt();

        System.out.println("A soma dos números digitados é: " + (primeiro_numero_usuario + segundo_numero_usuario));
        
        scanner.close();
    }
    
}
