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
