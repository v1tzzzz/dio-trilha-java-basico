public class Argumentos {
    public static void main(String[] args) {
        // Os argumentos comecan no Indice [0]
        String nome = args[0];
        String sobrenome = args[1]; 
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        // O arquivo AULA.md contem as informacoes de como passar argumentos no terminal

        // Imprimindo os argumentos
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
