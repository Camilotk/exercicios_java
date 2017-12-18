package Lista_3;

public class PessoaJuridica extends Cliente {
    private String numeroCNPJ;

    public PessoaJuridica (String nome, String numeroCNPJ, TipoCliente tipo) {
        super(nome, tipo);
        if (validaCNPJ(numeroCNPJ)){
            this.numeroCNPJ = numeroCNPJ;
        } else {
            System.out.println("CPF não válido!");
            System.exit(0);
        }

    }
    private boolean validaCNPJ (String numero) {
        //Implementação sem valor monetário
        boolean valido = true;
        if (valido) {
            return true;
        }
        return false;
    }
}
