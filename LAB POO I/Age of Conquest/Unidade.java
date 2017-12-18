package Classes;

public abstract class Unidade extends Dependencias {
    private double velocidade;
    private int alcance;
    private int ataque;

    public double getVelocidade() {
        return velocidade;
    }

    public int getAtaque() {
        return ataque;
    }

    public Unidade(int x, int y, String imagem, int custoMadeira, int custoOuro, int custoComida, boolean vivo,
                   int vida, double velocidade, int alcance, int ataque, int armadura, Civilizacao civil) {
        super(x, y, imagem, custoMadeira, custoOuro, custoComida, vivo, vida, armadura, civil);
        this.velocidade = velocidade;
        this.alcance = alcance;
        this.ataque = ataque;
    }

    public int getAlcance() {
        return alcance;
    }

    public void mover(Direcoes orientacao) {
        String coordenada = orientacao.toString();
        switch(coordenada){
            case "NORTE":
                this.Y += this.velocidade;
                break;
            case "SUL":
                this.Y -= this.velocidade;
                break;
            case "LESTE":
                this.X += this.velocidade;
                break;
            case "OESTE":
                this.X -= this.velocidade;
                break;
        }
        //System.out.println("("+this.X+","+this.Y+")");

    }
}
