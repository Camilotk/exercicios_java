package Lista_3;

public abstract class Cartao {
    private String numeroCartao;
    ContaBancaria conta;
    boolean associado;
    TipoCartao tipo;

    public Cartao(String numeroCartao, ContaBancaria conta, TipoCartao tipo) {
        this.numeroCartao = numeroCartao;
        this.conta = conta;
        this.tipo = tipo;
        associado = false;
    }

    public Cartao() {
    }

    public boolean getAssociacao(){
        return this.associado;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

}
