package Classes;

public class Guerreiro extends Personagem{


    public Guerreiro(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }
    // atributo
    private int coolDown = 0;

    //
    public void ataquePesado(Personagem alvo) {
                if (coolDown > 0){
                    System.out.println("Habilidade em recarga!" + this.coolDown);
                } else {
                    int danoPesado = (int) (this.getAtaque() * 1.5);
                    alvo.receberDano(danoPesado);
                    coolDown = 2;
                }
    }

    public void coolDownAtaquePesado(){
            if (coolDown > 0){
                coolDown--;
            }

    }
}
