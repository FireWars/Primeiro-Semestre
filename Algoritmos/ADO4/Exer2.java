import java.util.Scanner;
public class Exer2 {
    public static void main(String args[]) {
    Scanner sScanner = new Scanner(System.in);
    float[] n = new float [10];
    
         for( int x=0; x<n.length; x++ ){
    
            System.out.println("Digite o "+(x+1)+"º numero:");
             n[x] = sScanner.nextFloat();
           
         }
         for(int y=0; y<n.length; y++){
            if(n[y] % 2 == 0){
                System.out.println("O numero "+n[y]+" do índice "+(y+1)+ " é par");   
            }

         } 
 }       
}
