public class disciplinaDeGraduacao{
    int codigo;
    String nome;
    String prerequisito;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPrerequisito(String prerequisito){
        this.prerequisito = prerequisito;
    }

    public void getCodigo(){
        System.out.println("Código: " + this.codigo);
    }

    public void getNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void getPrerequisito(){
        System.out.println("Pré-requisito: " + this.prerequisito);
    }
}
