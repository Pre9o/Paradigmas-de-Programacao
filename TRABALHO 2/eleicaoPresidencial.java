import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class eleicaoPresidencial {
    public static void main(String[] args) {
        List<Integer> votos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código de votação (1 a 4 para os candidatos, 5 para voto nulo, 6 para voto em branco, 0 para encerrar):");
        while (true) {
            int codigoVoto = scanner.nextInt();

            if (codigoVoto == 0) {
                break;
            }

            votos.add(codigoVoto);
        }

        long totalVotosNulos = votos.stream()
                .filter(voto -> voto == 5)
                .count();

        long totalVotosBrancos = votos.stream()
                .filter(voto -> voto == 6)
                .count();

        List<Long> totalVotosCandidatos = votos.stream()
                .filter(voto -> voto >= 1 && voto <= 4)
                .collect(Collectors.groupingBy(voto -> voto, Collectors.counting()))
                .values()
                .stream()
                .collect(Collectors.toList());

        // Exibição dos resultados
        for (int i = 0; i < totalVotosCandidatos.size(); i++) {
            System.out.println("Total de votos para o candidato " + (i + 1) + ": " + totalVotosCandidatos.get(i));
        }

        System.out.println("Total de votos nulos: " + totalVotosNulos);
        System.out.println("Total de votos em branco: " + totalVotosBrancos);
    }
}
