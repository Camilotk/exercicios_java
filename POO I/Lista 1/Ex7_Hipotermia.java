package Lista_1;
import javax.swing.JOptionPane;
public class Ex7_Hipotermia {
    public static void main(String[] args) {
        double temperatura = 0.0d;
        String mensagem = " ";
        boolean m = true;
        try {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite uma temperatura", "Leitura de uma temperatura", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Digitou errado! \uD83D\uDE2D", "Lamentável", JOptionPane.ERROR_MESSAGE);
            m = false;
        }
        if (temperatura<20) {
            mensagem = "Hipotermia brrr...";
        }else if(temperatura>=20 && temperatura<=37.5){
            mensagem = "Temperatura normal";
        }else if(temperatura>37.5 && temperatura<=42){
            mensagem = "Febre";
        } else {
            mensagem = "Prigo!";
        }
        if(m)
            JOptionPane.showMessageDialog(null, mensagem, "Termometro", JOptionPane.INFORMATION_MESSAGE);
    }
}
