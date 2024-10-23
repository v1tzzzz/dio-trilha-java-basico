# Estruturas de Excecoes 

A execoes em java sao erros. No java um erro e tratado como algo que nao ha solucao, por exemplo, um crash ira travar a aplicacao e isto nao tem solucao.

> Solucao no sentido de continuar rodando o app no pc. Nao, que, nao haja como arrumar codificando ou programando.

## CONTEXTUALIZACAO SOBRE O `TRY` E `CATCH`.

Entao o java lanca execoes que sao erros de fluxo dentro da aplicacao. Vamos criar um cenario onde exista uma aplicacao em java e queremos adicionar um cliente no banco, para isso precisamos do CPF do cliente, caso nao tenhamos o CPF, para a aplicacao nao dar ERRO, criamos solucao previamente programadas como try/catch para caso nao exista CPF, tenhamos uma EXECAO.

Melhor exemplificando a execao e um erro, que os programadores ja visaram anteriormente e trataram da execao (erro). Como no cenario mencionado a execao pode ser selecionada como uma caixa de texto falando >CPF INVALIDO!<.

Para consertar estes problemas, podemos usar as funcoes `try` e `catch` no java. Onde o `try` funciona como um monitor para os posiveis erros. O `catch` funciona para caso o erro ocorra, a funcao do `catch` e pegar esta exececao e mandar o bloco de codigo para a execao caso ela ocorra. Entao assim podemos solucionar o erro

### USO DO TRY E CATCH

Para exemplificar com o codigo temos. <span background-color="lightyellow">O codigo esta no arquivo "AboutMe.java": </span>

```java

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try {
        // Criando o Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual seu sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura? ");
        double altura = scanner.nextDouble();

        // Impressao dos dados
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos de idade e altura precisam ser numericos!");
            System.out.println("Uso indevido da virgula!");
        }
    }
}

```

O codigo acima apresenta o uso do `try` e `catch`. Como podemos ver funcionam como deveriam, sendo que o `try` esta monitorando o codigo que esta dentro dele, o `catch` esta la para caso o erro aconteca mandar para o app o bloco de codigo dentro dele.


> ATENCAO! Caso algo esteja errado e por que iste e a >MINHA< percepcao sobre como funciona o `try` e o `catch` para suas respectivas funcoes.

## HIERARQUIA DAS EXECOES

A hierarquia de execoes e que no Java existem as formas de execoes sendo aquelas que nao tem uma solucao -> Um erro; E outras que disparam execoes como a que vimos no exemplo `try`-`catch` acima. A hierarquia das execoes e no java funciona da seguinte forma -> Uma execao faz parte de outra execao, que ja foi previamente programada na linguagem, quando, o java dispara a execao podemos lidar com ela. Entao funciona como se existisse um principal execao e outras execoes foram criandas ou extendidas a partir dela. Sendo uma das pricipais a `RuntimeExeption` e a `Exeption`.

Entao estas execoes tem niveis de tratamento sendo chamdas de **Checked** e **Unchecked Exeptions**. Estas execoes "checadas" e "nao checadas", sao execoes que quando disparada voce nescessariamente precisa trata-las.

Como podem ver no exemplo abaixo. <span background-color="lightyellow">O codigo esta no arquivo "AboutMe.java": </span>

```java

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExecao {
    
    public static void main(String[] args) {
        // Exemplo de execao 
        // Esta e uma execao checada
        // Nao prescisa ser tratada pelo dev 
        Number valor = Double.valueOf("a1.75");


        // Exemplo de execao
        // Esta e uma execao nao checada
        // prescisa ser tratada pelo dev. Por isso o try e catch
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

```

O que este codigo nos diz e que nao precisa tratar o erro quando **Checked** e precisa tratar o erro **Uchecked**. Por que o estas execose ja foram escritas previamente, portanto, o desenvolvedor que utilizar tal metodo nao precisa ou precisa tratar da execao caso esta `Exeption` nao foi checada previamente.


## Execoes Personalizadas

Como vimos anteriormente as execoes em java sao previamente escritas, porem, ha uma forma de criar nossas proprias execoes. Isso significa que basicamente podemos personalizar o possiveis erros para a nossa aplicacao.

Por exemplo se tiver que colocar um acento em uma palavra para ter esta palavra corretamente, como o java foi desenvolvidos por nao-falantes da lingua portuguesa temos que criar esta execao pois nao um problema de nao escreve portugues com os acentos corretamente.

Podemos disparar execoes caso o nosso app, tenha um uso indevido. Exemplo, se fizermos um leitor de CPF, cujo suas regras, precisamos verificar no nosso codigo se o input seguiu as regras do CPF (Como os 11 digitos), se nao, disparamos uma execao personalizada pois ela nao foi nao previamente desenvolvida.

Para seguirmos vamos criar um codigo com o CEP. <span background-color="lightyellow">O codigo esta no arquivo "CepInvalidoExeption.java": </span>

```java
public class CepInvalidoExeption extends Exception {
    
    public static void main(String[] args) {
         
    }
}


```

Para realizarmos o teste de criarmos uma execao no java, primeiramente precisamos criar uma classe (`class`) **CepInvalidoExeption** (pode ser qualquer nome, mas por motivos de facil releitura temos este). Onde esta `class` vai extender `Exception`, colocan na pratica o hierarquia das execoes.

Agora para a segunda parte do codigo onde vamos programar para criarmos um possivel problema com a validacao do **cep**. Criamos outro arquivo. <span background-color="lightyellow">O codigo esta no arquivo "FormatadorCepExemplo.java": </span>

```java

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        try {
        String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch(CepInvalidoExeption e) {
            System.out.println("Cep invalido: " + e.getMessage());
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeption {
        if(cep.length() != 8) 
            throw new CepInvalidoExeption();

            // simulando um cep formatado
            return "12.345-678";
    
    }
}

```
Este codigo utilizasse da classe que `extends` o **Exception**. Na primeira parte do codigo temos o `try`, `catch` e `formatarCep()` ambos estao na primeira parte pois fazem parte do input e output do app. O `formartarCep()` foi escrito fora do **main**, onde utiliza cria um novo metodo que dispara (`throws`) `CepInvalidoExeption` e cria a string cep, a string cep e validada como o metodo **length()** que SE diferente de 8 dispara novo execao que no caso e `CepInvalidoExeption` que criamos. A agora o catch pega a execao que dispara caso o `cep.lenght()` seja diferente de 8 que no exemplo e, logo, passamos como parametro para o `catch` e produz a linha que sai no console **Cep Invalido:**.

Vemos como o codigo funciona e colocamos na pratica a hierarquia do java neste exemplo. Pois este codigo valida entao o cep e caso seja diferente de 8 dispara uma execao.

Precisamos ter de criar um novo arquivo para extender o **Exception** do java.

> So nao entendi direito quando e, e quando nao e uma execao checada e nao checada.