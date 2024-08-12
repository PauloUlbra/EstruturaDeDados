import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void inserirAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    public void listarAlunos(){
        alunos.forEach(aluno -> System.out.println("Nome do Aluno: " + aluno.getNome()));
    }
}
