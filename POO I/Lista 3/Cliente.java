package Lista_3;

public abstract class Cliente {
    String nome;
    protected TipoCliente tipo;

    public Cliente(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
