package Classes;

public class Mago extends Personagem{


    public Mago(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }

    public void curarPersonagem (Personagem alvo){
        int cura =  25;

        if (alvo.estarVivo()) {
            alvo.setHP(alvo.getHP() + cura);
            System.out.println(alvo.getNome() + " Recuperou  " + cura + " HP ");
        }
    }

}
