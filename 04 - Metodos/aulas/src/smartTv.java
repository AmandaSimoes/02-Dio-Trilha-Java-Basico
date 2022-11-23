public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Mudou o canal para: " + novoCanal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentou canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuiu canal para: " + canal);
    }

    public void aumentarVolume () {
        volume++;
        System.out.println("Aumentou o volume para: " + volume);
    }

    public void diminuirVolume () {
        System.out.println("Diminuiu o volume para: " + volume);
        volume--;
    }

    public void ligar(){
        ligada = true;
        
    }

    public void desligar () {
        ligada = false;
    }

       
    }

