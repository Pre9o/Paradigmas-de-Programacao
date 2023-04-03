import java.util.Scanner;

public class CategoriasNadador {
    public static void main(String[] args){
        int idade;

        System.out.println("Digite a idade do nadador:");

        Scanner scanner = new Scanner(System.in);

        idade = scanner.nextInt();

        if(idade >= 5 && idade <= 7){
            System.out.println("Categoria Infantil A");
        }
        else if(idade >= 8 && idade <= 10){
            System.out.println("Categoria Infantil B");
        }
        else if(idade >= 11 && idade <= 13){
            System.out.println("Categoria Juvenil A");
        }
        else if(idade >= 14 && idade <= 17){
            System.out.println("Categoria Juvenil B");
        }
        else if(idade >= 18){
            System.out.println("Categoria Senior");
        }
        else{
            System.out.println("Idade invalida");
        }
        scanner.close();
    }
}