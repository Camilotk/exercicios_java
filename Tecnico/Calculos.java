//feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Calculos {
  public static void main (String args []) {
    String opc = JOptionPane.showInputDialog(null, "Digite o número correspondente a figura que deseja calular: \n1 - Círculo; \n2 - Triângulo; \n3 - Quadrado; \n4 - Retângulo.");
    switch (opc) {
      case "1":
        Double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio:"));
        Double area = 0.00;
        area = (Math.PI*Math.pow(raio, 2));   
        DecimalFormat df = new DecimalFormat("0.00");
        String numFormatado = df.format(area);
        JOptionPane.showMessageDialog(null, "Área do Círculo é "+numFormatado);
        break;
      case "2":
        Double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Triângulo:"));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Triângulo:"));
        area = ((base*altura)/2);
        DecimalFormat nf = new DecimalFormat("0.00");
        String numFormatad = nf.format(area);
        JOptionPane.showMessageDialog(null, "A Área do Triangulo é "+numFormatad);
        break;
      case "3":
        Double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado do Quadrado:"));
        area = (lado*lado);
        DecimalFormat f = new DecimalFormat("0.00");
        String numFormato = f.format(area);
        JOptionPane.showMessageDialog(null, "A Área do Quadrado é "+numFormato);
        break;
      case "4":
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Retângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Triângulo:"));
        area = (base*altura);
        DecimalFormat fo = new DecimalFormat("0.00");
        String numFormat = fo.format(area);
        JOptionPane.showMessageDialog(null, "A Área do Retângulo é "+numFormat);
        break;
      default:
        JOptionPane.showMessageDialog(null, "Desculpe, vocę năo informou um número válido.");
        
    }
  }
}
