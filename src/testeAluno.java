public class testeAluno{
    public static void main(String[] args){
        //testar classe Aluno
        Aluno a1 = new Aluno();
        a1.setMatricula(123);
        a1.setAnodeingresso(2010);
        a1.setSemestredeingresso(1);
        a1.setNome("João");
        a1.setEndereco("Rua 1");
        a1.getMatricula();
        a1.getAnodeingresso();
        a1.getSemestredeingresso();
        a1.getNome();
        a1.getEndereco();
    }
}
