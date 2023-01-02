import java.util.Scanner;
public class Exer3 {

  public static void main(String[] args) {
    float saldo = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Informe o saldo da conta para efetuar o saque: ");
    saldo = s.nextFloat();
    if (saldo>=20){
     saldo= saldo-20;
     System.out.println("Saque efetuado");
    }
    else if (saldo<20){
      System.out.println("Saldo Insuficiente!");
    }
    
    

 }
}