import Classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Guerreiro solrac = new Guerreiro("Solrac", 100, 35, 30);
        Chefe balrog = new Chefe("Balrog", 200, 30, 30);
        Mago gandalf = new Mago("Gandalf", 100, 40, 20 );
        Ranger legolas = new Ranger("Legolas", 100, 35, 20);

        Scanner acao = new Scanner(System.in);

        while (solrac.estarVivo() && balrog.estarVivo() && gandalf.estarVivo() && legolas.estarVivo()) {
            System.out.println("----------------------------");
            System.out.println("Escolha sua proxima acao");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("----------------------------");

            boolean acaoValida = false;

            while (!acaoValida) {
                int escolha = acao.nextInt();

                switch (escolha) {
                   case 1:
                       solrac.atacar(balrog);
                       acaoValida = true;
                       break;
                   case 2:
                       solrac.defender();
                       acaoValida = true;
                       break;

                   default:
                       System.out.println("Comando Invalido! Escolha novamente");
                       break;
               }
           }
            if (balrog.estarVivo()){
                balrog.atacar(solrac);
            }
        }
        acao.close();
    }
}