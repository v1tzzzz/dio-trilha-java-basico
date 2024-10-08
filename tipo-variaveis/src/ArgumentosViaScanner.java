import java.util.Scanner;
import java.util.Locale;


public class ArgumentosViaScanner {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println("Digite Seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite Seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite Sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite Sua Altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo os argumentos
        System.out.println("Seu Nome : " + nome);
        System.out.println("Seu Sobrenome : " + sobrenome);
        System.out.println("Sua Idade : " + idade);
        System.out.println("Sua Altura : " + altura);
    }
}







