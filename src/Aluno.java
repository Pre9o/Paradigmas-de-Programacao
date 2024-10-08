public class Aluno{
    int matricula;
    int anodeingresso;
    int semestredeingresso;
    String nome;
    String endereco;

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setAnodeingresso(int anodeingresso){
        this.anodeingresso = anodeingresso;
    }

    public void setSemestredeingresso(int semestredeingresso){
        this.semestredeingresso = semestredeingresso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void getMatricula(){
        System.out.println("Matrícula: " + this.matricula);
    }

    public void getAnodeingresso(){
        System.out.println("Ano de Ingresso: " + this.anodeingresso);
    }

    public void getSemestredeingresso(){
        System.out.println("Semestre de Ingresso: " + this.semestredeingresso);
    }

    public void getNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void getEndereco(){
        System.out.println("Endereço: " + this.endereco);
    }
}
