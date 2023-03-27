import java.util.Scanner;

public class Aulas {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double media;

        int aulas_ministradas;
        int aulas_assistidas; 

        System.out.println("Digite a nota 1:");
        Scanner scanner = new Scanner(System.in);
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a quantidade de aulas ministradas:");
        aulas_ministradas = scanner.nextInt();

        System.out.println("Digite a quantidade de aulas assistidas:");
        aulas_assistidas = scanner.nextInt();

        media = (nota1 + nota2) / 2;

        System.out.println("A média final do aluno foi: " + media);

        if(media >= 6 && aulas_assistidas >= (aulas_ministradas * 0.75)){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}
