public class Usuario
 {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada: "+smartTv.ligada);
        System.out.println("Volume: "+smartTv.volume);
        System.out.println("Canal: "+smartTv.canal);
        smartTv.desligarTv();
        smartTv.ligarTv();
       smartTv.aumentadoCanal();
       smartTv.novoCanal(67);
    }
}
