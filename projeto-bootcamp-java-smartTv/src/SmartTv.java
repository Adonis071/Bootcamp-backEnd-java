public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public void ligarTv() {
        ligada = true;
        System.out.println("Ligando");
    }

    public void desligarTv() {
        ligada = false;
        System.out.println("Desligando ");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume em: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume em: " + volume);
    }

    public void aumentadoCanal() {
        canal++;
        System.out.println("Aumentando canal: " + canal);
    }

    public void diminuindoCanal() {
        canal--;
        System.out.println("Diminuindo canal: " + canal);

    }

    public void novoCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal "+canal);
    }

}
