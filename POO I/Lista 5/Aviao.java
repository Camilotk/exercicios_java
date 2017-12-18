package Lista_5;

public final class Aviao extends Veiculo implements Aereo {
    public Aviao(int x, int y) {
        super(x, y);
    }

    @Override
    public void voa(Posicao posDestino) {
        System.out.println("Avião voando de (" +this.x+","+this.y+") para ("+posDestino.x+","+posDestino.y+")");
    }
}
