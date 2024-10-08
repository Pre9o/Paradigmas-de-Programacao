import java.util.Scanner;

public class Livros {
    public static void main(String[] args) {
        String sexo;
        int idade;
        int quantidade_de_livros_que_leu;
        int total_livros_dos_menores_de_10_anos = 0;
        int soma_idade_homens_que_leram_menos_de_5_livros = 0;
        int quantidade_homens_que_leram_menos_de_5_livros = 0;
        int quantidade_mulheres_que_leram_mais_de_5_livros = 0;
        int quantidade_de_pessoas = 0;
        int quantidade_de_pessoas_que_nao_leram_livro = 0;
        double media_idade_homens_que_leram_menos_de_5_livros = 0;
        double percentual_de_quem_nao_leu_livro = 0;

        Scanner scanner = new Scanner(System.in); 

        do {
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();

            if (idade > 0) {
                System.out.println("Digite o sexo:");
                sexo = scanner.next();

                System.out.println("Digite a quantidade de livros que leu:");
                quantidade_de_livros_que_leu = scanner.nextInt();

                if (idade < 10) {
                    total_livros_dos_menores_de_10_anos += quantidade_de_livros_que_leu;
                }

                if (sexo.equals("feminino")) { 
                    if (quantidade_de_livros_que_leu > 5) {
                        quantidade_mulheres_que_leram_mais_de_5_livros++;
                    }
                } else {
                    if (quantidade_de_livros_que_leu < 5) {
                        soma_idade_homens_que_leram_menos_de_5_livros += idade;
                        quantidade_homens_que_leram_menos_de_5_livros++;
                    }
                }

                if (quantidade_de_livros_que_leu == 0) {
                    quantidade_de_pessoas_que_nao_leram_livro++;
                }

                quantidade_de_pessoas++;
            }
        } while (idade > 0);

        scanner.close(); 

        media_idade_homens_que_leram_menos_de_5_livros = soma_idade_homens_que_leram_menos_de_5_livros
                / quantidade_homens_que_leram_menos_de_5_livros;
        percentual_de_quem_nao_leu_livro = (quantidade_de_pessoas_que_nao_leram_livro * 100) / quantidade_de_pessoas;

        System.out.println("A media de idade dos homens que leram menos de 5 livros é: "
                + media_idade_homens_que_leram_menos_de_5_livros);
        System.out.println("A quantidade de mulheres que leram mais de 5 livros é: "
                + quantidade_mulheres_que_leram_mais_de_5_livros);
        System.out.println(
                "O total de livros lidos pelos menores de 10 anos é: " + total_livros_dos_menores_de_10_anos);
        System.out.println("O percentual de pessoas que não leram livros é: " + percentual_de_quem_nao_leu_livro);
    }
}
