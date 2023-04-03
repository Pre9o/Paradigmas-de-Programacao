public class testeProfessor{
    public static void main(String[] args){
        //testar classe Professor
        Professor p1 = new Professor();
        p1.setMatricula(123);
        p1.setNome("João");
        p1.setEndereco("Rua 1");
        p1.setTitulacao("Mestre");
        p1.setAreadeatuacao("Informática");
        p1.getMatricula();
        p1.getNome();
        p1.getEndereco();
        p1.getTitulacao();
        p1.getAreadeatuacao();
    }
}
