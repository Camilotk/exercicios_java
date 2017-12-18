package Lista_5;

public final class Barco extends Veiculo implements Aquatico {
    public Barco(int x, int y) {
        super(x, y);
    }

    @Override
    public void nada(Posicao posDestino) {
        /*Maior que 50 para a classe Barco, deve-se imprimir na tela “Acabou o combustível do Barco”.*/
        if ((Math.abs(this.x - posDestino.x)>50) || (Math.abs(this.y - posDestino.y)>50)) {
            System.out.println("Acabou o combustível do barco");
        } else {
            /*“<nome da classe> nadando de <posição origem> para <posição destino>”,*/
            System.out.println("Barco nadando de posição ("+this.x+","+this.y+") para ("+posDestino.x+","+posDestino.y+")");
        }
    }
}
