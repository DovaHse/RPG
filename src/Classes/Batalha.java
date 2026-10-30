package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Batalha {
    public void iniciarBatalha(){


    Guerreiro solrac = new Guerreiro("Solrac", 100, 35, 30);
    Chefe ysmir = new Chefe("Ysmir", 200, 30, 30);
    Mago gandalf = new Mago("Gandalf", 100, 40, 20 );
    Ranger legolas = new Ranger("Legolas", 100, 35, 20);

         List<Personagem> heroisVivos = new ArrayList<>();
                heroisVivos.add(solrac);
                heroisVivos.add(legolas);
                heroisVivos.add(gandalf);




    Scanner acao = new Scanner(System.in);


        while (ysmir.estarVivo() && (solrac.estarVivo() || gandalf.estarVivo() || legolas.estarVivo())) {
        System.out.println("----------------------------");
        System.out.println(" Que comece o combate!!!!!");
        System.out.println(" RUGE O GRANDE Ysmir!!!!!!!!!!!!!!!!");
        System.out.println("----------------------------");

        for (int i = 0; i < heroisVivos.size(); i++){
            Personagem heroi = heroisVivos.get(i);
            System.out.println(heroi.getNome() + " = HP " + heroi.getHP());
        }
            System.out.println(ysmir.getNome() + " = HP " + ysmir.getHP());

        if (solrac.estarVivo()) {
            System.out.println("----------------------------");
            System.out.println("Escolha sua proxima acao Solrac");
            System.out.println(" 1 - Atacar ");
            System.out.println(" 2 - Defender ");
            System.out.println(" 3 - Ataque Pesado ");
            System.out.println("----------------------------");

            boolean acaoValida = false;
            solrac.coolDownAtaquePesado();

            while (!acaoValida) {
                try {
                    int escolha = acao.nextInt();

                    switch (escolha) {
                        case 1:
                            solrac.atacar(ysmir);
                            acaoValida = true;
                            break;
                        case 2:
                            solrac.defender();
                            acaoValida = true;
                            break;
                        case 3:
                            solrac.ataquePesado(ysmir);
                            acaoValida = true;
                            break;
                        default:
                            System.out.println("Comando Invalido! Escolha novamente");
                            break;
                    }

                } catch (Exception e) {
                    System.out.println("Entrada inválida! Por favor, insere um número.");
                    acao.next();
                }
            }
        }
        if (gandalf.estarVivo()) {
            System.out.println("----------------------------");
            System.out.println("Escolha sua proxima acao Gandalf");
            System.out.println(" 1 - Atacar ");
            System.out.println(" 2 - Defender ");
            System.out.println(" 3 - Cura ");
            System.out.println("----------------------------");

            boolean acaoValida = false;

            while (!acaoValida) {
                try {
                    int escolha = acao.nextInt();

                    switch (escolha) {
                        case 1:
                            gandalf.atacar(ysmir);
                            acaoValida = true;
                            break;
                        case 2:
                            gandalf.defender();
                            acaoValida = true;
                            break;
                        case 3:
                            System.out.println("Escolha o alvo: " +
                                    " 1 - Gandalf" +
                                    " 2 - Solrac" +
                                    " 3 - Legolas ");
                            int alvoEscolhido = acao.nextInt();
                            if (alvoEscolhido == 1) {
                                gandalf.curarPersonagem(gandalf);
                                System.out.println("Gandalf se curou!");
                                System.out.println(gandalf.getHP());
                                acaoValida = true;
                            } else if (alvoEscolhido == 2) {
                                gandalf.curarPersonagem(solrac);
                                System.out.println("Gandalf curou Solrac");
                                System.out.println(solrac.getHP());
                                acaoValida = true;
                            } else if (alvoEscolhido == 3) {
                                gandalf.curarPersonagem(legolas);
                                System.out.println("Gandalf curou Legolas");
                                System.out.println(legolas.getHP());
                                acaoValida = true;
                            } else {
                                System.out.println("Comando Invalido! Escolha novamente");
                            }
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida! Por favor, insere um número.");
                    acao.next();
                }
            }
        }
        if (legolas.estarVivo()){
            System.out.println("----------------------------");
            System.out.println("Escolha sua proxima acao Legolas");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Flecha Perfurante");
            System.out.println("----------------------------");

            boolean acaoValida = false;
            legolas.cooldownFlechaPerfurante();

            while (!acaoValida) {
                try {
                    int escolha = acao.nextInt();

                    switch (escolha) {
                        case 1:
                            legolas.atacar(ysmir);
                            acaoValida = true;
                            break;
                        case 2:
                            legolas.defender();
                            acaoValida = true;
                            break;
                        case 3:
                            legolas.flechaPerfurante(ysmir);
                            acaoValida = true;
                            break;
                        default:
                            System.out.println("Comando Invalido! Escolha novamente");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida! Por favor, insere um número.");
                    acao.next();
                }
            }
        }
        if (ysmir.estarVivo()){
            ysmir.agirAleatorio(heroisVivos);
        }
    }
        if (!ysmir.estarVivo()){
            System.out.println("Batalha concluida! Os Herois venceram a batalha!!!!!!!");
        }
        acao.close();
}

}
