import java.util.Random;
public class Exer5 {
    public static void main(String args[]) {
        int[] vetor = new int [10];
        int menor=0;
        int maior=0;

        Random nRandom = new Random();
            for( int x=0; x<vetor.length; x++ ){
                vetor[x] = nRandom.nextInt(50);
            }
             for( int y=0; y<vetor.length; y++ ){
                if(vetor[y]>maior){
                    maior=vetor[y];
                }
            }   
            for( int z=0; z<vetor.length; z++ ){
                    if(vetor[z]<menor){
                        maior=vetor[z];
                    }   
             }
                ("O menor numero dos vetores e= "+ menor);
             System.out.println("O maior numero dos vetores e= "+ maior);
 }           
}
