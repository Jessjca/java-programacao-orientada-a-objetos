import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//Jessica Costa 20.2.8006
public class VerificaIdade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a data de nascimento (no formato yyyy-mm-dd): ");
            String dNascimentoUsuario = scanner.nextLine();

            LocalDate dNascimento = LocalDate.parse(dNascimentoUsuario);
            LocalDate dAtual = LocalDate.now();

            //calcula o período entre a data de nascimento da pessoa e a data atual
            Period periodo = Period.between(dNascimento, dAtual);
            //atribui a variavel idade o valor de período em anos
            int idade = periodo.getYears();

            if (idade >= 18) {
                System.out.println("SUCESSO! Você tem " + idade + " anos e pode acessar o sistema.");
            } else {
                System.out.println("Menores de 18 anos não podem acessar o sistema.");
            }
        }
    }
}
