import java.util.Scanner;

public class MediasPositivas{
    public static void main(String[] args){
        double total = 0;
        int numero_digitado;
        int quantidade = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite um número:");
            numero_digitado = scanner.nextInt();

            if(numero_digitado > 0){
                total += numero_digitado;
                quantidade++;
            }
        }while(numero_digitado > 0);

        if(quantidade > 0){
            System.out.println("A média dos números digitados é: " + (total / quantidade));
        }
        else{
            System.out.println("Não foi digitado nenhum número positivo");
        }

        scanner.close();
    }   
}