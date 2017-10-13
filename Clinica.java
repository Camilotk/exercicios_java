//Feito por Camilo Cunha, cód 555062

import javax.swing.JOptionPane;

class Clinica {
  public static void main (String args []) {
    String nome = " ";
    String sexo = " ";
    Double peso = 0.00;
    Double altura = 0.00;
    int idade = 0;
    int i = 0;
    int mediaIdade = 0;
    int mediaMulheres = 0;
    int mediaIdades = 0;
    int maiorIdade = 0;
    String nomeVelho = " ";
    String mulherBaixa = " ";
    Double menorAltura = 0.00;
    int mediaIdadeHomens = 0;
    
    while (!(nome.equals("fim"))) {
      nome = JOptionPane.showInputDialog(null, "Digite o nome do paciente");
      if (nome.equals("fim")) {
        break;
      }
      sexo = JOptionPane.showInputDialog(null, "Digite o sexo do paciente (Masculino ou Feminino)");
      peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do Paciente"));
      idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Paciente"));
      altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Paciente"));
      
      i++;
      
      mediaIdade = (mediaIdade+idade);
      
      
      
      
      if (sexo.equals("Masculino")) {
        mediaIdadeHomens = (mediaIdadeHomens+idade);
      }
      
      if ((sexo.equals("Feminino")) && ((altura>1.60) && (altura<1.70)) && (peso>70.0)) {
        mediaMulheres = (mediaMulheres+1);
      }
      
      if ((idade>18) && (idade<25)) {
        mediaIdades = (mediaIdades+1);
      }
      
      if (idade>maiorIdade) {
        maiorIdade = idade;
        nomeVelho = nome;
      }
      
      if (menorAltura<altura) {
        menorAltura = altura;
        mulherBaixa = nome;
      }
      
    }
    JOptionPane.showMessageDialog(null, "O número de Paciente foi "+i+"\nA média da idade dos Homens foi "+(mediaIdadeHomens/i)+"\nA quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg foi "+mediaMulheres+"\nA quantidade de pessoas com idade entre 18 e 25 "+mediaIdades+"\nO nome do paciente mais velho é "+nomeVelho+"\nO nome da mulher mais baixa é "+mulherBaixa);
 }
}
      
      
      
        
      
      
      
      
      