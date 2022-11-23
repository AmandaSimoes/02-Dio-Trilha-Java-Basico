public class usuario {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();

        smartTv.aumentarCanal();
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV ligada: "+ smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        

        smartTv.ligar ();
        System.out.println("TV ligada: "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada: " + smartTv.ligada);
    }
    
}
