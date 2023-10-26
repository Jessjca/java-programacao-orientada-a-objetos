public class Professor extends Funcionario {
    private String titulacao;
    private String areaPesquisa;

    public Professor(String nome, String endereco, String telefone, String cpf, String numeroCTPS, double salario, String titulacao, String areaPesquisa) {
        super(nome, endereco, telefone, cpf, numeroCTPS, salario);
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }
}