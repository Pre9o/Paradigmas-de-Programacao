import java.util.Scanner;

public class DiferencaMaiorMenor {
    public static void main(String[] args){
        int num1;
        int num2;


        System.out.println("Digite dois numeros:");
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("A diferença entre os numeros é: " + (num1 - num2));
        }
        else{
            System.out.println("A diferença entre os numeros é: " + (num2 - num1));
        }

        scanner.close();
    }
}