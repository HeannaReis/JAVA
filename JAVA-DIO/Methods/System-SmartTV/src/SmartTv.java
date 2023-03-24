public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar(){
        System.out.println("Ligando TV");
        ligada=true;
    }
    
    public void desligar(){
        System.out.println("Desligando TV");
        ligada=false;
    }
    
    public void aumentarVolume() {
        System.out.println("Aumentando Volume");
        volume++;
    }
    
    public void diminuirVolume(){
        System.out.println("Diminuindo Volume");
        volume--;
    }
    
    public void aumentarCanal(){
        System.out.println("Aumentando Canal");
        canal++;
    }

    public void diminuirCanal(){
        System.out.println("Diminuindo Canal");
        canal--;
    }
}


