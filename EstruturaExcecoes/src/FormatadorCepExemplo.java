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
