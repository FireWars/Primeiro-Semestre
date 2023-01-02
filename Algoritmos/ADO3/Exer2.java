import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tipoCarro = 0, cont = 0;
        float c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, totalV = 0;// Varial classificada pelo tamanho do veiculo
        System.out.println("----------------" + "\nSistema de Pedagio" + "\n----------------");
        while (tipoCarro != 6) {
            System.out.println("Informe o tamanho do veiculo\n");
            System.out.println("Carro pequeno - Digite 1\n" + "Carro médio - Digite 2\n" + "Carro grande - Digite 3");
            System.out.println("Van, Caminhão e ônibus - Digite 4\n" + "Moto e Bicicleta - Digite 5\n"
                    + "Encerrar o programa - Digite - 6");
            tipoCarro = s.nextInt();
            switch (tipoCarro) {
                case 1:
                    c1 = c1 + 5;
                    break;

                case 2:
                    c2 = c2 + 10;
                    break;

                case 3:
                    c3 = c3 + 15;
                    break;

                case 4:
                    c4 = c4 + 20;
                    break;
            }
            cont++;
        }
        totalV = c1 + c2 + c3 + c4;
        System.out.println("Total do valor arrecado= R$" + totalV + " reais");
        System.out.println("Total de veiculos que passaram no dia= " + cont + " veículos");
        System.out.println("\nObrigado pelo seu serviço!");

    }
}