package Lista_3;

public class PessoaFisica extends Cliente {
    private String numeroCPF;

    PessoaFisica(String nome, String numeroCPF, TipoCliente tipo) {
        super(nome, tipo);
        if (validaCPF(numeroCPF)) {
            this.numeroCPF = numeroCPF;
        } else {
            System.out.println("CPF não válido!");
            System.exit(0);
        }
    }

    private boolean validaCPF (String numero) {
        //Implementação sem valor monetário
        boolean valido = true;
        if (valido) {
            return true;
        }
        return false;
    }
}
