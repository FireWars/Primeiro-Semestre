import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
public class Exer3 {
    public static void main(String args[]) {
    int[] vetor = new int [6];
    int n1=0;
    int cont=0;

    Scanner sScanner = new Scanner(System.in);
    Random nRandom = new Random();

            for( int x=0; x<vetor.length; x++ ){
                vetor[x] = nRandom.nextInt(10);
                System.out.println(vetor[x]);
            }

            System.out.println("Informe o numero desejado: ");
            n1 = sScanner.nextInt();

             for( int y=0; y<vetor.length; y++ ){
                if(vetor[y]== n1){
                    System.out.println("Número encontrado na posição "+(y+1));
                    cont++;
                }
                }

                if(cont==0){
                  System.out.println("Este número não existe no vetor");
                }              
    }   
 }   
