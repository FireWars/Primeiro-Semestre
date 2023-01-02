import java.util.Scanner;
public class Exer3 {

  public static void main(String[] args) {
    int n1,ante,suce=0;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Informe o valor da mercadoria: ");
    n1= s.nextInt();
    ante=n1-1;
    suce=n1+1;
    System.out.println("O antecessor do numero "+n1+" e= "+ante);
    System.out.println("O sucessor do numero "+n1+" e= "+suce);
    
 }
}