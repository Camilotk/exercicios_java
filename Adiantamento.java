//feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;

class Ex_01 {
  public static void main (String args []) {
    String opc = "0";
    String nome = "José";
    Double salario = 0.0;
    Double percentual = 0.0;
    
    //Entrada de Dados
    try {
    opc = JOptionPane.showInputDialog(null, "Digite o código do seu departamento: \n1 - Diretoria        | 40% de Adiantamento  \n2 - Gerencia       | 25% de Adiamento \n3 - Operacional | 15% de Adiamento ");
    nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
    salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o seu salário, use ponto ao invés de vírgula, ex: 650.00"));  
    }catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Você informou algo incorreto e/ou em branco!");
      System.exit(0);
    }
    
    //Calculo e Saida
    switch(opc) {
      case "1":
        percentual = (salario*0.40);
        JOptionPane.showMessageDialog(null, nome + " seu adiantamento é de 40% e o valor é " + percentual);
        break;
      case "2":
        percentual = (salario*0.25);
        JOptionPane.showMessageDialog(null, nome + " seu adiantamento é de 25% e o valor é " + percentual);
        break;
      case "3":
        percentual = (salario*0.15);
        JOptionPane.showMessageDialog(null, nome + " seu adiantamento é de 15% e o valor é " + percentual);
        break;
        
      //fim
    }
    
    
  }
}

    
    