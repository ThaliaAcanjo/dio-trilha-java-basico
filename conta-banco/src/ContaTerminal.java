import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.forLanguageTag("pt_BR"));

            System.out.print("Por favor, digite o número da conta: ");
            int numero = scanner.nextInt();

            System.out.print("Por favor, digite o número da Agência  ");
            String agencia = scanner.next();

            System.out.print("Por favor, digite o nome do titular da conta: ");
            String titular = scanner.next();

            System.out.print("Por favor, digite o saldo da conta: ");    
            double saldo = scanner.nextDouble();

            scanner.close();
            System.out.println("Ola " + titular + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
        }
    }
}