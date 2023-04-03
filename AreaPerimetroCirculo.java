import java.util.Scanner;

public class AreaPerimetroCirculo {
    public static void main(String[] args){
        double raio;
        double area;
        double perimetro;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        raio = scanner.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

        scanner.close();
    }
}
