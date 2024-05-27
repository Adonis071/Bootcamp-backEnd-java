
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        while (true) {
            System.out.println("\nEscolha uma das operações");
            System.out.println("1- Para adição.");
            System.out.println("2- Para subtração.");
            System.out.println("3- Para Multiplicação.");
            System.out.println("4- Para Divisão.");
            System.out.println("5- Para Sair.");
            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Encerrando");
                break;
            }
            System.out.println("Digite o primeiro número ");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo numero");
            double num2 = scanner.nextDouble();

            double resultado;
            switch (opcao) {
                case 1:
                    resultado = adicao(num1, num2);
                    System.out.println("Resposta: " + resultado);
                    break;
                case 2:
                    resultado = subtracao(num1, num2);
                    System.out.println("Resposta: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacao(num1, num2);
                    System.out.println("Resposta: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = divisao(num1, num2);
                        System.out.println("Resposta: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida");
                    }

                    break;
                default:
                    System.out.println("Resposta: opção inválida. escolha 1, 2, 3, 4 ou 5");
                    break;

            }

        }

        scanner.close();
    }

    public static double adicao(Double a, Double b) {

        return a + b;

    }

    public static double subtracao(Double a, Double b) {
        return a - b;
    }

    public static double multiplicacao(Double a, Double b) {
        return a * b;
    }

    public static double divisao(Double a, Double b) {
        return a / b;
    }

}