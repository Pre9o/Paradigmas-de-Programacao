import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args){
        int num1;
        int num2;

        System.out.println("Digite dois numeros:");

        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println("Numeros iguais");
        }
        else{
            if(num1 > num2){
                System.out.println(num1 + " é maior numero");
            }
            else{
                System.out.println(num2 + " é maior numero");
            }
        }

        scanner.close();
    }
}
