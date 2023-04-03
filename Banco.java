import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        double saldo_medio;

        System.out.println("Digite o saldo médio:");
        Scanner scanner = new Scanner(System.in);
        saldo_medio = scanner.nextDouble();

        if(saldo_medio > 0 && saldo_medio <= 200){
            System.out.println("O saldo medio é de R$ " + saldo_medio + " e o credito é de R$ 0");
        }
        else if(saldo_medio > 200 && saldo_medio <= 400){
            System.out.println("O saldo medio é de R$ " + saldo_medio + " e o credito é de R$ " + saldo_medio * 0.2);
        }
        else if(saldo_medio > 400 && saldo_medio <= 600){
            System.out.println("O saldo medio é de R$ " + saldo_medio + " e o credito é de R$ " + saldo_medio * 0.3);
        }
        else if(saldo_medio > 600){
            System.out.println("O saldo medio é de R$ " + saldo_medio + " e o credito é de R$ " + saldo_medio * 0.4);
        }
        else{
            System.out.println("Saldo médio invalido");
        }

        scanner.close();
    }
}
