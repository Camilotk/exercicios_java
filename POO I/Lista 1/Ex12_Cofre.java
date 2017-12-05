package Lista_1;
import javax.swing.*;
public class Ex12_Cofre {
    public static void main (String[] args){
        char b1 = ' ';
        int erros = 0;
        int acertos = 0;

        while (erros<3){
            while (b1!='1' && erros<3) {
                b1 = JOptionPane.showInputDialog("Digite o primeiro número da senha: ").charAt(0);
                if (b1 == '1') {
                    acertos++;
                    break;
                }
                erros++;
            }
            while (b1!='2' && erros<3) {
                b1 = JOptionPane.showInputDialog("Digite o segundo número da senha: ").charAt(0);
                if (b1 == '2'){
                    acertos++;
                    break;
                }
                erros++;
            }
            while (b1!='3' && erros<3) {
                b1 = JOptionPane.showInputDialog("Digite o terceiro número da senha: ").charAt(0);
                if (b1 == '3'){
                    acertos++;
                    break;
                }
                erros++;
            }
            if (acertos==3){
                JOptionPane.showMessageDialog(null, "Liberado");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Bloqueado");
    }
}
