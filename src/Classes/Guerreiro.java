package Classes;

public class Guerreiro extends Personagem{


    public Guerreiro(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }


    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void receberDano() {
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public boolean estarVivo() {
        super.estarVivo();
        return false;
    }
}
