import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu Nome: ");
    String nomeDoCliente = scanner.next();

    System.out.println("Digite sua agência: ");
    String agencia = scanner.next();

    System.out.println("Digite sua Conta: ");
    int conta = scanner.nextInt();

    System.out.println("Saldo: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco ");
    System.out.println("sua agência é " + agencia + ", " + "conta " + conta);
    System.out.println("seu Saldo é " + saldo +  " esta pronto para o saque.");

    }
}
