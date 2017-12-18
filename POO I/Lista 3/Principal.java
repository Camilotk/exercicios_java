package Lista_3;

public class Principal {
    public static void main(String[] args) {
        PessoaJuridica cliente1 = new PessoaJuridica("AT&T", "999.999.999-00", TipoCliente.NORMAL);
        ContaBancaria conta1 = new ContaBancaria(5249.68, cliente1, "54-456.678-00");
        conta1.deposita(5000.00);
        conta1.deposita(500.00);
        conta1.saque(9000.00);
        conta1.consultaHistorico();
        System.out.println("Clássico problema dos numeros ponto flutuante representados em binários 1/3 != 3,33333...");
        System.out.println();

        PessoaFisica cliente2 = new PessoaFisica("Dennis Richie", "945.875.239-00", TipoCliente.VIP);
        ContaBancaria conta2 = new ContaBancaria(900.50, cliente2, "54-345.890-00");
        conta2.deposita(500);
        conta2.saque(350);
        conta2.deposita(690);
        CartaoCredito cartao1 = new CartaoCredito("900.987.677-00", conta2, TipoCartao.OURO, 1500, 0.15);
        conta2.adicionarCartao(cartao1);
        conta2.saque(conta2.cartoesAssociados[0],650);
        System.out.println(conta2.cartoesAssociados[0].getNumeroCartao());
        System.out.println(conta2.cartoesAssociados[0].associado);
        System.out.println();

        CartaoDebito cartao2 = new CartaoDebito("999.874.999-00", conta2, TipoCartao.BLACK);
        conta2.adicionarCartao(cartao2);
        conta2.saque(conta2.cartoesAssociados[1],650);
        System.out.println(conta2.cartoesAssociados[1].getNumeroCartao());
        System.out.println(conta2.cartoesAssociados[1].associado);

        conta2.saque(conta2.cartoesAssociados[1], 333.78);
        System.out.println();
        conta2.consultaHistorico();
        System.out.println(conta2.cartoesAssociados[0].conta.verSaldo());

        System.out.println("======== TESTE PAGA E PAGA CARTÃO ========");
        conta2.paga(cartao2, conta1, 345.90);
        conta2.pagaCartoes();
        conta2.consultaHistorico();
        System.out.println();
        conta1.consultaHistorico();
    }
}
