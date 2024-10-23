# Objetivo da Aula 
 Nao iremos utilizar a IDE para executar nosso codigo sempre, por via de que o cliente ou usuario tendo de instalar uma IDE apenas para que a aplicacao funcione. Com a JVM podemos transformar o codigo em um executavel para qualquer sistema operacional.
 Todo projeto JAVA tem uma pasta "bin" pois e nela que guardamos nosso Bytecode, arquivos compilados, nossas Classes enfim.
 

 ## Como utilizar o Terminal:
 - Primeiro utilize o comando "cd" para ir para a pasta onde estao os arquivos de codigo Ex: <b><cd Caminho/do/arquivo/de/codigo></b> depois de entrar na pasta do codigo, va para a pasta **bin**
 - Depois de entrar utilize o comando "java" e o nome da classe ou arquivo que deseja executar sem usar o .class, ou seja MinhaClass.class ou .java
 - Scanner: Para dimuir a quantidade de possiveis em passar argumentos pois se trata de um modelo detalhado, usamos o Scanner pois permite ao usuario uma interacao mais assertiva com o programa

### Scanner
Tem como objetivo passar o argumentos dentro do programa.
pode ser acessao importando com o comando "import java.util.Scanner;" e precisa ser defino com o comando "Scanner teclado = new Scanner(System.in)" isso permite que dentro do programa possamos utilizar o nosso teclado sem depender do terminal pra passar o argumentos.
O Scanner tambem precisa ser declarado no em baixo do System.out.println(); pois assim o codigo assimila que precisa de uma informacao do usuario para continuar sua declaracao pode ser feita assim "var nomeVariavel = -NomeDoScanner.RetornaValor();" logo em um codigo ele ficaria assim:

<span style="color: lightpink">import</span> java.util.<span style="color: blue">Scanner</span>;

 ## Terminal e Argumentos
    Explorar opcoes de entrada e saida simples de dados em uma aplicacao java

Para adicionar os dados que queremos para a aplicacao, percebemos entao que seria nescessario passar o **argumentos**, por exemplo:
    java Argumentos argumento1 argumento2
Separados por espacos os argumentos sao os dados que nos queremos inserir na aplicacao.

Dentro deste modelo de argumentos ha um modo de configurar argumentos padrao em .json basta ir "run" no VS Code clicar em "add configuration",procurar pelo nome do arquivo em "mainClass": "NomeDoArquivo" e adicionar ao arquivo java dentro do {} o "args": [] que sera outro arrey porem ali dentro voce passara o argumentos que quer deixar pre-setados com as "" e na ordem dos indices. dentro do arrey a virgula(,) funciona como espaco para o Terminal.
**O que sao**:
- Main Args 
- Scanners
