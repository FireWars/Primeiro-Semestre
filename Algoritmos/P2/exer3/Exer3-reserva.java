import java.util.Scanner;
public class Exer3 {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);    
    int D=0,encerrar=0,car=0,mach=0;
    boolean encer=true;

        while(encer==true){
        System.out.println("------------------------------------\nEstado atual do carro: Desligado\n------------------------------------\n");
        System.out.println("Ligar o carro - Digite 1\nEncerrar o Programa - Digite 0\n------------------------------------\n");
        car= s.nextInt();
        if(car==0){
            encer=false;
        }
        D=0;
        while(car==1){
            D=0;
            System.out.println("------------------------------------\nBem vindo ao simulador da Autoescola\nSe Acalma que eu estou Aprendendo\n------------------------------------\n");
            System.out.println("------------------------------------\nEstado atual do carro: Ligado\n------------------------------------\n");
            System.out.println("O carro está parado\n------------------------------------\n");
            System.out.println("1) Desligar o carro\n2) Andar\n3) Engatar a ré\n------------------------------------\n");
            car= s.nextInt();
            if(car==1){
                car=0;
            }
            if(car==2){
                 D++;
            }
         }
        while(car==2){
            if(car==3){
                System.out.println("Estado atual do carro: Ligado\n------------------------------------\n");
            System.out.println("O carro está andando na marcha Ré\n------------------------------------\n");
            System.out.println("2) Parar o carro\n------------------------------------\n");
            mach= s.nextInt();
             
            }
            if(D<8){
                System.out.println("Estado atual do carro: Ligado\n------------------------------------\n");
                System.out.println("O carro está andando na marcha "+D+"\n------------------------------------\n");
                System.out.println("2) Parar o carro\n3) Subir Marcha\n4) Descer Marcha\n------------------------------------\n");
                mach= s.nextInt();
                
            }
 
            if(D==8){
                System.out.println("Estado atual do carro: Ligado\n------------------------------------\n");
                System.out.println("O carro está andando na marcha 8\n------------------------------------\n");
                System.out.println("2) Parar o carro\n4) Descer Marcha\n------------------------------------\n");
                mach= s.nextInt();
                switch(mach){
                    case 3:
                    System.out.println("Estado atual do carro: Ligado\n------------------------------------\n");
                    System.out.println("O carro está andando na marcha 8 \n------------------------------------\n");
                    System.out.println("2) Parar o carro\n4) Descer Marcha\n------------------------------------\n");   
                    mach= s.nextInt();
                    if(mach==2){
                     car=1;   
                    }
                    break;
                }
            }
            if(mach==2){
                car=1;
            }
            if(mach==3){
                D++;
            }
            if(mach==4){
                D--;
            }
        }
        while(car==3){
            D=0;
            System.out.println("Estado atual do carro: Ligado\n------------------------------------\n");
            System.out.println("O carro está andando na marcha Ré\n------------------------------------\n");
            System.out.println("2) Parar o carro\n------------------------------------\n");
            mach= s.nextInt();
            if(mach==2){
                car=1;
            }
         }   
        }
        }



     }