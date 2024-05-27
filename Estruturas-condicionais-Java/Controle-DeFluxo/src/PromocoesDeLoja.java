public class PromocoesDeLoja {
    public static void main(String[] args) {
        String promo = "s";
        double valor = 50;

        // Os valore referentes ao plano serão agregados de baixo para cima, caso a escolha não estaja em nenhuma letra
        // do case ele emitira aoenas uma mensagem 
        switch (promo) {
            case "s":
                valor = valor + 20;
                System.out.println("Redes sociais ilimitada. + 20,00 ");
            case "m":
                valor = valor + 10;
                System.out.println("Whatsapp ilimitao + 10,00 ");
            case "b":
                System.out.println("10G de internet. por 50,00");
                break;
            default:
                System.out.println("Você não escolheu nenhum plano.");
                break;
        }
        System.out.println("No valor de: "+valor+" Reais.");
    }
}