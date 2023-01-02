import java.util.Scanner;
public class Exer5 {

  public static void main(String[] args) {
    float salario_V, valor_total=0;
    String nome_ven;
    
    Scanner s = new Scanner(System.in);
      System.out.println("Informe o nome do vendedor");
      nome_ven= s.nextLine();
      System.out.println("Informe o salario fixo do vendedor: ");
      salario_V= s.nextFloat();
      System.out.println("Informe o valor total de vendas realizado no mes: ");
      valor_total= s.nextFloat();
      
      valor_total=(valor_total*5)/100;
      salario_V=salario_V+valor_total;
      
     System.out.println("Nome= "+nome_ven+"\nO salario final do vendedor e= "+salario_V);
     

 }
}