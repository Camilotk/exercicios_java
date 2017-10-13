//feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;

class Seguradora {
  public static void main (String args []) {
    
    String clienteNome = JOptionPane.showInputDialog(null, "Digite seu nome");
    int clienteIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
    String clienteSexo = JOptionPane.showInputDialog(null, "Digite seu sexo (Informe por extenso \"Masculino\" ou \"Feminino\":");
    int clienteAcidente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os acidentes ocorridos nos últimos 2 anos"));
    
    int taxa = 0;
    
    if (clienteIdade<=21) {
      taxa = (taxa+7);
    }
    
    if ((clienteIdade<=21) && (clienteSexo.equals("Feminino"))) {
      taxa = (taxa+4);
    }
    
    if (clienteSexo.equals("Masculino")) {
      taxa = (taxa+2);
    }
    
    if (clienteIdade>=21) {
      taxa = (taxa+5);
    }
    
    if (clienteAcidente<=1) {
      taxa = (taxa+2);
    }
    
    JOptionPane.showMessageDialog(null, "A taxa do cliente "+clienteNome+" é de "+taxa+"%");
      
  }
}