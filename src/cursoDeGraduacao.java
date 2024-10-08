public class cursoDeGraduacao{
    String sigla;
    String nome;
    String turno;
    int ingressantesporano;

    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public void setIngressantesporano(int ingressantesporano){
        this.ingressantesporano = ingressantesporano;
    }

    public void getSigla(){
        System.out.println("Sigla: " + this.sigla);
    }

    public void getNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void getTurno(){
        System.out.println("Turno: " + this.turno);
    }

    public void getIngressantesporano(){
        System.out.println("Ingressantes por ano: " + this.ingressantesporano);
    }
}
