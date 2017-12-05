package Lista_1;
import javax.swing.JOptionPane;
public class Ex2_Conversor {
    public static void main(String[] args) {
        // km/h / 3,6 = m/s
        // 72 = 20
        double km = 0;
        boolean mensage = true;
        try {
            km = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantos km/h", "Questão!", JOptionPane.QUESTION_MESSAGE));
            km /= 3.6;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Digitou errado! \uD83D\uDE2D", "Lamentável", JOptionPane.ERROR_MESSAGE);
            mensage=false;
        }
        if (mensage)
            JOptionPane.showMessageDialog(null, "O resultado é "+km+" m/s", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
