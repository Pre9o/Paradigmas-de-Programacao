import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pesquisaPrefeitura {
    public static void main(String[] args) {
        List<Habitante> habitantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados dos habitantes
        System.out.println("Digite o salário e o número de filhos dos habitantes (digite um salário negativo para encerrar):");
        while (true) {
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int numFilhos = scanner.nextInt();

            Habitante habitante = new Habitante(salario, numFilhos);
            habitantes.add(habitante);
        }

        // Cálculo das médias
        double mediaSalario = habitantes.stream()
                .mapToDouble(Habitante::getSalario)
                .average()
                .orElse(0);

        double mediaFilhos = habitantes.stream()
                .mapToInt(Habitante::getNumFilhos)
                .average()
                .orElse(0);

        // Maior salário
        double maiorSalario = habitantes.stream()
                .mapToDouble(Habitante::getSalario)
                .max()
                .orElse(0);

        // Percentual de pessoas com salário até R$ 1000,00
        long numPessoasSalarioAte1000 = habitantes.stream()
                .filter(h -> h.getSalario() <= 1000)
                .count();

        double percentualSalarioAte1000 = (double) numPessoasSalarioAte1000 / habitantes.size() * 100;

        // Exibição dos resultados
        System.out.println("Média de salário da população: " + mediaSalario);
        System.out.println("Média de número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$ 1000,00: " + percentualSalarioAte1000 + "%");
    }
}

class Habitante {
    private double salario;
    private int numFilhos;

    public Habitante(double salario, int numFilhos) {
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }
}
