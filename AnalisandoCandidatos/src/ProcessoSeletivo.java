import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {

        imprimirSelecionados();

    }
    static void imprimirSelecionados() {
        String[] candidatos = {"Luiz", "Felipe", "Pedro", "Joo", "Paulo"};
        System.out.println("Imprimindo uma lista de candidatos informando o indice do elemento");

        // se adicionar () entre a variavel pode executar codigos
        // resultando em modificacoes na impressao
        for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero: " + (indice+1) + " e o " + candidatos[indice]);
        }

        System.out.println("Modelo de impressao com o forEach ");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static double valorPreentendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Luiz", "Felipe", "Pedro", "Joo", "Paulo", "Guilherme", "Caio", "Rafael", "Lucas", "Matheus"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPreentendido();

            System.out.println("O candidato " + candidato + ", solicitou este valor de salario " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado a vaga.");
               candidatosSelecionados++;
            } 
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma cotra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
