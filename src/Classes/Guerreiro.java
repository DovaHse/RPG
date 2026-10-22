package Classes;

public class Guerreiro extends Personagem{


    public Guerreiro(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }


    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
    }

    @Override
    public void receberDano(int dano) {
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public boolean estarVivo() {
        super.estarVivo();
        return super.estarVivo();
    }
}
