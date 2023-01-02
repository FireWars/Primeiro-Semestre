import java.util.Random;
public class Exer4 {
    public static void main(String args[]) {
        int[] vetor1 = new int [20];
        int[] vetor2 = new int [20];
        int[] numigual = new int[20];
        int cont=0;

        Random nRandom = new Random();
            for( int x=0; x<vetor1.length; x++ ){
                vetor1[x] = nRandom.nextInt(1000);
                vetor2[x] = nRandom.nextInt(1000);
            }
            for (int x = 0; x < vetor1.length; x++) {
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[x] == vetor2[j]) {
                        numigual[cont] = vetor1[x];
                        cont++;
                    }
            }
        }
        System.out.print("Vetor 1 = [ ");
            for (int num : vetor1) {
                System.out.print(num + ", ");
              }
              System.out.print(" ]\n\n");


              System.out.print("Vetor 2 = [ ");

              for (int num : vetor2) {
                  System.out.print(num + ", ");
                }
                System.out.print("]");

            if(cont>0){
                System.out.print("\n\nNúmeros iguais encontrados: ");  
            }      
            for( int x=0; x<numigual.length; x++ ){
                if(numigual[x] != 0){
                    System.out.print(numigual[x] + ", ");
                }
            }
            if(cont==0){
                System.out.println( "\n\nNenhum número repetido");
            }     
 }           
}