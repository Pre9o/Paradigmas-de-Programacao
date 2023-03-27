import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;

        System.out.println("Digite tres numeros:");

        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if(num1 > 0){
            System.out.println("A raiz quadrada de " + num1 + " é: " + Math.sqrt(num1));
        }
        else{
            System.out.println("O quadrado de " + num1 + " é: " + Math.pow(num1, 2));
        }

        if(num2 > 10 && num2 < 100){
            System.out.println("Numero esta entre 10 e 100 - intervalo permitido");
        }
        else{
            System.out.println("Numero fora do intervalo permitido");
        }

        if(num3 < num2){
            System.out.println("A diferença entre os numeros 2 e 3 é: " + (num2 - num3));
        }
        else{
            System.out.println("O terceiro numero + 1 é: " + (num3 + 1));
        }

        scanner.close();
    }
}
