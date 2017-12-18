package Lista_5;

public final class Tigre extends Animal implements Terrestre {
    public Tigre(int x, int y) {
        super(x, y);
    }

    @Override
    public void anda(Posicao posDestino) {
        System.out.println("Tigre andando de ("+this.x+","+this.y+") para ("+posDestino.x+","+posDestino.y+")");
    }
}
