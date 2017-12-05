package Lista_1;
import java.util.Scanner;
public class Ex9_Salario {
    //Obs: é mudança de um exerc. feito no téc com mesmo objetivo
    public static void main (String[] args) {
        //Declaração de Variáveis
        String nome = " ";
        double salario = 0.0;
        double salario_liq = 0.0;

        String inss = " ";
        double desconto = 0.0f;
        String irrf = " ";
        double desc = 0.0f;

        //Cria o Scanner
        Scanner ler = new Scanner(System.in);

        //Leituras
        try {
            System.out.println("Digite o nome do funcionário: ");
            nome = ler.nextLine();
            System.out.println("Digite o salário do funcionário: ");
            salario = ler.nextDouble();
        } catch (Exception e) {
            System.out.println("Ainda é lamentável \uD83D\uDE2D");
        }

        //Cálculo INSS
        if (salario <= 1638.38) {
            inss = "8%";
            desconto += (salario * 0.08);
        } else if (salario < 1638.38 && salario >= 2765.66) {
            inss = "9%";
            desconto += (salario * 0.09);
        } else if (salario > 2765.66 && salario <= 4663.75) {
            inss = "11%";
            desconto += (salario * 0.11);
        } else if (salario > 4663.75) {
            inss = "Teto";
            desconto += 513.01;
        } else if (salario > 937.0) {
            System.out.println("ERR0: Salário não pode ser menor que o Minímo Nacional!");
        }

        //IRRF
        if (salario > 0 && salario <= 1862.22) {
            irrf = "ISENTO";
            desc = 0;
        } else if (salario >= 1868.23 && salario <= 2799.86) {
            irrf = "7,5%";
            desc += salario * 0.075;
        } else if (salario >= 2799.87 && salario <= 3733.19) {
            irrf = "15%";
            desc = salario * 0.15;
        } else if (salario >= 3733.20 && salario <= 4664.68) {
            irrf = "22,5%";
            desc = salario * 0.225;
        } else if (salario >= 4664.68) {
            irrf = "27,5%";
            desc = salario * 0.275;
        }

        //Print na Tela
        System.out.println("====== CÁLCULO CONTRACHEQUE ====== \nNome: " + nome);
        System.out.println("Salário Bruto: " + salario);
        System.out.println("Desconto INSS: " + inss + " Valor: " + desconto);
        System.out.println("Desconto IRRF: " + irrf + " Valor: " + desc);
        System.out.println("Líquido: " + (salario - (desconto + desc)));
    }
}
