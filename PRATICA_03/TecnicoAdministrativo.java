public class TecnicoAdministrativo extends Funcionario {
    private String cargo;

    public TecnicoAdministrativo(String nome, String endereco, String telefone, String cpf, String numeroCTPS, double salario, String cargo) {
        super(nome, endereco, telefone, cpf, numeroCTPS, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}