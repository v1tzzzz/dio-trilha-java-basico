public class SistemaMedida {

    public static void main(String[] args) {
    
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
    }      
}
