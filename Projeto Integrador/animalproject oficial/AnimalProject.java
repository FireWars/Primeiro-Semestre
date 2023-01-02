package animalproject;
import java.util.Scanner;

//principal
public class AnimalProject {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int continuar = 1;
        int parar;
        int dicas = 2;
        int resposta;
        int escolha = 0;
        Scanner scan = new Scanner(System.in);
        CaixaDownlares downlares = new CaixaDownlares();
        Introducson textos = new Introducson();
        Menu menup = new Menu();
        String NomeAnimal=" ";

        while(continuar!=0){

        while (escolha != -1) {
            menup.Menup2();
            System.out.println("Sobre - Aperte 1\nJogar - Aperte 2 \nCréditos - Aperte 3\nSair - Aperte 0");
            escolha = scan.nextInt();  

            if(escolha==0){
                continuar=0;
                escolha = -1;
            }
                if(escolha==1){ 
                    System.out.println(
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            
                    System.out.println("Nosso jogo é um 'QRPG' (Quiz+Role Playing Game), que se passa em uma cidade\n" +
                        "fictícia chamada DownsVille cujo jogador terá que provar seus conhecimentos\n" +
                    "para resgatar o seu animalzinho.\n\n\n\n\n\n\n\n");
                    System.out.println("╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        scan.nextLine();
                        scan.nextLine();
                        menup.Menup2();
                    }   

                  else if(escolha==2){
                    escolha = -1;
                  }


                  else if (escolha==3){
                    System.out.println(
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            
                    System.out.println("Projeto de PI\n");
                    System.out.println(
                            "Projetado pelos alunos:\nKevin Landim    Lorena Rosa    Milene Araújo    Rafael   Veiga     Tiago Rabello"
                                    +
                                    "\nOrientador: Professor Luiz Mauricio Azanha    -    Centro Universitário de Santo Amaro\n\n\n\n");
                    System.out.println("╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                    scan.nextLine();
                    scan.nextLine();
                    menup.Menup2();
                  
                    }
        }

        System.out.println(
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if(continuar!=0){

        textos.introducao();
        textos.CriacaoPersonagem();
        textos.nome = scan.nextLine();
        textos.Animal();
        NomeAnimal = scan.nextLine();
        
        System.out.println("Eu, " + NomeAnimal + " estou precisando de você! ");
        System.out.println("Mas, antes, vamos à história:\n");
        scan.nextLine();
        System.out.println("Tudo começou na nossa cidade de Downville, lá no bairro que moramos do RochDownlle. ");
        System.out.println( "Fui tomado de você, " + textos.nome + ", que logo percebeu minha ausência e ficou apavorado. ");
        System.out.println("Pouco tempo depois você recebeu um telefonema; ");
        scan.nextLine();
        System.out.println("O famoso Shark Thank, dono do monopólio Studios SharkDowns e apresentador do programa Cidade Downlerta e ");
        System.out.println("do 'Quizz ShowDown'. Esse último é um jogo conhecido na cidade pela concorrência ao prêmio de 1 MILHAO DE DOWNLARES!!\n");
        System.out.println("Enfim, você foi o escolhido desta vez. Shak Thank te convidou para o 'Quizz ShowDown'. ");
        System.out.println("Você, " + textos.nome +", decidi participar pensando em me resgatar com o dinheiro proposto pelo programa. "); 
        System.out.println("**Aperte qualquer tecla para continuar**");
        String ler = scan.nextLine();
        System.out.println(
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println(
                "---------------------CHEGANDO NO LOCAL--------------------------------------------------------------------------\n");
        System.out.println("SHARK: Bem vindo " + textos.nome + ". Espero que esteja preparado. Vamos começar! ");
        System.out.println("SHARK: Devo te lembrar que este programa está sendo transmitido para todos os nossos telespectadores! ");
        System.out.println("SHARK: E cá está a primeira pergunta: ");
            }        
        
        // perguntasssssss
        // PERGUNTA
        // 1---------------------------------------------------------------------------------------------
        while (continuar == 1) {
    
            System.out.println("PRIMEIRA PERGUNTA: ");
            System.out.println("QUANTAS CASAS DECIMAIS TEM NÚMERO PI? ");
            System.out.println("1) DUAS ");
            System.out.println("2) INFINITA ");
            System.out.println("3) CENTENAS ");
            System.out.println("4) DICA" + "                    " + "Downlares atuais: " + downlares.downlares);
            resposta = scan.nextInt();
            if (resposta < 0 || resposta > 4) {
                System.out.println("ESTA RESPOSTA É INVÁLIDA ");
            } else {
                switch (resposta) {
                    case 4:
                        if (dicas >= 1) {
                            System.out.println("Você sente uma grande conexão com seu bichinho.Uma conexão que supera barreiras... ");
                            System.out.println("Sente a presença de " + NomeAnimal + " dentro de seu coração ");
                            textos.AnimalDica();
                            System.out.println("**DICA: O NÚMERO PI É IRRACIONAL** \n");
                            scan.nextLine();
                            scan.nextLine();
                            dicas--;
                        } else if (dicas <= 0) {
                            textos.AnimalEsgotado();
                            scan.nextLine();
                            scan.nextLine();
                        }
                        break;
                    case 1:
                        textos.textoFinalA();
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                    case 2:
                        System.out.println("CERTA RESPOSTA! ");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;
                        System.out.println("SHARK: Muito bom, " + textos.nome + ", você acertou a primeira pergunta e arrecadou 200,000 downllares. ");
                        System.out.println("SHARK: Porém, o jogo só está começando. Temos muito pela frente. ");
                        System.out.println("SHARK: Prepare-se. Agora o jogo ficará mais difícil! ");
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        scan.nextLine();
                        scan.nextLine();
                        continuar++;
                        break;
                    case 3:
                        textos.textoFinalA();
                        textos.AnimalErrou();
                        scan.nextLine();
                        scan.nextLine();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        escolha = 0;
                        continuar = 10;
                        break;
                }
            }
        }


        // PERGUNTA
        // 2-------------------------------------------------------------------------------------------------------------------
        while (continuar == 2) {
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    
            System.out.println("Segunda Pergunta: ");
            System.out.println("DE QUEM É A FAMOSA FRASE: 'PENSO, LOGO EXITO'? ");
            System.out.println("1) GALILEU GALILEI ");
            System.out.println("2) SÓCRATES ");
            System.out.println("3) RENE DESCARTES ");
            System.out.println("4) DICA" + "                    " + "Downlares atuais: " + downlares.downlares);
            resposta = scan.nextInt();
            if (resposta < 0 || resposta > 4) {
                System.out.println("UHM, RESPOSTA ERRADA! ");
            } else {
                switch (resposta) {
                    case 4:
                        if (dicas >= 1) {
                            System.out.println("Você sente uma grande conexão com seu bichinho. Uma conexão que supera barreiras... ");
                            System.out.println("Sente a presenca de " + NomeAnimal + " dentro de seu coração ");
                            textos.AnimalDica();
                            System.out.println("**DICA: É TAMBÉM O PAI DA FILISOFIA.** \n");
                            scan.nextLine();
                            scan.nextLine();
                            dicas--;
                        } else if (dicas <= 0) {
                            textos.AnimalEsgotado();
                            scan.nextLine();
                            scan.nextLine();
                        }
                        break;
                    case 1:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: Poxa, você errou e nosso jogo acaba por aqui! ");
                        System.out.println("Você arrecadou " + (downlares.downlares - 199999));
                        System.out.println("   ---- FINAL B ----   ");
                        System.out.println("  paga nem o oni[B]us  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                    case 2:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: Poxa, você errou e nosso jogo acaba por! ");
                        System.out.println("Você arrecadou " + (downlares.downlares - 199999));
                        System.out.println("   ---- FINAL B ----   ");
                        System.out.println("  paga nem o oni[B]us  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                    case 3:
                        System.out.println("ISSO, CERTA RESPOSTA! ");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;
                        System.out.println("SHARK: MARAVILHA, VOCÊ ESTÁ INDO BEM. ");
                        System.out.println("SHARK: " + textos.nome + ", você arrecadou mais 200,000 downllares. ");
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        continuar++;
                        break;
                }
            }
        }



        // PERGUNTA
        // 3----------------------------------------------------------------------
        while (continuar == 3) {
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    
            System.out.println("Pergunta 3: ");
            System.out.println("QUEM FOI O PRIMEIRO HOMM A PISAR NA LUA? ");
            System.out.println("1) NEIL ARMSTRONG ");
            System.out.println("2) BUZZ ALDRIN ");
            System.out.println("3) CHARLES DUKE ");
            System.out.println("4) DICA" + "                    " + "Downlares atuais: " + downlares.downlares);
            resposta = scan.nextInt();
            if (resposta < 0 || resposta > 4) {
                System.out.println("UHM, RESPOSTA ERRADA! ");
            } else {
                switch (resposta) {
                    case 4:
                        if (dicas >= 1) {
                            System.out.println("Você sente uma grande conexão com seu bichinho. Uma conexão que supera barreiras... ");
                            System.out.println("Sente a presença de " + NomeAnimal + " dentro de seu coração ");
                            textos.AnimalDica();
                            System.out.println("**DICA: ERA ENGENHEIRO AEROESPACIAL E MORREU EM 2012.** \n");
                            scan.nextLine();
                            scan.nextLine();
                            dicas--;
                        } else if (dicas <= 0) {
                            textos.AnimalEsgotado();
                            scan.nextLine();
                            scan.nextLine();
                        }
                        break;
                    case 1:
                        System.out.println("CERTA RESPOSTA! ");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;
                        System.out.println("SHARK: " + textos.nome + ", você está demais, em!? ");
                        System.out.println("SHARK: E isso faz com que você obtenha " + downlares.downlares);
                        System.out.println("SHARK: Seguindo a regra do jogo, preciso te perguntar: ");
                        System.out.println("SHARK: Deseja parar o jogo por aqui e voltar para casa com a quantia arrecadada até agora? ");
                        System.out.println("SHARK: Lembre-se que, se você perder, terá uma penalidade grande, perdendo quase todo o seu dinheiro. ");
                        System.out.println("1 - NÃO QUERO CONTINUAR // 2 - QUERO SEGUIR ");
                        parar = scan.nextInt();
                        if (parar == 1) {

                            System.out.println("SHARK: O jogo estava ficando divertido. ");
                            System.out.println(textos.nome + ": Não estou fazendo isso pelo dinheiro, e sim, por " + NomeAnimal);
                            System.out.println(textos.nome + ": Acredito que com a quantia acumulada eu possa salvá-lo. ");
                            System.out.println("SHARK: Espero que consiga salvar seu animalzinho ");
                            System.out.println("SHARK: O programa de hoje chega ao fim. Até semana que vem com mais um QuizzShowDOWN! ");
                            scan.nextLine();
                            System.out.println("\n----------CHEGANDO EM CASA-----------");
                            System.out.println("Chegando em casa, após o programa, " + textos.nome + "liga para os sequestadores; ");
                            System.out.println(textos.nome + ": Consegui o dinheiro para o resgate de " + NomeAnimal);
                            System.out.println("BANDIDOS: Quanto? ");
                            System.out.println(textos.nome + ": Consegui " + downlares.downlares);
                            scan.nextLine();
                            scan.nextLine();
                            textos.textoFinalC();
                            scan.nextLine();
                            System.out.println("-------FINAL 3---------\n");
                            System.out.println("----insufi[C]iente----\n");
                            System.out.println("");
                            System.out.println(NomeAnimal + ": Espere, isso não pode acabar assim. ");
                            System.out.println(NomeAnimal + ": Jogue o jogo do shark até o final e consiga o 1 milhão de downllares. ");
                            System.out.println(NomeAnimal + ": Você já possui o resgate. Por favor, continue! ");
                            System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                            scan.nextLine();
                            scan.nextLine();
                            scan.nextLine();
                            escolha = 0;
                            continuar = 10;
                        } else if (parar == 2) {
                            System.out.println("SHARK: Olhem quem decidiu voltar! ");
                            System.out.println("SHARK: Antes de continuarmos, iremos ouvir do participantante anterior o motivo que o fez retornar: ");
                            System.out.println(textos.nome + ": Quero continuar porque sou inteligente e meu aninmal confia em mim. ");
                            System.out.println(textos.nome + ": Como comentei, ele foi sequestrado e, agora, retornei. ");
                            System.out.println("SHARK: Ora, você tem muita audácia. Isso é bom. Então vamos seguir com a penúltima pergunta: ");

                            System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                            scan.nextLine();
                            scan.nextLine();
                            scan.nextLine();
                            continuar++;
                        }
                        break;
                    case 2:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: Poxa, você errou. Nosso jogo acaba por aqui. ");
                        System.out.println("Você adquiriu" + (downlares.downlares - 399880));
                        System.out.println("   ----FINAL C(alt)----   ");
                        System.out.println("  meio do [C]aminho  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 0;
                        break;
                    case 3:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: Poxa, você errou. Nosso jogo acaba por aqui. ");
                        System.out.println("Você adquiriu" + (downlares.downlares - 399880));
                        System.out.println("   ----FINAL C(alt)----   ");
                        System.out.println("  meio do [C]aminho  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                }
            }
        }



        // PERGUNTA
        // 4----------------------------------------------------------------------
        while (continuar == 4) {
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    
            System.out.println("QUARTA PERGUNTA: ");
            System.out.println("QUAL O NOME DO PRIMEIRO COMPUTADOR DIGITAL? ");
            System.out.println("1) ÁBACO ");
            System.out.println("2) ENIAC ");
            System.out.println("3) ZUSE ");
            System.out.println("4) DICA" + "                    " + "Downlares atuais: " + downlares.downlares);
            resposta = scan.nextInt();
            if (resposta < 0 || resposta > 4) {
                System.out.println("UHM, RESPOSTA INVÁLIDA! ");
            } else {
                switch (resposta) {
                    case 4:
                        if (dicas >= 1) {
                            System.out.println("Você sente uma grande conexão com seu bichinho. Uma conexão que supera barreiras... ");
                            System.out.println("Sente a presença de " + NomeAnimal + " dentro de seu coração ");
                            textos.AnimalDica();
                            System.out.println(
                                    "**DICA: POSSUIA 30 TONELADAS E FOI ELABORADA PARA O LABORATÓRIO  D PESQUISA BALÍSTICA DOS EUA.** ");
                                    scan.nextLine();
                                    scan.nextLine();
                            dicas--;
                        } else if (dicas <= 0) {
                            textos.AnimalEsgotado();
                            scan.nextLine();
                            scan.nextLine();
                        }
                        break;
                    case 1:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: UFA! ");
                        System.out.println("SHARK: Ou melhor, quero dizer, que pena. Infelizmente nosso jogo acaba por aqui ");
                        System.out.println("Você adquiriu" + (downlares.downlares - 599999));
                        System.out.println("SHARK: Eu disse que haveria uma penalidade grande. Hahaha ");
                        System.out.println(textos.nome + ": ÔH, isso não vale nada. O que farei? ");
                        System.out.println("SHARK: Uhm, deveria ter parado quando teve a oportunidade, né!? Posso fazer nada. ");
                        System.out.println("    ----FINAL D----   ");
                        System.out.println("    troco [D]e pinga  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                    case 2:
                        System.out.println("BOAAA RESPOSTA! ");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;
                        System.out.println("SHARK: Como pode você ter acertado essa?! ");
                        System.out.println("SHARK: Pois bem, mais uma resposta correta. Agora você terá mais 200.000 downllares ");
                        System.out.println("SHARK: E um passo mais perto de reencontrar seu animal. ");
                        System.out.println("SHARK: Parabéns, vamos para a última pergunta. Tenho certeza que você irá conseguir. ");
                        scan.nextLine();
                        System.out.println("O Sr. Shark estava agindo de uma maneira estranha. Um pouco maníaco, quase assustador, ");
                        System.out.println("como se ele estivesse escondendo alguma coisa. ");
                        System.out.println("SHARK: ÚLTIMA PERGUNTA DA NOITE! "); 
                        System.out.println("Shark estava com uma feição de raiva e suava muito. ");
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        continuar++;
                        break;
                    case 3:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: UFA! ");
                        System.out.println("SHARK: Ou melhor, quero dizer, que pena. Infinfelizmente nosso jogo acaba por aqui. ");
                        System.out.println("Você adquiriu" + (downlares.downlares - 599999));
                        System.out.println("SHARK: Eu disse que haveria uma penalidade grande. Hahahaha ");
                        System.out.println(textos.nome + ": Ôh, isso nao vale nada. O que farei? ");
                        System.out.println("SHARK: Devia ter parado quando teve a oportunidade, né!? Posso fazer nada. ");
                        System.out.println("    ----FINAL D----   ");
                        System.out.println("    troco [D]e pinga  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                }
            }
        }



        // PERGUNTA
        // 5----------------------------------------------------------------------
        while (continuar == 5) {
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    
            System.out.println("QUINTA POERGUNTA: ");
            System.out.println("QUEM FOI O PRESIDENTE DO INÍCIO DA DITADURA MILITAR? ");
            System.out.println("1) GETÚLIO VARGAS ");
            System.out.println("2) JOÃO GOULART ");
            System.out.println("3) HUMBERTO CASTELLO BRANCO ");
            System.out.println("4) DICA" + "                    " + "Downlares atuais: " + downlares.downlares);
            resposta = scan.nextInt();
            if (resposta < 0 || resposta > 4) {
                System.out.println("RESPOSTA INVÁLIDA! ");
            } else {
                switch (resposta) {
                    case 4:
                        if (dicas >= 1) {
                            System.out.println("Voce sente uma grande conexÃO com seu bichinho. Uma conexão que supera barreiras... ");
                            System.out.println("Sente a presença de " + NomeAnimal + " dentro de seu coração ");
                            textos.AnimalDica();
                            System.out.println(
                                    "**DICA: ERA MARECHAL E POSSUI UMA AVENIDA COM O SEU NOME EM PORTO ALEGRE.** ");
                                    scan.nextLine();
                                    scan.nextLine();
                            dicas--;
                        } else if (dicas <= 0) {
                            textos.AnimalEsgotado();
                            scan.nextLine();
                            scan.nextLine();
                        }
                        break;
                        //FINAL PADRAO PARA CADA PERDA
                    case 1:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: POOOOOOXA, FIQUEI TRISTE COM UMA COISA DESSAS. ");
                        System.out.println("Estranho. Dava pra sentir o sarcasmo na voz de Shark Thank. ");
                        System.out.println("SHARK: Bom, infelizmente nosso jogo acaba por aqui.");
                        System.out.println("SHARK: Dessa vez sua penalidade nao será tão grande já que chegou perto. ");
                        System.out.println("Você adquiriu " + (downlares.downlares - 750999));
                        System.out.println("  ----FINAL E(alt)----  ");
                        System.out.println("  p[E]rto da v[E]rdade  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                    case 2:
                        System.out.println("RESPOSTA ERRADA! ");
                        System.out.println("SHARK: POOOOOOXA, FIQUEI TRISTE COM UMA COISA DESSAS");
                        System.out.println("Dava pra sentir o sarcasmo na voz de Shark Thank ");
                        System.out.println("SHARK: Ahhhh, nosso jogo acaba por aqui. ");
                        System.out.println("SHARK: Dessa vez sua penalidade não será tão grande. Já que chegou perto. ");
                        System.out.println("Você adquiriu" + (downlares.downlares - 750999));
                        System.out.println("  ----FINAL E(alt)----  ");
                        System.out.println("  p[E]rto da v[E]rdade  ");
                        textos.AnimalErrou();
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                    case 3:
                        System.out.println("CERTA RESPOSTA! ");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;
                        System.out.println("SHARK: Como você conseguiu acertar todas as respostas até aqui?! ");
                        System.out.println("SHARK: Era pra ser impossível. VOCE NÃO DEVERIA TER CHEGADO ATÉ AQUI! ");
                        System.out.println(textos.nome + ": Por que está agindo assim, Sr.Shark? ");
                        System.out.println("SHARK: Vou lhe contar"+ textos.nome);
                        scan.nextLine();
                        System.out.println("SHARK: Sabe o seu querido bichinho? Eu o sequestrei. ");
                        System.out.println("SHARK: " + NomeAnimal + " é uma espécie rara de animal. ");
                        textos.textoFinalE();
                        System.out.println("Nesse momento, " + NomeAnimal + " corre para os braços de " + textos.nome);
                        textos.AnimalVinganca();
                        scan.nextLine();
                        System.out.println("Shark sentiu medo. O animal olhava para ele com sangue nos olhos, um desejo insaciavel de vinganca. ");
                        System.out.println(NomeAnimal + " pulou da mão de " + textos.nome + " e correu em direção a Shark Thank. ");
                        System.out.println("O ataque que se seguiu é extremamente viceral para ser descrito, mas naquela noite, os Studios SharkDowns inteiro ouviu os gritos de dor e sofrimento de Shark. ");
                        System.out.println("\n-----EPILOGO-----");
                        scan.nextLine();
                        System.out.println("Logo após o incidente, " + textos.nome + " e " + NomeAnimal
                                + " voltaram para casa. ");
                        System.out.println("E sim," + textos.nome + " conseguiu ficar com todo o dinheiro. ");
                        System.out.println(textos.nome + " publicou, anos depois, um livro sobre o ocorrido. ");
                        System.out.println("Com o dinheiro, comprou uma casa em Paris e abandonou sua vida em Downsville. ");
                        scan.nextLine();
                        System.out.println("Às vezes, " + textos.nome + " se encontrava pensando sobre os poderes de " + NomeAnimal);
                        System.out.println("Mas " + NomeAnimal + " não gostava de falar sobre. ");
                        System.out.println(textos.nome + " e " + NomeAnimal + " viveram confortavelmente sem se preocupar até o final de suas vidas. ");
                        System.out.println("\n\n\n╔╦══════FINAL VERDADEIRO════════╦╗");
                        System.out.println("        r[E]unidos        ");
                        System.out.println("\n\n\n\n╔╦══════ (ಥ⌣ಥ) Aperte Enter para retornar ao menu principal (ಥ⌣ಥ) ══════╦╗");

                        scan.nextLine();
                        scan.nextLine();
                        escolha = 0;
                        continuar = 10;
                        break;
                }

            }
        }
    }

        scan.close();
 } 
}
