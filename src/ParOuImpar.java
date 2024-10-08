import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        int num;

        System.out.println("Digite um numero: ");
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("O numero é par");
        }
        else{
            System.out.println("O numero é ímpar");
        }

        scanner.close();
    }
}
