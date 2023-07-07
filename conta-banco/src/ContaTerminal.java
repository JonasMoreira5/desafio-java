import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            // Exibir as mensagens para ao usuario
            System.out.println("Digite o numero da conta: ");
            int numeroDaConta = scanner.nextInt();

            System.out.println("Digite o numero da agencia: ");
            String agencia = scanner.next();

            System.out.println("Informe o nome do Cliente: ");
            String nomeCliente = scanner.next();

            System.out.println("infome o sobrenome do Cliente: ");
            String sobrenomeCliente = scanner.next();

            System.out.println("Informe o Saldo da Conta: ");
            Double saldo = scanner.nextDouble();

            // Exibir a mensagem da conta criada
            System.out.println("Olá "+ nomeCliente +" "+ sobrenomeCliente +", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já esta disponivel para saque.");
    }
}
