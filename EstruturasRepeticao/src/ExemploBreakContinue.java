public class ExemploBreakContinue {
    
    public static void main(String[] args) {
        
        // Exemplo Break
        for (int numero = 0; numero <= 5; numero++) {

            if(numero == 3){
                break;
            }

            System.out.println("Número: " + numero);
        }

        // Exemplo Continue 
        for (int numeroContinue = 0; numeroContinue <= 5; numeroContinue++) {

            if(numeroContinue == 3){
                continue;
            }
            
            System.out.println("Número: " + numeroContinue);
        }
    }
}