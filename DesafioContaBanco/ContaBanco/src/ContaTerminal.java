import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        try (
            // importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {

            // Exibir as mensagens para o nosso usuário
            System.out.println("Seja bem vindo(a)! Por favor insira os dados conforme solicitado para criar sua conta:");
            System.out.println("Digite o número da Agência: ");

            // obter pela classe scanner os valores digitados no terminal
            agencia = sc.next();

            System.out.println("Digite o número da conta: ");
            numeroConta = sc.nextInt();

            System.out.println("Digite seu nome: ");
            nomeCliente = sc.next();

            System.out.println("Digite o valor a ser depositado: ");
            saldo = sc.nextDouble();
            
            // exibir a mensagem conta criada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");
        }
    }
}
