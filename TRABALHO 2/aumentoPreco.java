import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aumentoPreco {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código e o preço de custo de cada produto (digite um código negativo para encerrar):");
        while (true) {
            System.out.print("Código do produto: ");
            int codigo = scanner.nextInt();

            if (codigo < 0) {
                break;
            }

            System.out.print("Preço de custo: ");
            double precoCusto = scanner.nextDouble();

            Produto produto = new Produto(codigo, precoCusto);
            produtos.add(produto);
        }

        double mediaPrecos = produtos.stream()
                .mapToDouble(Produto::getPrecoNovo)
                .average()
                .orElse(0);

        System.out.println("Código | Preço Novo");
        for (Produto produto : produtos) {
            System.out.println(produto.getCodigo() + " | " + produto.getPrecoNovo());
        }

        System.out.println("Média de preço dos produtos (após o aumento): " + mediaPrecos);
    }
}

class Produto {
    private int codigo;
    private double precoCusto;

    public Produto(int codigo, double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecoNovo() {
        return precoCusto * 1.2;
    }
}
