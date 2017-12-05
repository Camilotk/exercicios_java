package Lista_1;

import javax.swing.*;
import java.util.ArrayList;

public class Ex11_Jean {
    private static char validaEntrada () {
        String entrada = "";
        boolean repete = true;
        while(repete) {
            entrada = JOptionPane.showInputDialog(null, "Digite uma letra ou . para terminar");
            if (entrada.length()>1) {
                JOptionPane.showMessageDialog(null, "Digite apenas uma letra");
            } else {
                repete = false;
            }
        }
        char n = entrada.charAt(0);
        return n;
    }
    public static void main(String[] args) {
        ArrayList<Character> listaCaracteres= new ArrayList();
        boolean ciclo = true;
        char entrada = ' ';
        while (ciclo) {
            entrada = validaEntrada();
            if(entrada == '.') {
                ciclo = false;
                break;
            }
            listaCaracteres.add(entrada);
        }
        if (listaCaracteres.toString().equals("[J, e, a, n]")) {
            JOptionPane.showMessageDialog(null, "É Jean sim, Sr.", "Acertou miserávi",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não é 'Jean' ", "Fui tapeado!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
