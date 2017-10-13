//feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;

class Salario {
  public static void main (String args []) {
    Float horas = 0.0f;
    Float valorHora = 0.0f;
    int dependentes = 0;
    //Entrada
    try {
    horas = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe as horas trabalhadas"));
    if(horas<0) {
      JOptionPane.showMessageDialog(null, "Você informou número negativo, besta.");
      System.exit(0);
    }
    valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da Hora."));
    if(valorHora<0) {
      JOptionPane.showMessageDialog(null, "Você informou número negativo, besta.");
      System.exit(0);
    }
    dependentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de dependentes."));
    if(dependentes<0) {
      JOptionPane.showMessageDialog(null, "Você informou número negativo, besta.");
      System.exit(0);
    }
    }catch (Exception e){
       JOptionPane.showMessageDialog(null,"Erro");
    }
    //Calculos
    Double inss = 0.00;
    Double ir = 0.00;
    Double salarioLiquido = 0.00;
    
    Float salarioBruto = (horas*valorHora+(50*dependentes));
    
    if (salarioBruto<=1000){
      inss = (salarioBruto*0.085);
    }else{
      inss = (salarioBruto*0.09);
    }
    
    if (salarioBruto<=500) {
      ir = 0.0;
    }else{
      if ((salarioBruto>500) && (salarioBruto<1000)) {
        ir = (salarioBruto*0.05);
      }else{
        if (salarioBruto>1000) {
          ir = (salarioBruto*0.07);
        }
      }
    }
  salarioLiquido = (salarioBruto-inss-ir);
  JOptionPane.showMessageDialog(null, "Salario Bruto = "+salarioBruto+"\nInss = "+inss+"\nIr = "+ir+"\nSalário Liquido ="+salarioLiquido);
    
  }
}