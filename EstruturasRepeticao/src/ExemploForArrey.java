public class ExemploForArrey {
    
    public static void main(String[] args) {
        
        // Criando um array
        String alunos[] = {"João", "Maria", "Pedro", "Ana"};

        // Determinando a estrutura de repeticao
        for (int i = 0; i < alunos.length; i++) {
             
            System.out.println("Aluno no indice: " + i + " = " + alunos[i]);
        }

        // Utilizando o termo forEach
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
