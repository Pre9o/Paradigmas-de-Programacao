public class testeDisciplina{
    public static void main(String[] args){
        //testar classe disciplinaDeGraduacao
        disciplinaDeGraduacao d1 = new disciplinaDeGraduacao();
        d1.setCodigo(123);
        d1.setNome("Programação Orientada a Objetos");
        d1.setPrerequisito("Programação Estruturada");
        d1.getCodigo();
        d1.getNome();
        d1.getPrerequisito();
    }
}
