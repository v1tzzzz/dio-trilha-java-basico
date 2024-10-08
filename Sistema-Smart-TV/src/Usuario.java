public class Usuario {

    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("A Tv esta ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Agora a esta ligada? " + smartTv.ligada);

        smartTv.mudarCanal(12);
        System.out.println("Mudei o canal para: " + smartTv.canal);
    }
}