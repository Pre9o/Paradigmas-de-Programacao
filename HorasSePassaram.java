import java.util.Scanner;

public class HorasSePassaram {
    public static void main(String[] args){
        int horas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        horas = scanner.nextInt();

        System.out.print("Passaram-se " + (horas * 60));
        System.out.println(" minutos");

        scanner.close();
    }
    
}
