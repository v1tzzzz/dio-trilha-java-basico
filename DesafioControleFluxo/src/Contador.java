import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = keyboard.nextInt();
        System.out.println("Digire o segundo parametro: ");
        int parametroDois = keyboard.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
    }
  
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // contador 
        int contagem = parametroUm - parametroDois;
      
        for(int contador = 1; contador <= contagem; contador++) {
            System.out.println("imprimindo o numero: " + contador);
        }
    }
}