import java.util.Scanner;
import java.util.Locale;
public class InformacoesPessoais
 {
   public static void main(String [] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Insira Seu nome");
    String nome = scanner.next();

    System.out.println("Insira se sobrenome: ");
    String sobrenome = scanner.next();

    System.out.println("Insira sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Nome: "+ nome);
    System.out.println("Sobrenone: "+ sobrenome);
    System.out.println("Idade :"+ idade);
   }
}
