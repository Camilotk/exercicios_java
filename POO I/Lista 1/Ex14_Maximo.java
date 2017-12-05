package Lista_1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex14_Maximo {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        int entrada = 0;
        for(int i = 0; i<10; i++) {
            try {
                entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número " + (i+1)));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Digitou errado! \uD83D\uDE2D", "Lamentável", JOptionPane.ERROR_MESSAGE);
            }
            lista.add(entrada);
        }

        JOptionPane.showMessageDialog(null, "O maior número é "+ Collections.max(lista));
    }
}
