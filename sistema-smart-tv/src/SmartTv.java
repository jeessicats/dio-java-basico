public class SmartTv {

    boolean ligada = false; /*Atributo a nível de classe */
    int canal = 1; /*Atributo a nível de classe */
    int volume = 25; /*Atributo a nível de classe */

    public void mudarCanal(int novoCanal){
        canal = novoCanal; /* novoCanal pertence ao método mudarCanal */
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void aumentarVolume(){
        volume++; /* Mesma coisa que volume + 1. */ 
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--; /* Mesma coisa que volume - 1. */ 
        System.out.println("Diminuindo o volume para: " + volume);

    }

    public void ligar() {
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }
}
