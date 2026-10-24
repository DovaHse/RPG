import Classes.Guerreiro;
import Classes.Orc;
import Classes.Personagem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Guerreiro conan = new Guerreiro("Conan", 100, 25, 20);
        Orc xablau = new Orc("Xablau", 100, 25, 15);

        Scanner acao = new Scanner(System.in);

        while (conan.estarVivo() && xablau.estarVivo()) {
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
                       conan.atacar(xablau);
                       acaoValida = true;
                       break;
                   case 2:
                       conan.defender();
                       acaoValida = true;
                       break;
                   default:
                       System.out.println("Comando Invalido! Escolha novamente");
                       break;
               }
           }
            if (xablau.estarVivo()){
                xablau.atacar(conan);
            }
        }
        acao.close();
    }
}