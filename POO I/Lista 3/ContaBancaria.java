package Lista_3;

import java.util.ArrayList;

public class ContaBancaria {
    private double saldo;
    private double limiteSaque;
    private double taxaSaque;
    Cliente cliente;
    final String numero;
    private ArrayList<String> historico;
    Cartao[] cartoesAssociados = new Cartao[5];

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    ContaBancaria(double saldo, PessoaFisica pessoa, String numero) {
        this.saldo = saldo;
        this.cliente = pessoa;
        this.numero = numero;
        modificaTaxaSaque();
        for (int i =0; i<cartoesAssociados.length; i++) {
            cartoesAssociados[i] = new CartaoDebito();
        }
        historico = new ArrayList();
        historico.add("Titular da Conta: "+cliente.nome);
        historico.add("Saldo Inicial: R$"+saldo+" reais!");
    }

    ContaBancaria(double saldo, PessoaJuridica empresa, String numero) {
        this.saldo = saldo;
        this.cliente = empresa;
        this.numero = numero;
        modificaTaxaSaque();
        historico = new ArrayList();
        historico.add("Titular da Conta: "+cliente.nome);
        historico.add("Saldo Inicial: R$"+saldo+" reais!");
    }

    public double verSaldo() {
        return saldo;
    }

    public void adicionarCartao(Cartao cartao){
        for (int i=0; i<5; i++) {
            int cout = 0;
            if (this.cartoesAssociados[i].associado == false) {
                cartoesAssociados[i] = cartao;
                cartao.associado = true;
                break;
            } else {
                cout++;
            }
            if (cout == 5) {
                System.out.println("Limite de cartoes atingido!");
                break;
            }
        }
    }

    public void deposita (double valor) {
        this.saldo += valor;
        historico.add("Depositado: R$"+valor+" reais!");
    }

    public void saque(double valor) {
        this.saldo -= valor;
        historico.add("Sacado: R$"+valor+" reais!");
    }

    public void saque (Cartao cartao, double valor) {
        for (int i = 0; i<5; i++){
            if(cartoesAssociados[i].getNumeroCartao().equals(cartao.getNumeroCartao())) {
                if (!(cartao instanceof CartaoCredito)) {
                    cartao.conta.saque(valor);
                    break;
                } else {
                    System.out.println("Cartao de Crédito, não dá! D:");
                    break;
                }
            }

        }
    }

    public void consultaHistorico(){
        for(int i=0; i<historico.size(); i++) {
            System.out.println(historico.get(i));
        }
        System.out.println("Valor atual: R$"+this.saldo+" reais!");
    }

    private void modificaTaxaSaque(){
        if (this.saldo>0.0d && this.saldo<1000.00d) {
            this.taxaSaque = 3.00d;
        } else if (this.saldo>1000.00d && this.saldo<10000.00d) {
            this.taxaSaque = 3.50d;
        } else if (this.saldo>10000.00d){
            this.taxaSaque = 4.00d;
        } else {
            System.out.println("Por favor não digite valores negativos!");
        }
    }

    public void paga (Cartao cartaoPgto, ContaBancaria contaPgto, double valor) {
        if (cartaoPgto instanceof CartaoDebito) {
            saque(valor);
            contaPgto.deposita(valor);
        } else {
            CartaoCredito cartao = (CartaoCredito) cartaoPgto;
            if (valor>cartao.limite) {
                cartao.valorGasto += valor;
                contaPgto.deposita(valor);
            } else {
                System.out.println("Limite Excedido! 404!");
            }
        }
    }
    public void pagaCartoes(){
        for (int i =0; i<5; i++) {
            if (cartoesAssociados[i] instanceof CartaoCredito) {
                CartaoCredito cartao = (CartaoCredito) cartoesAssociados[i];
                this.saldo -= cartao.valorGasto;
            }
        }
    }

}

