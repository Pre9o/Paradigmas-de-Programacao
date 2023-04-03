public class Professor{
    int matricula;
    String nome;
    String endereco;
    String titulacao;
    String areadeatuacao;

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public void setAreadeatuacao(String areadeatuacao){
        this.areadeatuacao = areadeatuacao;
    }

    public void getMatricula(){
        System.out.println("Matrícula: " + this.matricula);
    }

    public void getNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void getEndereco(){
        System.out.println("Endereço: " + this.endereco);
    }

    public void getTitulacao(){
        System.out.println("Titulação: " + this.titulacao);
    }

    public void getAreadeatuacao(){
        System.out.println("Area de Atuação: " + this.areadeatuacao);
    }
}
