package Lista_3;

public class CartaoDebito extends Cartao {

    public CartaoDebito() {
        this.associado = false;
    }

    public CartaoDebito(String numeroCartao, ContaBancaria conta, TipoCartao tipo) {
        super(numeroCartao, conta, tipo);
    }
}
