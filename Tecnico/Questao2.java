/*Feito por: Camilo Cunha de Azevedo
 * Código: 555062
 */

import javax.swing.JOptionPane;
import java.util.Vector;

class Questao2 {
  public static void main (String args[]) {
    int ano = 2012;
    Vector<String> mesAno = new Vector<String>();
    //Vetores de Combustível 
    Vector<Double> combustivel_1 = new Vector<Double>();
    Vector<Double> combustivel_2 = new Vector<Double>();
    Vector<Double> combustivel_3 = new Vector<Double>();
    Vector<Double> combustivel_4 = new Vector<Double>();
    Vector<Double> combustivel_5 = new Vector<Double>();
    //Vetores de Manutenção
    Vector<Double> manutencao_1 = new Vector<Double>();
    Vector<Double> manutencao_2 = new Vector<Double>();
    Vector<Double> manutencao_3 = new Vector<Double>();
    Vector<Double> manutencao_4 = new Vector<Double>();
    Vector<Double> manutencao_5 = new Vector<Double>();
    //Vetores de Soma
    Vector<Double> total_1 = new Vector<Double>();
    Vector<Double> total_2 = new Vector<Double>();
    Vector<Double> total_3 = new Vector<Double>();
    Vector<Double> total_4 = new Vector<Double>();
    Vector<Double> total_5 = new Vector<Double>();
    //Adicionando os meses
    mesAno.add(0, "Janeiro");
    mesAno.add(1, "Fevereiro");
    mesAno.add(2, "Março");
    mesAno.add(3, "Abril");
    mesAno.add(4, "Maio");
    mesAno.add(5, "Junho");
    mesAno.add(6, "Julho");
    mesAno.add(7, "Agosto");
    mesAno.add(8, "Setembro");
    mesAno.add(9, "Outubro");
    mesAno.add(10, "Novembro");
    mesAno.add(11, "Dezembro");
    //Laço do Primeiro Carro
    for (int i=0;i<12; i++) {
      try {
      manutencao_1.add(i, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da manutenção do veiculo 1 no mês de "+mesAno.get(i))));
      combustivel_1.add(i, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustível do veiculo 1 no mês de "+mesAno.get(i))));
      }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Você informou algo errado.");
      }
    }
    //Laço do Segundo Carro
    for (int j=0;j<12; j++) {
      try {
      manutencao_2.add(j, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da manutenção do veiculo 2 no mês de "+mesAno.get(j))));
      combustivel_2.add(j, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustível do veiculo 2 no mês de "+mesAno.get(j))));
      }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Você informou algo errado.");
      }
    }
    //Laço do Terceiro Carro
    for (int k=0;k<12; k++) {
      try {
      manutencao_3.add(k, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da manutenção do veiculo 3 no mês de "+mesAno.get(k))));
      combustivel_3.add(k, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustível do veiculo 3 no mês de "+mesAno.get(k))));
      }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Você informou algo errado.");
      }
    }
     //Laço do Quarto Carro
    for (int z=0;z<12; z++) {
      try {
      manutencao_4.add(z, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da manutenção do veiculo 4 no mês de "+mesAno.get(z))));
      combustivel_4.add(z, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustível do veiculo 4 no mês de "+mesAno.get(z))));
      }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Você informou algo errado.");
      }
    }
     //Laço do Quinto Carro
    for (int w=0;w<12; w++) {
      try {
      manutencao_5.add(w, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da manutenção do veiculo 5 no mês de "+mesAno.get(w))));
      combustivel_5.add(w, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustível do veiculo 5 no mês de "+mesAno.get(w))));
      }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Você informou algo errado.");
      }
    }
    //Laço de Cálculo do Total
    for (int c=0;c<12; c++) {
      total_1.add(c, (manutencao_1.get(c)+combustivel_1.get(c)));
      total_2.add(c, (manutencao_2.get(c)+combustivel_2.get(c)));
      total_3.add(c, (manutencao_3.get(c)+combustivel_3.get(c)));
      total_4.add(c, (manutencao_4.get(c)+combustivel_4.get(c)));
      total_5.add(c, (manutencao_5.get(c)+combustivel_5.get(c)));
    }
    //Print
    JOptionPane.showMessageDialog(null, "Mês       Veículo Combustível Manutenção Total \n"+mesAno.get(0)+"     1    "+combustivel_1.get(0)+"       "+manutencao_1.get(0)+"      "+total_1.get(0)+"\n                   2    "+combustivel_2.get(0)+"       "+manutencao_2.get(0)+"      "+total_2.get(0)+"\n                   3    "+combustivel_3.get(0)+"       "+manutencao_3.get(0)+"      "+total_3.get(0)+"\n                   4    "+combustivel_4.get(0)+"       "+manutencao_4.get(0)+"      "+total_4.get(0)+"\n                   5    "+combustivel_5.get(0)+"       "+manutencao_5.get(0)+"      "+total_5.get(0)+"\n"+mesAno.get(1)+"    1    "+combustivel_1.get(1)+"       "+manutencao_1.get(1)+"      "+total_1.get(1)+"\n                      2    "+combustivel_2.get(1)+"       "+manutencao_2.get(1)+"      "+total_2.get(1)+"\n                      3    "+combustivel_3.get(1)+"       "+manutencao_3.get(1)+"      "+total_3.get(1)+"\n                      4    "+combustivel_4.get(1)+"       "+manutencao_4.get(1)+"      "+total_4.get(1)+"\n                      5    "+combustivel_5.get(1)+"       "+manutencao_5.get(1)+"      "+total_5.get(1)+"\n"+mesAno.get(2)+"      1    "+combustivel_1.get(2)+"       "+manutencao_1.get(2)+"      "+total_1.get(2)+"\n                   2    "+combustivel_2.get(2)+"       "+manutencao_2.get(2)+"      "+total_2.get(2)+"\n                   3    "+combustivel_3.get(2)+"       "+manutencao_3.get(2)+"      "+total_3.get(2)+"\n                   4    "+combustivel_4.get(2)+"       "+manutencao_4.get(2)+"      "+total_4.get(2)+"\n                   5    "+combustivel_5.get(2)+"       "+manutencao_5.get(2)+"      "+total_5.get(2)+"\n"+mesAno.get(3)+"        1    "+combustivel_1.get(3)+"       "+manutencao_1.get(3)+"      "+total_1.get(3)+"\n                   2    "+combustivel_2.get(3)+"       "+manutencao_2.get(3)+"      "+total_2.get(3)+"\n                   3    "+combustivel_3.get(3)+"       "+manutencao_3.get(3)+"      "+total_3.get(3)+"\n                   4    "+combustivel_4.get(3)+"       "+manutencao_4.get(3)+"      "+total_4.get(3)+"\n                   5    "+combustivel_5.get(3)+"       "+manutencao_5.get(3)+"      "+total_5.get(3)+"\n"+mesAno.get(4)+"        1    "+combustivel_1.get(4)+"       "+manutencao_1.get(4)+"      "+total_1.get(4)+"\n                   2    "+combustivel_2.get(4)+"       "+manutencao_2.get(4)+"      "+total_2.get(4)+"\n                   3    "+combustivel_3.get(4)+"       "+manutencao_3.get(4)+"      "+total_3.get(4)+"\n                   4    "+combustivel_4.get(4)+"       "+manutencao_4.get(4)+"      "+total_4.get(4)+"\n                   5    "+combustivel_5.get(4)+"       "+manutencao_5.get(4)+"      "+total_5.get(4)+"\n"+mesAno.get(5)+"       1    "+combustivel_1.get(5)+"       "+manutencao_1.get(5)+"      "+total_1.get(5)+"\n                   2    "+combustivel_2.get(5)+"       "+manutencao_2.get(5)+"      "+total_2.get(5)+"\n                   3    "+combustivel_3.get(5)+"       "+manutencao_3.get(5)+"      "+total_3.get(5)+"\n                   4    "+combustivel_4.get(5)+"       "+manutencao_4.get(5)+"      "+total_4.get(5)+"\n                   5    "+combustivel_5.get(5)+"       "+manutencao_5.get(5)+"      "+total_5.get(5));
    JOptionPane.showMessageDialog(null, "Mês       Veículo Combustível Manutenção Total \n"+mesAno.get(6)+"     1    "+combustivel_1.get(6)+"       "+manutencao_1.get(6)+"      "+total_1.get(6)+"\n                   2    "+combustivel_2.get(6)+"       "+manutencao_2.get(6)+"      "+total_2.get(6)+"\n                   3    "+combustivel_3.get(6)+"       "+manutencao_3.get(6)+"      "+total_3.get(6)+"\n                   4    "+combustivel_4.get(6)+"       "+manutencao_4.get(6)+"      "+total_4.get(6)+"\n                   5    "+combustivel_5.get(6)+"       "+manutencao_5.get(6)+"      "+total_5.get(6)+"\n"+mesAno.get(7)+"    1    "+combustivel_1.get(7)+"       "+manutencao_1.get(7)+"      "+total_1.get(7)+"\n                      2    "+combustivel_2.get(7)+"       "+manutencao_2.get(7)+"      "+total_2.get(7)+"\n                      3    "+combustivel_3.get(7)+"       "+manutencao_3.get(7)+"      "+total_3.get(7)+"\n                      4    "+combustivel_4.get(7)+"       "+manutencao_4.get(7)+"      "+total_4.get(7)+"\n                      5    "+combustivel_5.get(7)+"       "+manutencao_5.get(7)+"      "+total_5.get(7)+"\n"+mesAno.get(8)+"      1    "+combustivel_1.get(8)+"       "+manutencao_1.get(8)+"      "+total_1.get(8)+"\n                   2    "+combustivel_2.get(8)+"       "+manutencao_2.get(8)+"      "+total_2.get(8)+"\n                   3    "+combustivel_3.get(8)+"       "+manutencao_3.get(8)+"      "+total_3.get(8)+"\n                   4    "+combustivel_4.get(8)+"       "+manutencao_4.get(8)+"      "+total_4.get(8)+"\n                   5    "+combustivel_5.get(8)+"       "+manutencao_5.get(8)+"      "+total_5.get(8)+"\n"+mesAno.get(9)+"        1    "+combustivel_1.get(9)+"       "+manutencao_1.get(9)+"      "+total_1.get(9)+"\n                   2    "+combustivel_2.get(9)+"       "+manutencao_2.get(9)+"      "+total_2.get(9)+"\n                   3    "+combustivel_3.get(9)+"       "+manutencao_3.get(9)+"      "+total_3.get(9)+"\n                   4    "+combustivel_4.get(9)+"       "+manutencao_4.get(9)+"      "+total_4.get(9)+"\n                   5    "+combustivel_5.get(9)+"       "+manutencao_5.get(9)+"      "+total_5.get(9)+"\n"+mesAno.get(10)+"        1    "+combustivel_1.get(10)+"       "+manutencao_1.get(10)+"      "+total_1.get(10)+"\n                   2    "+combustivel_2.get(10)+"       "+manutencao_2.get(10)+"      "+total_2.get(10)+"\n                   3    "+combustivel_3.get(10)+"       "+manutencao_3.get(10)+"      "+total_3.get(10)+"\n                   4    "+combustivel_4.get(10)+"       "+manutencao_4.get(10)+"      "+total_4.get(10)+"\n                   5    "+combustivel_5.get(10)+"       "+manutencao_5.get(10)+"      "+total_5.get(10)+"\n"+mesAno.get(11)+"       1    "+combustivel_1.get(11)+"       "+manutencao_1.get(11)+"      "+total_1.get(11)+"\n                   2    "+combustivel_2.get(11)+"       "+manutencao_2.get(11)+"      "+total_2.get(11)+"\n                   3    "+combustivel_3.get(11)+"       "+manutencao_3.get(11)+"      "+total_3.get(11)+"\n                   4    "+combustivel_4.get(11)+"       "+manutencao_4.get(11)+"      "+total_4.get(11)+"\n                   5    "+combustivel_5.get(5)+"       "+manutencao_5.get(11)+"      "+total_5.get(11));
    //Totais por Mês
    Double total_Janeiro = (total_1.get(0)+total_2.get(0)+total_3.get(0)+total_4.get(0)+total_5.get(0));
    Double total_Fevereiro = (total_1.get(1)+total_2.get(1)+total_3.get(1)+total_4.get(1)+total_5.get(1));
    Double total_Marco = (total_1.get(2)+total_2.get(2)+total_3.get(2)+total_4.get(2)+total_5.get(2));
    Double total_Abril = (total_1.get(3)+total_2.get(3)+total_3.get(3)+total_4.get(3)+total_5.get(3));
    Double total_Maio = (total_1.get(4)+total_2.get(4)+total_3.get(4)+total_4.get(4)+total_5.get(4));
    Double total_Junho = (total_1.get(5)+total_2.get(5)+total_3.get(5)+total_4.get(5)+total_5.get(5));
    Double total_Julho = (total_1.get(6)+total_2.get(6)+total_3.get(6)+total_4.get(6)+total_5.get(6));
    Double total_Agosto = (total_1.get(7)+total_2.get(7)+total_3.get(7)+total_4.get(7)+total_5.get(7));
    Double total_Setembro = (total_1.get(8)+total_2.get(8)+total_3.get(8)+total_4.get(8)+total_5.get(8));
    Double total_Outubro = (total_1.get(9)+total_2.get(9)+total_3.get(9)+total_4.get(9)+total_5.get(9));
    Double total_Novembro = (total_1.get(10)+total_2.get(10)+total_3.get(10)+total_4.get(10)+total_5.get(10));
    Double total_Dezembro = (total_1.get(11)+total_2.get(11)+total_3.get(11)+total_4.get(11)+total_5.get(11));
    Double total_ano = (total_Janeiro+total_Fevereiro+total_Marco+total_Abril+total_Maio+total_Junho+total_Julho+total_Agosto+total_Setembro+total_Outubro+total_Novembro+total_Dezembro);
    //Print ano
    JOptionPane.showMessageDialog(null, "Total 2012 - "+total_ano+"\nJaneiro - "+total_Janeiro+"\nFevereiro - "+total_Fevereiro+"\nMarço - "+total_Marco+"\nAbril - "+total_Abril+"\nMaio - "+total_Maio+"\nJunho - "+total_Junho+"\nJulho- "+total_Julho+"\nAgosto - "+total_Agosto+"\nSetembro - "+total_Setembro+"\nOutubro - "+total_Outubro+"\nNovembro - "+total_Novembro+"\nDezembro - "+total_Dezembro);
  }
}
