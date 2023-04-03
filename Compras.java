import java.util.Scanner;

public class Compras {
    public static void main(String[] args){
        int codigo;
        int quantidade;

        System.out.println("Digite o código do produto:");
        Scanner scanner = new Scanner(System.in);
        codigo = scanner.nextInt();

        System.out.println("Digite a quantidade:");
        quantidade = scanner.nextInt();

        if(codigo == 1001){
            System.out.println("O valor a pagar é de R$ " + quantidade * 5.32);
        }
        else if(codigo == 1324){
            System.out.println("O valor a pagar é de R$ " + quantidade * 6.45);
        }
        else if(codigo == 6548){
            System.out.println("O valor a pagar é de R$ " + quantidade * 2.37);
        }
        else if(codigo == 987){
            System.out.println("O valor a pagar é de R$ " + quantidade * 5.32);
        }
        else if(codigo == 7623){
            System.out.println("O valor a pagar é de R$ " + quantidade * 6.45);
        }
        else{
            System.out.println("Código invalido"); 
        }

        scanner.close();
    }
}
