package Lista_1;
import javax.swing.JOptionPane;
public class Ex3_Temperatura {
    public static void main(String[] args) {
        //var
        double temperatura = 0.0d;
        String mensagem = "";
        boolean m = true;
        //lê e verifica a condição
        try {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe a temperatura", "VALOR DA TEMPERATURA", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Digitou errado! \uD83D\uDE2D", "Lamentável", JOptionPane.ERROR_MESSAGE);
            m = false;
        }

        if (temperatura<0) {
            mensagem = "Negativo!";
        }else if (temperatura==0){
            mensagem = "É zero";
        }else{
            mensagem = "Positivo";
        }
        if (m)
            JOptionPane.showMessageDialog(null, mensagem, "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
    }
}
