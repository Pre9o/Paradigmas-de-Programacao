public class testeCurso{
    //testar a classe cursoDeGraduacao
    public static void main(String[] args){
        cursoDeGraduacao curso = new cursoDeGraduacao();
        curso.setSigla("ADS");
        curso.setNome("Análise e Desenvolvimento de Sistemas");
        curso.setTurno("Noturno");
        curso.setIngressantesporano(50);
        curso.getSigla();
        curso.getNome();
        curso.getTurno();
        curso.getIngressantesporano();
    }
}
