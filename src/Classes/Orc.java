package Classes;

import java.util.Random;



public class Orc extends Personagem{


    public Orc(String nome, int hp, int ataque, int defesa) {
        super(nome, hp, ataque, defesa);
    }




    @Override
    public void receberDano(int dano) {
        Random sorteio = new Random();
        boolean vaiDefender = sorteio.nextBoolean();
        if (vaiDefender){
            System.out.println(this.getNome() + " Defendeu! ");
        } else {
            System.out.println(this.getNome() + " Recebe o ataque ");
            super.receberDano(dano);
        }

    }
}
