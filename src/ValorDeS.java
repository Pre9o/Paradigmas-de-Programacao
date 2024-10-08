public class ValorDeS{
    public static void main(String[] args){
        int denominador;
        int numerador = 1;

        double s = 0;

        for(denominador = 1; denominador <=50; denominador++){
            s += (double) numerador / denominador;
            numerador += 2;
        }

        System.out.println("O valor de S é: " + s);
    }
}