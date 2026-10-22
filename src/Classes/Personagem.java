package Classes;

public abstract class Personagem {
    //Atributos
    private String nome;
    private int HP;
    private int ataque;
    private int defesa;


    public Personagem(String nome, int HP, int ataque, int defesa) {
        this.nome = nome;
        this.HP = HP;
        this.ataque = ataque;
        this.defesa = defesa;

    }
        //

    public void atacar() {

    }
    public void receberDano(int dano){
        HP = dano - defesa;
    }

    public void defender(){

    }
    public boolean estarVivo(){
            if (HP > 0) {
                return true;
            }
        return false;
    }


    // metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }






}
