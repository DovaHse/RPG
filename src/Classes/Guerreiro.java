package Classes;

public class Guerreiro extends Personagem{


    public Guerreiro(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }

    public void ataquePesado(Personagem alvo) {
           ataquePesado(Personagem alvo) == (this.getAtaque() * 1.5);
           alvo.receberDano();
    }

    public void coolDownAtaquePesado(){

    }
}
