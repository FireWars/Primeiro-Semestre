package animalproject;
import java.util.Scanner;

public class Introducson {
    
    String nome;
    int Animal;
    Scanner scan = new Scanner (System.in);
    
  
    public void introducao(){
        System.out.println("AVISO\n\n\n\nNo jogo tera algumas pausas no texto e para continuar aperte enter para seguir com o texto.");
        scan.nextLine();
        System.out.println(
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("BEM VINDO A CIDADE DE DOWNSVILLE! ");
        System.out.println("Aqui, os moradores prezam muito pelo convívio com animais; todos amam e possuem um. ");
        System.out.println("Tudo parece traquilo, até que... ");
        
      
    }
    
    public void CriacaoPersonagem(){
        System.out.println("Opa, primeiro preciso saber como você quer ser chamado: ");
    }
    public void textoFinalA(){
        System.out.println("RESPOSTA ERRADA! ");
        System.out.println("SHARK: Errar na primeira pergunta é complicado, hem? ");
        System.out.println("SHARK: E uma pergunta fácil como essa... Desta forma, você já iniciou não conseguindo nada.");
        System.out.println("----FINAL A ----");
        System.out.println("estud[A]r mais");
    }    
    
    public void textoFinalC(){  
        System.out.println("BANDIDOS: Somente isso não é o suficiente. NÓS QUEREMOS MAIS. MUITO MAIS! ");
        System.out.println(nome + ": Fiz tudo que eu poderia. Como poderei arrumar mais?! ");
        System.out.println("BANDIDOS: Não queremos saber. Diga 'adeus' ao seu animal. ");
        System.out.println("------FIM DA LIGAÇÃO-----");
        scan.nextLine();
        System.out.println("Depois deste acontecimentos," + nome + " entrou em uma depressao profunda, sem saber o que fazer. ");
        System.out.println("Tinha um boa quantia, mas, ainda estava sem seu animalzinho. Depois disso nunca mais ouviu-se falar de " + nome);
        System.out.println("Populares do bairro RochDawle acreditam foi morar no mato. ");
        scan.nextLine();
    }
    
    public void textoFinalE(){
        System.out.println("SHARK: Esse animal tem poderes místicos. Acreditamos que ele possa resolver coisas inimagináveis. ");
        System.out.println("SHARK: Desta forma, decidi roubá-lo e lhe chamar para participar do programa como forma de pretesto. ");
        System.out.println("SHARK: Mas, não era para você ter chegado ao final. ");
        System.out.println("SHARK: A minha intenção era lucrar com o seu sofrimento. ");
        System.out.println("SHARK: Pesar de ter conseguido chegar até o final, eu não o deixarei sair vivo daqui. Hahaha ");
        System.out.println("No mesmo instante, um estrondo surge nos fundos do Studio: ");
        scan.nextLine();
        switch(Animal){
            case 1: 
                System.out.println("AU! AU! ");
            break;
            case 2:
                System.out.println("MEOW! MEOW! ");
            break; 
            case 3:
                 System.out.println("GLUP! GLUP! ");
            break;
            case 4:
                 System.out.println("SH! SH! ");
            break;
            case 5:
                 System.out.println("CRA! CRA! ");
            break;
            case 6:
                 System.out.println("BOOM! BOOM! ");
            break;
        }  
        System.out.println("CHEFEEEEE, o animal escapou! ");
    }
  
    public void Animal(){
        System.out.println("Por favor, escolha qual será seu companheiro: ");
        System.out.println("1- CACHORRO ");
        System.out.println("2- GATO ");
        System.out.println("3- PEIXE ");
        System.out.println("4- COBRA ");
        System.out.println("5- CALOPSITA ");
        System.out.println("6- ARANHA ");
        Animal = scan.nextInt();
        
        switch(Animal){
            case 1: 
                System.out.println("AU! AU! (ME DÊ UM NOME)");
            break;
            case 2:
                System.out.println("MEOW! MEOW! (ME DÊ UM NOME)");
            break; 
            case 3:
                 System.out.println("GLUP! GLUP! (ME DÊ UM NOME)");
            break;
            case 4:
                 System.out.println("SH! SH! (ME DÊ UM NOME)");
            break;
            case 5:
                 System.out.println("CRA! CRA! (ME DÊ UM NOME)");
            break;
            case 6:
                 System.out.println("BOOM! BOOM! (ME DÊ UM NOME)");
            break;
        }       
    }
    
    public void AnimalDica(){     
        switch(Animal){
            case 1:
                System.out.println("AU! AU! (Você precisa de mim, mas minhas forças estão acabando. Use as dicas com sabedoria.)");
                break;
            case 2:
                System.out.println("MEOW! MEOW! (Você precisa de mim, mas minhas forças estão acabando. Use as dicas com sabedoria.)");
            break;
            case 3:
                System.out.println("GLUP! GLUP! (Você precisa de mim, mas minhas forças estão acabando. Use as dicas com sabedoria.)");
            break;
            case 4:
                System.out.println("SH! SH! (Você precisa de mim, mas minhas forças estão acabando. Use as dicas com sabedoria.)");
            break;
            case 5:
                System.out.println("CRA! CRA! (Você precisa de mim, mas minhas forças estão acabando. Use as dicas com sabedoria.)");
            break;
            case 6:
                System.out.println("BOOM! BOOM! (Você precisa de mim, mas minhas forças estão acabando. Use as dicas com sabedoria.)");
            break;
        }
    }
    public void AnimalEsgotado(){
        switch(Animal){
            case 1: 
                System.out.println("AU! AU! (Minhas forças acabaram.)");
            break;
            case 2:
                System.out.println("MEOW! MEOW! (Minhas forças acabaram.)");
            break; 
            case 3:
                 System.out.println("GLUP! GLUP! (Minhas forças acabaram.)");
            break;
            case 4:
                 System.out.println("SH! SH! (Minhas forças acabaram.)");
            break;
            case 5:
                 System.out.println("CRA! CRA! (Minhas forças acabaram.)");
            break;
            case 6:
                 System.out.println("BOOM! BOOM! (Minhas forças acabaram.)");
            break;
        }
    }  
    public void AnimalVinganca(){
        switch(Animal){
            case 1: 
                System.out.println("AU! AU! (Esse Skark terá o que merece!)");
            break;
            case 2:
                System.out.println("MEOW! MEOW! (Esse Skark terá o que merece!)");
            break; 
            case 3:
                 System.out.println("GLUP! GLUP! (Esse Skark terá o que merece!)");
            break;
            case 4:
                 System.out.println("SH! SH! (Esse Skark terá o que merece!)");
            break;
            case 5:
                 System.out.println("CRA! CRA! (Esse Skark terá o que merece!)");
            break;
            case 6:
                 System.out.println("BOOM! BOOM! (Esse Skark terá o que merece!)");
            break;
        }
    }
    public void AnimalErrou(){
        switch(Animal){
            case 1: 
                System.out.println("AU! AU! (Tente novamente e não desista!)");
            break;
            case 2:
                System.out.println("MEOW! MEOW! (Tente novamente e não desista!)");
            break; 
            case 3:
                 System.out.println("GLUP! GLUP! (Tente novamente e não desista!)");
            break;
            case 4:
                 System.out.println("SH! SH! (Tente novamente e não desista!)");
            break;
            case 5:
                 System.out.println("CRA! CRA! (Tente novamente e não desista!)");
            break;
            case 6:
                 System.out.println("BOOM! BOOM! (Tente novamente e não desista!)");
            break;
        }
    }
}
