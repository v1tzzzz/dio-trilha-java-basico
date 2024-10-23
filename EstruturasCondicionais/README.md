# Estruturas de Controle de Fluxo em java

Para um programa funcionar como o programador deseja e utilizado o controle de fluxo, onde ele funciona realizando instrucoes especiais, seja, chamando comandos, bloqueando acoes, disparando execoes ou repetindo uma instrucao. Isto pode ocorrer seletivamente, repetivamente ou excepcionalmente. 
O controle de fluxo deve sempre retornar um booleano, ou seja, true ou false. Isso acontece pois o operadores de comparacao sao usados como parametros para as condicoes estabelecidas.


## Condicionais Simples 

Sao condicoes positivas (true), para validacoes de excecucao de fluxo. A representacoes em codigo esta no arquivo "CaixaEletronico.java"

```java
public class CaixaEletronico {
    
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            
        System.out.println(saldo);
        }
    }
}

```

**Este bloco de codigo codigo indica uma condicional simples.**, vemos que o codigo basicamente controla o fluxo da aplicacao onde o saldo so e calculado caso o "valorSolicitado" seja menor que ele, se nao, a aplicacao ignora o "valorSolicitado".

## Condicional Composta 

A estrutura condicional composta e basicamente uma condicional com mais de um fluxo possivel, ou seja, caso o parametro nao seja respeitado teremos outro "caminho" para o nosso codigo percorrer. O codigo esta no arquivo "ResultadoEscolar.java"

```java
public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}


```

Perceba que neste caso temos o **else**, que indica caso o parametro nao seja validado como true, o fluxo do codigo. Logo se a nota for maior ou igual ao 7 voce sera "Aprovado", caso nao (else) voce sera "Reprovado".


## Condicionais Encadeadas

Este modelo de condicional adiciona ainda mais "caminhos" para o codigo, basta adicionar o else if. Isto demonstra ao java que queremos outro parametro para continuar a escalar(aumentar o tamanho) do codigo. O arquivo do codigo se encontra em "ResultadoEscolar.java".

```java
 nota = 6;
        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
```
Neste trecho de codigo temos a seguinte linha: else if (nota >= 5 && nota < 7){}. Nesta linha vemos o uso do "else if" e a definicao de uma condicao como parametro para o codigo. Neste caso a nota 6 encaixa na condicao else if, logo ela ativa a "Recuperacao".

### Condicao Ternaria 
O operador ternario tambem pode ser usado como condicional, uma vertente do if e else.

```java
nota = 8;
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
```

Este trecho de codigo e uma condicional simples mas utilizando o operador ternario. Mas tambem funciona como condicional composta ou encadeada. veja o exemplo:

```java
        int nota = 6;
        String resultado = (nota >= 7) ? "Aprovado" : (nota >= 5 && nota < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
```
Vemos o codigo do "Concicional Encadeada" porem utilizando o operador ternario.


## Condicional Switch e Case

A estrutura switch compara o valor de cada caso com a da variavel definida. Isso significa que o switch ele le a variavel, procura um caso(case) igual, se ele achar um case igual a varivel ele executa o codigo que o (case) chama. Para evitar que o switch continue executando mesmo depois de encontrar a varialvel e case corretos utilizamos o (break) ao final de cada bloco de codigo, onde o break manda o java para de executar o codigo ao qual ele faz parte. O exemplo esta no arquivo SistemaMedida.java

```java
 // Controle de fluxo com switch-case
        String sigla = "A";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
        }
```
A diferenca entre estes dois codigos se encontra na sintaxe e no modelo de operacao com o controlador "if" e o controlador "switch-case". Ambos os modelos funcionam da mesma forma.

```java
 // Controle de fluxo com if-else
        sigla = "G";
        if (sigla.equals("P")) {
            System.out.println("Pequeno");
        } else if (sigla.equals("M")) {
            System.out.println("Medio");
        } else if (sigla.equals("G")) {
            System.out.println("Grande");
        } else {
            System.out.println("Indefinido");
        }
```
Outro modelo que se encontra em "PlanoOperadora.java", seria um uso do switch case, onde demonstra uma usabilidade mais apropriada.

```java
public class PlanoOperadora {
    
    public static void main(String[] args) {
        
        // Projeto em Switch Case - Plano Operadora
        // Demonstra um uso para o Switch Case
        String plano = "M"; // M / T / I

        switch (plano) {
            case "T":{
                System.out.println("Internet boa");
            }
            case "I":{
                System.out.println("Internet em Dobro");
            }
            case "M":{
                System.out.println("100 Minutos de ligacao");
            }
            default:
                System.out.println("Nenhum plano definido");
       }
    }
}

```

Este trecho de codigo demonstra o uso do switch-case, para a capacidade de adicionar algo sem ter que repetir o mesmo codigo varias vezes, pois neste caso a falta dos breaks fazem com que o codigo continue rodando e trazendo o codigo do case inferior assim adicionando ao executar o codigo


