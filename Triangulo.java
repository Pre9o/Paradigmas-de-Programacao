import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        double lado1;
        double lado2;
        double lado3;
        boolean forma_triangulo;

        System.out.println("Digite o lado 1:");
        Scanner scanner = new Scanner(System.in);
        lado1 = scanner.nextDouble();

        System.out.println("Digite o lado 2:");
        lado2 = scanner.nextDouble();

        System.out.println("Digite o lado 3:");
        lado3 = scanner.nextDouble();

        if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            forma_triangulo = true;
        }
        else{
            forma_triangulo = false;
        }

        if(forma_triangulo){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            }
            else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("Triângulo Isósceles");
            }
            else{
                System.out.println("Triângulo Escaleno");
            }
        }
        else{
            System.out.println("Não forma um triângulo");
        }

        scanner.close();
    }
}
