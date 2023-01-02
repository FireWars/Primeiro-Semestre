import java.util.Scanner;
public class Exer5 {

  public static void main(String[] args) {
    float valormer, valorca, troco=0;
    
    Scanner s = new Scanner(System.in);
      System.out.println("Informe o valor da mercadoria: ");
      valormer= s.nextFloat();
      System.out.println("Informe o valor do pagamento da mercadoria: ");
      valorca= s.nextFloat();
     troco=valorca-valormer;
     
    if (valormer<=valorca){
     System.out.println("Seu troco é= R$ "+troco+"\nObrigado pela preferência, volte sempre!");
    }
    else if(valormer>valorca){
        System.out.println("Valor insuficiente para pagar a compra");
    }
 }
}