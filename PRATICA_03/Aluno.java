import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String cpf;
    private List<Disciplina> disciplinasCursadas;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.disciplinasCursadas = new ArrayList<>();
    }

    public void cursarDisciplina(Disciplina disciplina) {
        disciplinasCursadas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void setDisciplinasCursadas(List<Disciplina> disciplinasCursadas) {
        this.disciplinasCursadas = disciplinasCursadas;
    }

    public String getCPF() {
        return null;
    }
}