import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ":");

            System.out.print("Código do aluno: ");
            int codigo = scanner.nextInt();

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();

            double media = calcularMediaPonderada(nota1, nota2, nota3);
            String situacao = media >= 5 ? "APROVADO" : "REPROVADO";

            System.out.println("Código do aluno: " + codigo);
            System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
            System.out.println("Média: " + media);
            System.out.println("Situação: " + situacao);
        }
    }

    public static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
        double maiorNota = Math.max(nota1, Math.max(nota2, nota3));
        double media = (maiorNota * 4 + (nota1 + nota2 + nota3 - maiorNota) * 3) / 10;
        return media;
    }
}
