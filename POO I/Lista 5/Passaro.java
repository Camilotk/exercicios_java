package Lista_5;

public final class Passaro extends Animal implements Aereo {
    public Passaro(int x, int y) {
        super(x, y);
    }
    @Override
    public void voa (Posicao posDestino) {
        System.out.println("Pássaro voando de (" +this.x+","+this.y+") para ("+posDestino.x+","+posDestino.y+")");
    }
}
