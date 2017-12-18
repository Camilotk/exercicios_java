package Classes;

public abstract class Dependencias {
    int X;
    int Y;
    private String imagem;
    int custoMadeira;
    int custoOuro;
    int custoComida;
    boolean vivo = true;
    int vida;
    int armadura;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {

        this.vida = vida;
    }

    public int getX() {

        return X;
    }

    public int getY() {
        return Y;
    }

    public Civilizacao civil;
    public Dependencias(int x, int y, String imagem, int custoMadeira, int custoOuro, int custoComida, boolean vivo,
                        int vida, int armadura, Civilizacao civil) {
        X = x;
        Y = y;
        this.imagem = imagem;
        this.custoMadeira = custoMadeira;
        this.custoOuro = custoOuro;
        this.custoComida = custoComida;
        this.vivo = vivo;
        this.vida = vida;
        this.civil = civil;
        this.armadura = armadura;
    }

    public int getArmadura() {
        return armadura;
    }

    public String getPos() {
        return "("+this.X+","+this.Y+")";
    }

    public int getCustoMadeira() {
        return custoMadeira;
    }

    public int getCustoOuro() {
        return custoOuro;
    }

    public int getCustoComida() {
        return custoComida;
    }
}
