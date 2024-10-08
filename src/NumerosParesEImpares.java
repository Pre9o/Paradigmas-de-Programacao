import java.util.Scanner;

public class NumerosParesEImpares {
    public static void main(String[] args){
        int soma_pares = 0;
        int soma_impares = 0;
        int quantidade_impares;
        double media_impares;

        Scanner scanner = new Scanner(System.in);
        for(quantidade_impares = 1; quantidade_impares <= 10; quantidade_impares++){
            System.out.println("Digite um número:");
            int numero_digitado = scanner.nextInt();

            if(numero_digitado % 2 == 0){
                soma_pares += numero_digitado;
            }
            else{
                soma_impares += numero_digitado;
            }
        }

        scanner.close();
        
        media_impares = soma_impares / (quantidade_impares - 1);

        System.out.println("A soma dos números pares é: " + soma_pares);
        System.out.println("A média dos números ímpares é: " + media_impares);

        }    
}
