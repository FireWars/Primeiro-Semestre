import java.util.Scanner;
public class Exer1 {

  public static void main(String[] args) {
    double saldo=0;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Informe o valor do saldo atual");
       saldo= s.nextDouble();
       saldo = ((saldo*5)/100) + saldo;
    
     System.out.println("O saldo foi reajustado!"+"\nSaldo atual= "+saldo);
 }
}