import java.util.Scanner;

public class PatinhosForamPassear {

    public static void main(String[] args) {
        int cont = 1;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos patinhos vamos contar ");
        try{
        int nPatinhos = entrada.nextInt();

        for (int i = nPatinhos; i >= cont; i--) {
            System.out.println(i + " Patinhos foram passear");
            System.out.println("Além das montanhas para brincar");
            System.err.println("A mamãe gritou qua, qua, qua, qua");
            if (i > 1) {
                System.out.println("Mas só " + (i - 1) + " Patinhos voltaram de lá");
            } else {
                System.out.println("Más nenhum patinho voltou de lá.");
            }
        
        }
    }catch( java.util.InputMismatchException e){
        System.out.println("Erro: Digite um Número válido.");
    }
    }
}
