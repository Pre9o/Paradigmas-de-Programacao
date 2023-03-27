import java.util.Scanner;

public class Poluicao {
    public static void main(String[] args){
        double indice_de_poluicao;

        System.out.println("Digite o índice de poluição:");
        Scanner scanner = new Scanner(System.in);
        indice_de_poluicao = scanner.nextDouble();

        if(indice_de_poluicao >= 0.3){
            if(indice_de_poluicao >= 0.4){
                if(indice_de_poluicao >= 0.5){
                    System.out.println("Todas industrias devem suspender as atividades");
                }
                else{
                    System.out.println("Industrias do grupo 1 e 2 devem suspender as atividades");
                }
            }
            else{
                System.out.println("Industrias do grupo 1 devem suspender as atividades");
            }
        }
        else if(indice_de_poluicao >= 0.05){
            if(indice_de_poluicao <= 0.29){
                System.out.println("Indice de poluição aceitável");
            }
        }
        else{
            System.out.println("Indice de poluição invalido");
        }

        scanner.close();
    }
}
