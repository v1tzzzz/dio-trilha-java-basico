public class Metodos {
    public static void main(String[] args) {
        // O que sao os metodos, metodos sao as funcoes ou sub-rotinas 
        // Por boas praticas no codigo e recomendavel usar camelCase nos metedos sendo nomeados por verbos
        // No java nao existe metodos globais ou seja todos os metodos devem ser definidos dentro de uma classe
        // Para melhor entendimento do codigo e para o programador quanto mais se perguntar:
        // Qual a proposta do metodo? e Qual o tipo de retorno esperado apos executar o metodo?
        // Caso o metodo nao retorne nenhum valor ele sera representado pela palavra-chave "void"
    }
    // Exemplo de metodos 
    public double somar(int num1, int num2) {    
    // LOGICA - CODIGO
    return somar(num1, num2);
    }

    // Outro exemplo de metodo em JAVA e o void onde nao precisa retornar algo

    public void imprimir(String texto) {
        // LOGICA - CODIGO
    }
    // Existe em java na forma de pensar as execoes que um fazer um metodo tem, como o fato de em uma divisao voce nao poder dividir por 0, pois na matematica isso e impossivel 
    // Par isso no Java utilizamos o throws Exception
    
    // Para fazer um metodo exclusivo para uma classe apenas precisamos usar o private ao inves do public ao criar o metodo 
    
    // Problemas estruturais com os metodos pode acontecer exemplo:
    public void retornarSoma(){}
    
    // Como pode ver o metodo tem como objetivo retornar uma soma, logo defirnir o metodo como void esta errado nao na sintaxe do java mas em boas praticas. Tornando em um erro "invisivel"

    // Um metodo deve ter apenas um responsabilidade, ou seja se o metodo tiver o nome de coletarImprimir(), tem um problema pois ou ele coleta ou ele imprimi logo o nome correto ficaria coletarImpressao(), pois nesse caso ele coleta apenas.

    // Algo haver com o a orientacao a objeto(POO) criar um metodo com varios parametros fica horrivel para escalabilidade, releitura e manutencao do codigo logo criar um objeto e colocar o objeto como parametro para o metodo e muito mais clean e efeciente 

}
