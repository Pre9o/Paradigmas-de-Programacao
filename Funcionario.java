import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double salarioBruto, inss, ir, salarioLiquido;
        int codigo, horasTrabalhadas, numDependentes;
        
        for(int i = 1; i <= 10; i++) {
            System.out.println("Funcionário " + i + ":");
            System.out.print("Código: ");
            codigo = input.nextInt();
            System.out.print("Horas trabalhadas: ");
            horasTrabalhadas = input.nextInt();
            System.out.print("Número de dependentes: ");
            numDependentes = input.nextInt();
            
            salarioBruto = horasTrabalhadas * 12.0
                    + numDependentes * 40.0;
            inss = salarioBruto * 0.085;
            ir = salarioBruto * 0.05;
            salarioLiquido = salarioBruto - inss - ir;
            
            System.out.println();
            System.out.println("Código: " + codigo);
            System.out.printf("Desconto INSS: %.2f%n", inss);
            System.out.printf("Desconto IR: %.2f%n", ir);
            System.out.printf("Salário líquido: %.2f%n", salarioLiquido);
            System.out.println();
        }
        
        input.close();
    }
}

