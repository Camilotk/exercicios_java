package Lista_1;

import java.util.Scanner;

public class Ex6_Correcao {
    public static void main(String[] args) {
        // o exercício deve calcular o índice de massa corpórea de um número de pessoas
        int no_pessoas;

        System.out.println("Indique o número de pessoas a serem avaliadas:");
        Scanner scan = new Scanner(System.in);
        no_pessoas = scan.nextInt();
        System.out.println(no_pessoas + "serão avaliadas.");
        String[] nomes = new String[no_pessoas];
        double[] idades = new double[no_pessoas];
        double[] alturas = new double[no_pessoas];
        double[] pesos = new double[no_pessoas];
        double[] IMC = new double[no_pessoas];

        for (int pessoa_idx = 0; pessoa_idx<no_pessoas; pessoa_idx++) {
            System.out.println("Digite seu nome:");
            nomes[pessoa_idx] = scan.next();
            System.out.println("Digite sua idade:");
            idades[pessoa_idx] = scan.nextDouble();
            System.out.println("Digite sua altura:");
            alturas[pessoa_idx] = Double.parseDouble(scan.next());
            System.out.println("Digite seu peso:");
            pesos[pessoa_idx] = scan.nextDouble();

            IMC[pessoa_idx] = pesos[pessoa_idx] / (alturas[pessoa_idx] * alturas[pessoa_idx]);
        }

        for (int pessoa_idx = 0; pessoa_idx < no_pessoas; pessoa_idx++) {
            System.out.println("IMC de " +  nomes[pessoa_idx] +  " : " + IMC[pessoa_idx]);
        }
    }
}
