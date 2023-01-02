public class Exer6 {
    public static void main(String args[]) {
        int vetor[]={0,1,0,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1};
        int[] vetorcorreto = new int [vetor.length];
        int cont=0;

            for(int x=0; x<vetor.length; x++){
                if(vetor[x]==0){
                    vetorcorreto[cont]=vetor[x];
                    cont++;
                }
            }   
            for(int y=0; y<vetor.length; y++){    
              if(vetor[y]==1){
                vetorcorreto[cont]=vetor[y];
                cont++;
               }
            }  
            System.out.print("[ ");
            for (int num : vetorcorreto) {
                System.out.print(num + ", ");
              }
              System.out.print("]");  
 }    
}
