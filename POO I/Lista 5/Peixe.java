package Lista_5;

public final class Peixe extends Animal implements Aquatico {
    public Peixe(int x, int y) {
        super(x, y);
    }

    @Override
    public void nada(Posicao posDestino) {
        System.out.println("Peixe nadando de posição ("+this.x+","+this.y+") para ("+posDestino.x+","+posDestino.y+")");
    }
}
