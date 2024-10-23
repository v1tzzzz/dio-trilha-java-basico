# Estruturas de Repeticao em Java

As estruturas de repeticao tambem chamadas de iteracao, sao comandos que permitem ao desenvolvedor utilizar de maneira a repetir o codigo varias vezes. Melhorando assim a escrever o codigo tanto quanto melhorar a reler o codigo pois um bloco de codigo pode repetir varias vezes.

Nos temos no java e inumeras outras linguagens a sintaxe:

- **For**
- **While**
- **Do While**

## For 

O For funciona como uma estrutura de repeticao mas finita, onde o bloco de codigo vai funcionar visando uma quantidades de codigos a serem repetidos em mente. O for tambem estipula uma variavel contadora como parametro, alem da condicao booleana e por fim o numero de repeticoes.

```java
// For Sintaxe

for (int variavelContadora; ExpressaoBooleana; Quantidade de Repeticoes) {
    // Bloco de codigo a ser repetido'
    // Este codigo sera excutado ate a expressao retornar falso
}
```
No sentido de retornar "falso" e onde a quantidade de repeticoes bate o numero desejado e retorna falso. Por exemplo se eu quero que este codigo repita 5 vezes, se ele repetir 6 a expressao retorna falso e o codigo nao e mais repetido.

Veja um exemplo de utilizacao do for. <span style="background-color: lightblue">Este codigo esta no arquivo "ExemploFor.java"</span>:
```java

public class ExemploFor {

    public static void main(String[] args) {
        
        for (int carneirinhos = 0; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando Carneirinhos: " + carneirinhos);
        }
        System.out.println("Fim");
    }
}
```

Neste codigo vemos que o os carneirinhos serao contados ate baterem 20, pois e o que expressao booleana indica. Outra coisa e a incrementacao dos carneirinhos com `carneirinhos++` pois aqui ele indica que todas as vezes que o codigo voltar ou retornar, ele incrementa + 1, adiciona mais + 1 pois aqui que o codigo define como ele ira contar, sendo de 1 em 1 (`++`) sendo de 2 em 2 (`+ 2`) e assim por diante.


## For Em Arreys

Para fazer vamos criar um arrey que consiste basicamente em uma variavel que comporta mais de um input do mesmo tipo. Por exemplo se criar um `String` so posso adicionar mais inputs ao arrey em `String`. Pode ser feito um arrey de qualquer tipo. Veja o exemplo abaixo:

```java
    String pessoas[] = {"pessoa1", "pessoa2", "pessoa3"};
```

> O indice em arreys inicia-se em 0. Logo utilizando o for em para repetir o nosso codigo precisamos estipular nossa variavel contadora para 0 `for (int contadora=0;)` para assim conseguimos buscar o a **"pessoa1"** por exemplo.
<span style="background-color: lightblue">O codigo acima se encotra no Arquivo "ExemploForArrey.java"</span>:

```java
public class ExemploForArrey {
    
    public static void main(String[] args) {
        
        // Criando um array
        String alunos[] = {"João", "Maria", "Pedro", "Ana"};

        // Determinando a estrutura de repeticao
        for (int i = 0; i < alunos.length; i++) {
             
            System.out.println("Aluno no indice: " + i + " = " + alunos[i]);
        }
    }
}

```

Tendo o codigo acima como modelo percebemos que o codigo itera sobre a condidade de itens no arrey, pois a e o que este trecho determina `System.out.println("Aluno no indice: " + i + " = " + alunos[i]);` se trocarmos o indice [i] dos alunos teriamos o o resultado apenas de um aluno em especifico, dado que a a propriedade `.length` faz equipara os strings e devolve se e falso ou true. 

### For Each

O `.forEach` esta muito relacionado aos em arreys com `for`'s pois seguindo sua traducao o "para cada", ele determina uma iteracao baseada nos elementos do arrey.

<span style="background-color: lightblue">Este codigo esta no arquivo "ExemploForArrey.java"</span>:

```java
    // Utilizando o termo forEach
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
```

O forEach permite uma forma mais simplificada de iterar sobre um array. Aqui estamos fazendo um loop sobre o array `alunos` e imprimindo cada elemento (aluno) no console. A variavel `aluno` assume em cada iteracao o valor do elemento atual do array.


## Break & Continue 

O **break** e utilizado para parar ou interromper um bloco de codigo onde ele e chamado. O **Continue** interrompe apenas a iteracao atual.

<span style="background-color: lightblue">este codigo esta no arquivo "ExemploBrakContinue.java"</span>:

```java

public class ExemploBreakContinue {
    
    public static void main(String[] args) {
        
        // Exemplo Break
        for (int numero = 0; numero <= 5; numero++) {

            if(numero == 3){
                break;
            }

            System.out.println("Número: " + numero);
        }
    }
}

```

No exemplo acima temos como o break age. Ele para o contador de forma a parar o codigo, ou seja, se o break for acionado no codigo o contador para de contar. No caso temos como parametro que o se o contador for igual a 3 ele para. e o System.out... esta para imprimir no terminal o resultado do for, quando, o for bate 3 ele nao imprime mais, pois, cai no break.

```java
public class ExemploBreakContinue {
    
    public static void main(String[] args) {

        // Exemplo Continue 
        for (int numeroContinue = 0; numeroContinue <= 5; numeroContinue++) {

            if(numeroContinue == 3){
                continue;
            }
            
            System.out.println("Número: " + numeroContinue);
        }
    }
}

``` 

No exemplo acima temos o uso do continue, que, basicamente funciona como um filtro. Como o proprio nome ja diz "continue", quando o contador bater 3 ou se igualar a 3, o if aciona o continue, com isso, temos que o codigo nao imprime o numero 3 mas continua o contador ate igualar a 5, que, diferentemente do break onde pararia o codigo que aqui e um contador po inteiro, o continue apenas nao imprime o numero ao qual ele foi acionado. Portanto funciona como se fosse um filtro.

## While

O while que, se traduzido literalmente para o portugues, e "enquanto". O While faz parte da sintaxe do java, que funciona da seguinte forma. O while tem um parametro booleano, caso seja true o bloco de codigo pertencente ao while sera executado ate codigo resultar falso. Portanto o while se difere do do for no sentido de, que, a condicao precisa ser previamente estipulada, pois, o parametro acita apenas o booleano.

Veja neste exemplo o uso do while, <span style="background-color: lightblue">Este codigo esta no arquivo "ExemploWhile.java"</span>:

```java

public class ExemploWhile {
    
    public static void main(String[] args) {
        
         int numeroTeste = 50;

         while (numeroTeste > 0) {
             int numeroDecrescente = 10;
 
             System.out.println("O numero foi testado e o valor e de " + numeroTeste);
             numeroTeste = numeroTeste - numeroDecrescente;
         }
         System.out.println("O resultado final foi " + numeroTeste + ". Para o valor ser declarado falso");
    }
}

```

Neste exemplo vemos como o while funciona. Basicamente este laco de repeticao, valida o parametro, caso seja falso ele para de executar o codigo, caso seja veradeiro ele continua ate resultar falso. Portanto o while so vai para de excutar o codigo caso `numeroTeste = numeroTeste - numeroDescrescente` se da ao ponto do parametro do while resultar falso, como, o parametro esta definido `(numeroTeste > 0)`, somente resultara falso caso `numeroTeste` seja 0, pois, sera nem igual nem menor que o 0 definido no parametro. Isto faz com que o while funcione.

### Do-While 

Traduzindo literalmente para o portugues este conceito signifaca (faca, enquanto). A diferenciacao do while para o do-while, se da, no fator icializacao, enquanto o while precisa validar o parametro como true para continuar assim a executar o bloco de codigo, porem, com o do-while nao sera nescessario esta validacao para o inicio da execucao do bloco de codigo. Portanto, se queremos que o codigo execute como falso se validde como true dentro da estrutura do-while, depois, assume-se falso e codigo para de executar. No while isto seria impossivel, mas, o do-while permite. 

<span style="background-color: lightblue">Este codigo esta no arquivo "ExemploDoWhile.java"</span>:

```java

import java.util.Random;

public class ExemploDoWhile {
    
    public static void main(String[] args) {

        System.out.println("Discando... ");

        do {
            
            System.out.println("Telefone Tocando");
        }
        
        while (tocando());

        System.out.println("Alo!!!!");
        
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }
}

```

> O codigo acima representa a funcao do Do-While. O trecho `private static boolean tocando()`, nao faz parte do Do-While.

O que o codigo e basicamente, validar o parametro do while, mas, enquanto este codigo nao e validado, o Do faz sua parte. O `do` faz com que o codigo seja excudatado uma vez antes de validar o parametro do while. O parametro `tocando()` foi definido logo abaixo. Entao o parametro e validadado depois do codigo ser executado pelo `do`, entao, o codigo `tocando()` sortea dentre 3 numeros, se bater 1 se iguala ao estipulado e valida como true, dando entao o **Alo!!!!** dentro do while. Caso o sorteamento seja falso o do e repetido de novo, fazendo assim o codigo gerar **Telefone Tocando** novamente. caso fosse com o while somente seria impossivel, pois, o codigo inicialmente pode validar como falso, com isso, o while encerra suas acoes, porem, o Do pode ser executado(repetido) sem se validadar como true ou false, fazendo, com o codigo mesmo dando false pelo `tocando()`, seja **REPETIDO**.

# FIM!

> Alguns termos e explicaoes podem estar erradas ou dificeis de entender. Este README.md foi feito com intencoes de promover o >MEU< entendimento do conteudo apresentado pelo curso em questao. Sendo o local onde >EU< organizo meus pensamentos.