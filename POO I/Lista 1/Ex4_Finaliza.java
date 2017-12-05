package Lista_1;
import javax.swing.JOptionPane;
public class Ex4_Finaliza {
    public static void main(String[] args) {
        char read = ' ';
        String msg = " ";
        while (read != 'x') {
            msg = JOptionPane.showInputDialog(null, "Digite x para sair ",
                    "Aperta x aí mlk", JOptionPane.QUESTION_MESSAGE);
            read = msg.charAt(0);
        }
        JOptionPane.showMessageDialog(null, "Apertou mesmo! D:");
    }
}
