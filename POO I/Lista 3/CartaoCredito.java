package Lista_3;

public class CartaoCredito extends Cartao {
    double limite;
    protected double taxaJuros;
    protected double valorGasto;

    public CartaoCredito(String numeroCartao, ContaBancaria conta, TipoCartao tipo, double limite, double taxaJuros) {
        super(numeroCartao, conta, tipo);
        this.limite = limite;
        this.taxaJuros = taxaJuros;
        this.valorGasto = 0.00;
    }
}
