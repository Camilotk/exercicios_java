package Lista_1;
import javax.swing.JOptionPane;
public class Ex10_VogaisNumeros {
    private static int validaEntradaInteiro () {
        boolean repete = true;
        int a = 0;
        while (repete) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite um número inteiro", "Entre um número inteiro", JOptionPane.QUESTION_MESSAGE));
            } catch (Exception e) {
                continue;
            }
            repete = false;
        }
        return a;
    }
    private static char validaEntradaChar () {
        String msg = " ";
        boolean repete = true;
        while(repete) {
            msg = JOptionPane.showInputDialog(null, "Digite uma letra");
            if (msg.length()>1) {
                JOptionPane.showMessageDialog(null, "Digite apenas uma letra");
            } else {
                repete = false;
            }
        }
        char n = msg.charAt(0);
        return n;
    }
    private static boolean comparaVogal (char a) {
        char vogais[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i<vogais.length; i++) {
            if (a == vogais[i]) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        char mensagem = validaEntradaChar();
        int a = validaEntradaInteiro();
        boolean vogal = comparaVogal(mensagem);
        if (vogal) {
            JOptionPane.showMessageDialog(null, "É vogal");
            System.out.println("Desculpa é muita impressão");
            for(int i = 0; i<a; i++){
                System.out.println(mensagem);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é vogal");
        }

    }
}
