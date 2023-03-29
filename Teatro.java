import java.util.Scanner;

public class Teatro {
    public static void main(String[] args){
        int idade;
        int identificador;
        int nota_do_espetaculo;
        int quantidade_de_respostas = 0;
        int soma_das_idades = 0;
        int idade_pessoa_mais_velha = 0;
        int identificador_pessoa_mais_velha = 0;
        int quantidade_de_pessoas_que_responderam_5_menos = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();

            System.out.println("Digite o identificador:");
            identificador = scanner.nextInt();

            do{
                System.out.println("Digite a nota do espetaculo:");
                nota_do_espetaculo = scanner.nextInt();

                if(nota_do_espetaculo < 0 || nota_do_espetaculo > 10){
                    System.out.println("Nota invalida");
                }
            }while(nota_do_espetaculo < 0 || nota_do_espetaculo > 10);

            if(idade > idade_pessoa_mais_velha){
                idade_pessoa_mais_velha = idade;
                identificador_pessoa_mais_velha = identificador;
            }

            if(nota_do_espetaculo <= 5){
                quantidade_de_pessoas_que_responderam_5_menos++;
            }

            soma_das_idades += idade;
            quantidade_de_respostas++;           
        }while(quantidade_de_respostas < 10);

        scanner.close();

        System.out.println("A quantidade de respostas foi: " + quantidade_de_respostas);
        System.out.println("A média das idades é: " + (soma_das_idades / quantidade_de_respostas));
        System.out.println("O percentual de pessoas que responderam 5 ou menos é: " + (quantidade_de_pessoas_que_responderam_5_menos * 100) / quantidade_de_respostas);
        System.out.println("O identificador da pessoa mais velha é: " + identificador_pessoa_mais_velha);
    }
}
