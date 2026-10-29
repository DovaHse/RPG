package Classes;

import java.util.List;
import java.util.Random;

public class Chefe extends Personagem{
    public Chefe(String nome, int HP, int ataque, int defesa) {
        super(nome, HP, ataque, defesa);
    }

    public void receberFlechaPerfurante(int dano){
            this.setHP(getHP() - dano);
    }



    public void agirAleatorio(List<Personagem> heroisVivos){
        Random random = new Random();
        int acao = random.nextInt(3) + 1;
            switch (acao){
                case 1:
                    ataqueBasico(heroisVivos);
                break;
                case 2:
                    defesa();
                break;

                case 3:
                    cospeFogo(heroisVivos);
                break;
            }
    }




    public void ataqueBasico(List<Personagem> heroisvivos){
                Random random = new Random();
                int target = random.nextInt(heroisvivos.size());
                Personagem alvo = heroisvivos.get(target);
                if (alvo.estarVivo()){
                    alvo.receberDano(this.getAtaque());
                }
    }

    public void defesa(){

    }

    public void cospeFogo(List<Personagem> heroisvivos){




    }
}
