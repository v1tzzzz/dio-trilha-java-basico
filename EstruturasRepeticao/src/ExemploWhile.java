/*
 * import java.util.concurrent.ThreadLocalRandom;
 */


public class ExemploWhile {
    
    public static void main(String[] args) {
        
        /*
         * O instrutor importa uma biblioteca que sortea numeros aleatorios
         * mas nao utilizarei aqui por simplicidade, porem estara comentado para
         * futuro usos ou encixes neste exemplo
         */

         int numeroTeste = 50;

         while (numeroTeste > 0) {
             int numeroDecrescente = 10;
 
             System.out.println("O numero foi testado e o valor e de " + numeroTeste);
             numeroTeste = numeroTeste - numeroDecrescente;
         }
         System.out.println("O resultado final foi " + numeroTeste + ". Para o valor ser declarado falso");
    }
    
    /*
     * private static double valorAleatorio() {
     *     return ThreadLocalRandom.current().nextDouble(numeros que serao sorteados);
     * }
     */
}
