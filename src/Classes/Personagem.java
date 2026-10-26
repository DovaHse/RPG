package Classes;

public abstract class Personagem {
    //Atributos
    private String nome;
    private int HP;
    private int ataque;
    private int defesa;
    private boolean defendendo;


    public Personagem(String nome, int HP, int ataque, int defesa) {
        this.nome = nome;
        this.HP = HP;
        this.ataque = ataque;
        this.defesa = defesa;
        this.defendendo = false;
    }
        // Metodos

    public void atacar(Personagem alvo) {
        System.out.println(this.getNome() + " Ataca! ");
        alvo.receberDano(this.ataque);
    }
    public void receberDano(int dano){
        int defesaCalculada = this.defesa;

        if (this.defendendo) {
            defesaCalculada +=2;
            this.defendendo = false;
        }
        int danoEfetivo = dano - defesaCalculada;
        if (danoEfetivo < 0){
            danoEfetivo = 0;
        }

        this.HP = this.HP - danoEfetivo;
        System.out.println(this.getNome() + " Recebe " + danoEfetivo + " De Dano ");
        if (this.HP <= 0){
            System.out.println(this.getNome() + " Foi Derrotado ");
        }
    }


    public void defender(){
        this.defendendo = true;
        System.out.println(this.getNome() + " Defendeu! ");

    }


    public boolean estarVivo(){
            if (HP > 0) {
                return true;
            }
            return false;
        }




    // metodos especiais

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
