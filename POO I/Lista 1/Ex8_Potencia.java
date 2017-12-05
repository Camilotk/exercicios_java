package Lista_1;
import javax.swing.JOptionPane;
public class Ex8_Potencia {
    public static double potencia (int a, int b) {
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        boolean m = true;
        try {
           a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A",
                   "A^B", JOptionPane.QUESTION_MESSAGE));
           b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B",
                   "A^B", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Digitou errado! \uD83D\uDE2D", "Lamentável", JOptionPane.ERROR_MESSAGE);
            m = false;
        }
        if(m)
            JOptionPane.showMessageDialog(null, (potencia(a,b)), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
