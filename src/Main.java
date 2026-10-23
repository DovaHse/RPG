import Classes.Guerreiro;
import Classes.Orc;
import Classes.Personagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Guerreiro conan = new Guerreiro("Conan", 100, 25, 20);
        Orc xablau = new Orc("Xablau", 100, 25, 15);

        while (conan.estarVivo() && xablau.estarVivo()) {
            conan.atacar(xablau);
            if (xablau.getHP() > 0 ){
                xablau.atacar(conan);
            }
        }
    }



}