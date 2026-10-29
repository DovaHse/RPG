package Classes;

public class Chefe extends Personagem{
    public Chefe(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }

    public void receberFlechaPerfurante(int dano){
            this.setHP(getHP() - dano);
    }




}
