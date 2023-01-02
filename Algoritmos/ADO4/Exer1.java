
import java.util.Scanner;

public class Exer1 {

  public static void main(String args[]) {
    Scanner sScanner = new Scanner(System.in);
    float[] n = new float [8];
    float media=0;

     for( int x=0; x<n.length; x++ ){

        System.out.println("Digite o "+(x+1)+"º numero:");
         n[x] = sScanner.nextFloat();
        media=media+n[x];
     }
     System.out.println("Media dos numeros é= "+(media/n.length));
  


     
    }
}