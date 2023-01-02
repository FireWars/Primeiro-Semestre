import java.util.Scanner;
public class Exer1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String nome;
    int id, filme = 0, cont = 0;
    int contS1 = 0, contS2 = 0, contS3 = 0, totalSala = 0;// quantidade de ingressos
    float caixaC = 0;// soma de venda dos ingressos

    System.out.println("Informe o seu nome ");
    nome = s.nextLine();
    System.out.println("Informe o seu ID\n");
    id = s.nextInt();

    while (filme != 4) {

      System.out.println("Escolha o filme queira assistir:" + "\n \n Vingadores Ultimato - Digite 1");
      System.out.println(
          "Minha mãe é uma Peça - Digite 2" + "\n Carga Explosiva - Digite 3" + "\nEncerrar o programa - Digite 4");
      filme = s.nextInt();
      switch (filme) {

        case 1 -> {
          if (contS1 < 5) {
            contS1++;
            System.out.println("Total de lugares restantes= " + (5 - contS1));
            caixaC += 42;
          } else
            System.out.println("Sala 1 está lotada");
          break;
        }
        case 2 -> {
          if (contS1 < 3) {
            contS2++;
            System.out.println("Total de lugares restantes= " + (3 - contS2));
            caixaC += 42;
          }

          else
            System.out.println("Sala 2 está lotada");
          break;
        }
        case 3 -> {
          if (contS3 < 8) {
            contS3++;
            System.out.println("Total de lugares restantes= " + (8 - contS1));
            caixaC += 42;
          } else
            System.out.println("Sala 3 está lotada");
          break;
        }

      }
    }
    totalSala = contS1 + contS2 + contS3;
    System.out.println("\nTotal de ingressos vendidos no dia= " + totalSala);
    System.out.println("Total de dinheiro arrecadado= R$ " + caixaC + " reais");
    System.out.println("\nOperador " + nome + "\nAté logo!");

  }
}