public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Passa o parametro para quando o metodo for chamado nos definirmos qual parametro queremos
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Dimuindo o volume para: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Dimuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
