import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try {
        // Criando o Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual seu sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura? ");
        double altura = scanner.nextDouble();

        // Impressao dos dados
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos de idade e altura precisam ser numericos!");
            System.out.println("Uso indevido da virgula!");
        }
    }
}