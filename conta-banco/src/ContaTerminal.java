import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.println("Por favor, digite o número da conta!");
     int numero = scanner.nextInt();

     System.out.println("Por favor, digite o numero da agência!");
     String agencia = scanner.next();

     System.out.println("Por favor, digite seu nome!");
     String nomeCliente = scanner.next();

     System.out.println("Por favor, digite o valor do saldo que deseja sacar!");
     double saldo = scanner.nextDouble();

     System.out.println("Olá," + nomeCliente + "" + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    
    }
}
