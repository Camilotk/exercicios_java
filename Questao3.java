/*Feito por: Camilo Cunha de Azevedo
 * Código: 555062
 */

import javax.swing.JOptionPane;
import java.util.Vector;

class Questao3 {
  public static void main (String args []) {
    //Variaveis
    Vector<String> mesAno = new Vector<String>();
    Vector<Double> mesTemp = new Vector<Double>();
    Double maiorT = -5000000.0;
    String maiorM = " ";
    Double menorT = 5000000.0;
    String menorM = " ";
    Double j = 0.0;
    
    //Declaração dos Meses do Ano
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
    
    //Execução
    for(int i = 0; i < 12; i++) {
      try {
       mesTemp.add(i, Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura de "+mesAno.get(i)+":")));
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Você informou algo errado");
        System.exit(0);
      }
      
       if (mesTemp.get(i)>maiorT) {
         maiorT = (mesTemp.get(i));
         maiorM = (mesAno.get(i));
       }
       
       if (mesTemp.get(i)<menorT) {
         menorT = (mesTemp.get(i));
         menorM = (mesAno.get(i));
       }
       
       j += mesTemp.get(i);
    }
    
    //Print
    JOptionPane.showMessageDialog(null, "Litagem das temperaturas \n2012 - Janeiro "+mesTemp.get(0)+"\n2012 - Fevereiro "+mesTemp.get(1)+"\n2012 - Março "+mesTemp.get(2)+"\n2012 - Abril "+mesTemp.get(3)+"\n2012 - Maio "+mesTemp.get(4)+"\n2012 - Junho "+mesTemp.get(5)+"\n2012 - Julho "+mesTemp.get(6)+"\n2012 - Agosto "+mesTemp.get(7)+"\n2012 - Setembro "+mesTemp.get(8)+"\n2012 - Outubro "+mesTemp.get(9)+"\n2012 - Novembro "+mesTemp.get(10)+"\n2012 - Dezembro "+mesTemp.get(11)+"\n\nA Maior Temperatura foi "+maiorT+" em "+maiorM+"\nA Menor Temperatura foi "+menorT+" em "+menorM+"\nTotal de Temperatura "+j+" A Média Temperatura foi "+(j/12));
  }
}