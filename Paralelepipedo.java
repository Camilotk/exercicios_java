import java.util.*;
import javax.swing.*;

/* Exercício 1
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa deverá calcular o volume de um paralelepípedo (mostrar para o usuário),
 * sendo que o usuário deverá informar a altura, largura e profundidade do objeto: V = a.b.c
 */

public class Paralelepipedo {
  public static void main(String[] args){
    Double a = 0.0d;
    Double b = 0.0d;
    Double c = 0.0d;
    
    a = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu nome?"));
    b = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura: "));
    c = Double.parseDouble(JOptionPane.showInputDialog("Informe a profundidade: "));
   
    JOptionPane.showMessageDialog(null,a*b*c);
    
    
  }
}
