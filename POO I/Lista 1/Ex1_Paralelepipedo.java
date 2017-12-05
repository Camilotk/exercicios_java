package Lista_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex1_Paralelepipedo {
    public static void main(String[] args) {
        //var
        Scanner leitura = new Scanner(System.in);
        double altura = 0;
        double largura = 0;
        double profundidade = 0;
        boolean mensage = true;
        //in
        try {
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura do paralelepipedo: ",
                    "CALCULADORA DE VOLUME DO PARALELEPIPEDO", JOptionPane.QUESTION_MESSAGE));
            largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da largura do paralelepipedo: ",
                    "CALCULADORA DE VOLUME DO PARALELEPIPEDO", JOptionPane.QUESTION_MESSAGE));
            profundidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da profundidade do paralelepipedo: ",
                    "CALCULADORA DE VOLUME DO PARALELEPIPEDO", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Digitou errado! \uD83D\uDE2D", "Lamentável", JOptionPane.ERROR_MESSAGE);
            mensage=false;
        }
        //out
        if (mensage)
            JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é: "+(altura*largura*profundidade)+" m³", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
