import Classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Guerreiro solrac = new Guerreiro("Solrac", 100, 33, 25);
        Chefe ysmir = new Chefe("Ysmir", 200, 35, 28);
        Mago gandalf = new Mago("Gandalf", 100, 40, 15);
        Ranger legolas = new Ranger("Legolas", 100, 35, 18);

        Batalha jogo = new Batalha();
        jogo.iniciarBatalha();
    }
}