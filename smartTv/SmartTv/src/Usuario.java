public class Usuario {
    
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Novo Status: Tv ligada? " + smartTv.ligada); 
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.mudarCanal(12);
        System.out.println("Novo canal:" + smartTv.canal);
              
    }
}