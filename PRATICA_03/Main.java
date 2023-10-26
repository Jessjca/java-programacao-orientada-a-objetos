public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(32, "Sistemas de Informação", 8);
        Disciplina disciplina1 = new Disciplina(32, "Programação 2", 60);
        Aluno aluno1 = new Aluno("Jessica Costa", "2121212122");

        aluno1.cursarDisciplina(disciplina1);

        System.out.println("\nInformações do Curso:");
        System.out.println("Código do Curso: " + curso1.getCodigo());
        System.out.println("Nome do Curso: " + curso1.getNome());

        System.out.println("\nInformações da Disciplina:");
        System.out.println("Código da Disciplina: " + disciplina1.getCodigo());
        System.out.println("Nome da Disciplina: " + disciplina1.getNome());

        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("CPF do Aluno: " + aluno1.getCpf());
        System.out.println("Disciplinas Cursadas pelo Aluno:");
        for (Disciplina disciplina : aluno1.getDisciplinasCursadas()) {
            System.out.println("  - " + disciplina.getNome());
        }
    }
}
