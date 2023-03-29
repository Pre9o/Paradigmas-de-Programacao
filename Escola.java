import java.util.Scanner;

public class Escola {
    public static void main(String[] args){
        int serie;
        int quantidade_de_livros_lidos;
        int quantidade_de_alunos_terceira_serie = 0;
        int maior_quantidade_lida_por_alguem_da_quarta_serie = 0;
        int quantidade_de_alunos_que_nao_gostam_de_fazer_redacao_da_terceira_serie = 0;
        double porcentagem_de_alunos_que_nao_gostam_de_fazer_redacao_da_terceira_serie; 
        String gosta_de_fazer_redacao;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite sua serie:");
            serie = scanner.nextInt();

            if(serie > 0 && serie < 5){
                System.out.println("Quantos livros lidos por mes?");
                quantidade_de_livros_lidos = scanner.nextInt();

                System.out.println("Gosta de fazer redacao?");
                gosta_de_fazer_redacao = scanner.next();

                if(serie == 3){
                    quantidade_de_alunos_terceira_serie++;
                    if(gosta_de_fazer_redacao.equals("nao")){
                        quantidade_de_alunos_que_nao_gostam_de_fazer_redacao_da_terceira_serie++;
                    }
                }
                if(serie == 4){
                    if(quantidade_de_livros_lidos > maior_quantidade_lida_por_alguem_da_quarta_serie){
                        maior_quantidade_lida_por_alguem_da_quarta_serie = quantidade_de_livros_lidos;
                    }
                }
            }
        }while(serie != 0);

        scanner.close();

        porcentagem_de_alunos_que_nao_gostam_de_fazer_redacao_da_terceira_serie = (quantidade_de_alunos_que_nao_gostam_de_fazer_redacao_da_terceira_serie * 100) / quantidade_de_alunos_terceira_serie;

        System.out.println("A quantidade de alunos na terceira serie é: " + quantidade_de_alunos_terceira_serie);
        System.out.println("A maior quantidade de livros lidos por alguem da quarta serie é: " + maior_quantidade_lida_por_alguem_da_quarta_serie);
        System.out.println("A porcentagem de alunos que nao gostam de fazer redacao da terceira serie é: " + porcentagem_de_alunos_que_nao_gostam_de_fazer_redacao_da_terceira_serie);
    }
}
