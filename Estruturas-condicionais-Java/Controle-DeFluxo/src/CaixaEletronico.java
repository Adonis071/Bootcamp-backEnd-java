public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Double saldo = 500.9;
        Double valor = 90.9;

        if (saldo > valor) {
            saldo = valor - saldo;
             System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println(saldo);
        }

    }
}
