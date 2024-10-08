import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agencia: ");
        int numeroAgencia = teclado.nextInt();

        System.out.println("Digite qual a sua agencia: ");
        String nomeAgencia = teclado.next();

        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.next();

        System.out.println("Seu saldo bancario é: ");
        double saldoBancario = teclado.nextDouble();

        // Imprimir os dados na tela
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta" + numeroAgencia + ", e seu saldo " + saldoBancario + " já está disponível para saque");
        
    }
}