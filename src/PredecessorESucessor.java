import java.util.Scanner;

public class PredecessorESucessor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero_usuario = scanner.nextInt();

        System.out.print("O predecessor do número digitado é: " + (numero_usuario - 1));
        System.out.println(" e o sucessor do número digitado é: " + (numero_usuario + 1));
        
        scanner.close();
    }
}
