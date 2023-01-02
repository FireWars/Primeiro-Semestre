import java.util.Scanner;
public class Exer2 {

  public static void main(String[] args) {
    double carro1=100000, carro2=150000,parcela,entrada=0;
    int selecionador=0;
    
    Scanner s = new Scanner(System.in);
      System.out.println("Informe o carro que deseja comprar:\nCarro 1 digite 1\nCarro 2 digite 2");
      selecionador= s.nextInt();
      
    if(selecionador>=1){
     entrada=((carro1*40)/100);
     carro1=carro1-entrada;
     parcela=carro1/12;
     System.out.println("O valor da entrada sera de= "+entrada+"\nO valor restante e de "+carro1+"\nE sera parcelado em 12x de "+parcela);  
    }
    else if(selecionador>=2){
     entrada=((carro2*40)/100);
     carro2=carro2-entrada;
     parcela=carro2/12;
     System.out.println("O valor da entrada sera de= "+entrada+"\nO valor restante e de "+carro2+"\nE sera parcelado em 12x de "+parcela);
    } 

 }
}