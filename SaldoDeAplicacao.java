import java.util.Scanner;

public class SaldoDeAplicacao {
    public static void main(String[] args){
        double aplicacao;
        double taxa = 0.01;  

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");

        aplicacao = scanner.nextDouble();

        System.out.println("O saldo após um ano é: " + (aplicacao + (aplicacao * taxa)));

        scanner.close();
    }
}
