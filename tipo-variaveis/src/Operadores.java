public class Operadores {

    public static void main(String[] args) {
        // Operadores Aritmeticos
        // Sao os operadores matematicos transportados para a sintaxe do java
        // Sendo eles: +, -, * e /
        // Exemplo:
        int soma = 10 + 10;

        int subtracao = 10 - 10;

        int multiplicacao = 10 * 10;

        int divisao = 10 / 10;


        // O simbolo de + em Sring representa a concatenacao que e basicamente juntar
        // Exemplo

        String nomeCompleto = "Alysson" + "Vitor";

        System.out.println(nomeCompleto);

        // No exemplo abaixo veremos como representar o concatenacao 
        
        String concatenacao = "qualquercoisa";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        // Nota-se que no codigo acima os resultados tirando o primeiro e o ultimo deram 1111 o que signfica que o a partir do momento que o java identifica uma string ele aplica ao resto do codigo a concatenacao.

        // Operadores Unarios 
        // exemplo: +, -, ++, --, ! sao operadores que basicamente modificam a variavel conforme a matematica ou seja se queremos que o adicionar 1 basta colocar int n1 = 1++; isso faz com que o java adicione 1 a variavel ou em passar em parametro 
        // Exemplo:

        int numero = 5;

        // operador unario
        numero++;
        System.out.println(numero);

        // isso basicamente adiciona mais um como se fosse em uma soma -> numero = numero + 1;

        // Uso do !
        // Exemplo:
        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);

        // este trecho de codigo reatriubui a variavel ela mesma so que invertida ou seja como foi declarada como true ela agora sera false pois o !(exclamacao) a inverte 


        // Operador Ternario, ele e basicamente um if so que em uma linha
        // Ele e representado pela sintaxe de "?:", <condicional> ? <caso seja true> : <caso seja false>
        // Exemplo:

        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

        // Controle de fluxo If e Else 
        if (a==b)
            resultado = "verdadeiro";
        else 
            resultado = "falso";

        System.out.println(resultado);

        // Para fazer este mesmo trecho de codigo usando o operador Ternario pode ser assim
        // Como ja definimos resultado como string nao presciso fazer isso de novo mas se a variavel nao esta definada precisa-se definir 
        resultado = a==b ?"verdadeiro" :"falso";

        System.out.println(resultado);

        // Operadores Relacionais
        // Sao os operadores que relacionam dois valores esperando um resultados de igualdade(==), maior que(>), menor que(<), maior igual(>=), menor igual(<=) e diferente(!=)
        // Exemplo:
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 e igual ao numero2? " + simNao);

        
        simNao = numero1 != numero2;
        System.out.println("numero1 e diferente de numero2? " + simNao);

        
        simNao = numero1 < numero2;
        System.out.println("numero1 e menor que o numero2? " + simNao);
        
        simNao = numero1 > numero2;
        System.out.println("numero1 e maior que o numero2? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 e menor igual ao numero2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 e maior igual ao numero2? " + simNao);

        // Neste trecho de codigo verificamos como funciona os operadores relacionais com numeros mas e com cadeia de caracteres, vulgo "String"
        // Exemplo
        String nomeUm = "Nomeum";
        String nomeDois = "Nomedois";

        // para melhor performance comparando textos e objetos utilizaremos o metodo equals:
        System.out.println(nomeUm.equals(nomeDois));
        
        // Para finalizar temos os operadores logicos sendo eles o &&(e) e ||(ou)
        // Exemplo
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condicoes sao verdadeiras");
        }
        
        if (condicao1 || condicao2) {
            System.out.println("uma das condicoes e verdeira");
        }

        if ((1 < 2) && (2 >1)) {
            System.out.println("Temos dois numeros verdadeiros");
        }
        // Neste trecho de codigo temos os operadores logicos funcionando pois no primeiro nao aparecera caso demos run no codigo pq ambas precisam ser verdadeiras para retornar o Sout
        // na segunda apresenta que caso uma das duas for verdadeira ele retornara o sout
        // na ultima vemos operadores relacionarios tambem apresentam ser um booleano, da mesma forma que se criarmos uma variavel booleana 

    }
}