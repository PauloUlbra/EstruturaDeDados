public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Paulo Roberto");
        pessoa1.setEmail("paulo_judoca.estudante@hotmail.com");
        pessoa1.logar();

        Professor professor1 = new Professor();
        professor1.setNome("Juliano");
        professor1.logar();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Paulo Roberto");
        aluno1.logar();

        Turma turma1 = new Turma();
        turma1.setNome("Estrutura de Dados");
        turma1.setProfessor(professor1);
        turma1.inserirAluno(aluno1);
        turma1.listarAlunos();
    }
}
