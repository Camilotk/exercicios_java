//feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;

class Votacao {
  public static void main (String args []) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
    if (idade<16) {
      JOptionPane.showMessageDialog(null, "Você não pode votar.");
    }else{
      if (((idade>=16) && (idade<18)) || (idade>70)) {
        JOptionPane.showMessageDialog(null, "Seu voto é facultativo.");
      }else{
        JOptionPane.showMessageDialog(null, "Você é obrigado a votar.");
      }
    }
  }
}
