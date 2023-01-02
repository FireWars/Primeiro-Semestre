import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		int raiva=100,verme1=100,verme2=100,gripe=100;
		int vacina=0,contT=0,cont1=0,cont2=0,cont3=0,cont4=0;
		Scanner s = new Scanner(System.in);

		while(vacina!=5){
		System.out.println("Escolha uma das vacinas disponiveis:\n"+"Vacina contra raiva-Digite 1\nVerme tipo 1-Digite 2\nVerme tipo 2-Digite 3\nGripe-Digite 4\nDigite-5 para finalizar o dia\n");
		vacina=s.nextInt();
		switch(vacina){
			case 1 :
			if(raiva>10){
				raiva--;
				System.out.println("Retire seu comprovante de vacinação contra raiva, Obrigado!");
				contT++;
				
			}
			else if(raiva<=10){
				System.out.println( raiva+" doses restante, solicite a compra de mais "+(100-raiva)+" doses\n");
				
				System.out.println("Retire seu comprovante de vacinação contra raiva, Obrigado!");
				raiva--;
				contT++;
			}
			cont1++;
			break;
			case 2 :
			if(verme1>10){
				verme1--;
				System.out.println("Retire seu comprovante de vacinação contra Verme tipo 1, Obrigado!");
				contT++;
			}
			else if(verme1<=10){
				System.out.println( verme1+" doses restante, solicite a compra de mais "+(100-verme1)+"doses\n");
				
				System.out.println("Retire seu comprovante de vacinação contra Verme tipo 1, Obrigado!");
				contT++;
				verme1--;
			}
			cont2++;
			break;
			case 3 :
			if(verme2>10){
				verme2--;
				System.out.println("Retire seu comprovante de vacinação contra Verme tipo 2, Obrigado!");
				contT++;
			}
			else if(verme2<=10){
				System.out.println( verme2+" doses restante, solicite a compra de mais "+(100-verme2) + "doses\n");
				
				System.out.println("Retire seu comprovante de vacinação contra Verme tipo 2, Obrigado!");
				verme2--;
				contT++;
			}
			cont3++;
			break;
			case 4 :
			if(gripe>10){
				gripe--;
				System.out.println("Retire seu comprovante de vacinação contra Gripe, Obrigado!");
				contT++;
			}
			else if(gripe<=10){
				System.out.println( gripe + " doses restante, solicite a compra de mais "+(100-gripe)+" doses\n");
				System.out.println("Retire seu comprovante de vacinação contra Gripe, Obrigado!");
				gripe--;
				contT++;
			}
			cont4++;
			break;
		}
	
	}
		System.out.println("Total geral de doses aplicadas= "+contT);
		System.out.println("Total de doses que foram aplicadas de cada vacina por dia\nRaiva= "+cont1+"\nVerme tipo 1= "+cont2);
		System.out.println("\nVerme tipo 2= "+cont3+"\nGripe= "+cont4);
		System.out.println("\nTotal de doses que ainda restam de cada vacina\nRaiva= "+raiva+"\nVerme tipo 1= "+verme1);
		System.out.println("\nVerme tipo 2= "+verme2+"\nGripe= "+gripe);
	}
}