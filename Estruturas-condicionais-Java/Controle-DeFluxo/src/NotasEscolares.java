public class NotasEscolares{
    public static void main(String []args){
        double nota1 = 1;
          // Condicional operador ternário.
       String resultado = nota1 >= 7 ? "Aprovado" : nota1< 7 && nota1>=5 ? "REcuperação" : "reprovado";
             System.out.println(resultado);
    }
}