
import java.util.Scanner;
public class Exer03 {
    int parar=1;
    Scanner s = new Scanner(System.in);
    public void r(){
        while(parar!=1){
            System.out.println("Estado atual do carro: Ligado\n------------------------------------\n");
            System.out.println("O carro está andando na marcha Ré\n------------------------------------\n");
            System.out.println("2) Parar o carro\n------------------------------------\n");
            parar= s.nextInt();

         }

        
    }
}
