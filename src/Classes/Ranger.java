package Classes;

public class Ranger extends Personagem {


    public Ranger(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }
    private int cooldown = 0;
    private int danoBruto;


    public void flechaPerfurante(Personagem alvo) {
            int dano = this.getAtaque();
            if (cooldown > 0){
                System.out.println("Habilidade em recarga!");
            } else {
                ((Chefe) alvo).receberFlechaPerfurante(dano);
                cooldown = 2;
            }
    }

    public void cooldownFlechaPerfurante() {
        if (cooldown > 0) {
            cooldown--;
        }
    }
}
