//feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;

class Gastos {
  public static void main (String args []) {
    String descricao = " ";
    Double valor = 0.00;
    Double media = 0.00;
    Double maiorGasto = 0.00;
    String maiorDescricao = " ";
    int contador = 1;
    int i = 0;
    
    while (!(descricao.equals("fim"))) {
      valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Gasto"));
      descricao = JOptionPane.showInputDialog(null, "Descrição do Gasto");
      i++;
      
      if (valor>maiorGasto) {
        maiorGasto = valor;
        maiorDescricao = descricao;
      }
      
      media = media+valor;
      
      if ((descricao.equals("alimentação")) || ((valor<=20) && (valor>=10))) {
        contador = (contador+1);
      }
      
    }
    
    JOptionPane.showMessageDialog(null, "A média dos gastos foi "+(media/i)+"\nDescrição do Maior gasto foi: "+maiorDescricao+"\nO número de gastos em Alimentação ou entre 10 e 20 reais foi: "+contador);
  }
}
        
      
    
