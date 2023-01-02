import java.util.Scanner;
public class Exer6 {

  public static void main(String[] args) {
    int dia_ano=365;
    int dia_mes=30;
    int dia, ano, mes, total_dias=0;
    Scanner s = new Scanner(System.in);
       System.out.println("Informe a sua idade. ");
       System.out.println("Quantos Anos? ");
       ano= s.nextInt();
       System.out.println("Quantos meses? ");
       mes= s.nextInt();
       System.out.println("Quantos dias? ");
       dia= s.nextInt();
    total_dias= (ano*dia_ano) + (mes*dia_mes);
    
     System.out.println("Você já viveu "+total_dias+" dias");
 }
}