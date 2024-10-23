public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        // Condicional composta
        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Condicional encadeada
        nota = 6;
        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Operador ternário
        nota = 8;
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Operador ternário encadeado
        nota = 8;
        resultado = (nota >= 7) ? "Aprovado" : (nota >= 5 && nota < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
