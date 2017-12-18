package Classes;

public abstract class Construcoes extends Dependencias {
    public Construcoes(int x, int y, String imagem, int custoMadeira, int custoOuro, int custoComida, boolean vivo, int vida, Civilizacao civil) {
        super(x, y, imagem, custoMadeira, custoOuro, custoComida, vivo, vida,0, civil);
    }
}
