public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("A Tv está ligada? - " + smartTv.ligada);
        System.out.println("Qual volume Atual? - " + smartTv.volume);
        System.out.println("Qual Canal Atual? - " + smartTv.canal);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> TV ligada? - " + smartTv.ligada);
        System.out.println("Qual volume Atual? - " + smartTv.volume);
        System.out.println("Qual Canal Atual? - " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirVolume();
        smartTv.desligar();
        System.out.println("Qual volume Atual? - " + smartTv.volume);
        System.out.println("Qual Canal Atual? - " + smartTv.canal);
        System.out.println("Novo Status -> TV ligada? - " + smartTv.ligada);      
    }
}