import java.util.Scanner;

public class PerimetroEArea {
    public static void main(String[] args){
        double base;
        double altura;
        double perimetro;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();

        perimetro = (base * 2) + (altura * 2);
        area = base * altura;

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
