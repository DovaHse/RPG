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
            int escolha = acao.nextInt();
            switch (escolha) {
                case 1 : conan.atacar(xablau);
                break;
                case 2 : conan.defender();
                break;
            }
            if (xablau.estarVivo()){
                xablau.atacar(conan);
            }
        }
    }



}