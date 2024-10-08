public class Retangulo{
    int altura = 1;
    int largura = 1;

    public void calcularArea(){
        System.out.println("Area: " + (this.altura * this.largura));
    }

    public void calcularPerimetro(){
        System.out.println("Perímetro: " + (2 * (this.altura + this.largura)));
    }
    
    public void setAltura(int altura){
        if(altura > 0 && altura < 20)
            this.altura = altura;
        else{
            System.out.println("Altura inválida! (1 a 20)");
        }
    }

    public void setLargura(int largura){
        if(largura > 0 && largura < 20)
            this.largura = largura;
        else{
            System.out.println("Largura inválida! (1 a 20)");
        }
    }
    
    public void getAltura(){
        System.out.println("Altura: " + this.altura);
    }

    public void getLargura(){
        System.out.println("Largura: " + this.largura);
    }
}
