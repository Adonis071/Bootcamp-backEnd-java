import java.util.Scanner;

class ParametroInvalidosException extends Exception {

    public ParametroInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número. ");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o SEgundo número. ");
        int numeroDois = terminal.nextInt();

        try {
            meuContador(numeroUm, numeroDois);
        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void meuContador(int num1, int num2) throws ParametroInvalidosException {
        if (num1 > num2) {
            throw new ParametroInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");

        }
        int cont = num2 - num1;


        for (int i = 0; i < cont; i++) {
            System.out.println("Imrimindo o número " + i);
        }
    }
}
