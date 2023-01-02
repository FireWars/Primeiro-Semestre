import java.util.Scanner;
public class Exer1 {

  public static void main(String[] args) {
    float l, c, m2 = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Informe a Largura: ");
    l = s.nextFloat();
    System.out.println("Informe o comprimento: ");
    c = s.nextFloat();
    m2= l*c;
    System.out.println("A area util desse comodo e= "+m2+" M²");

 }
}