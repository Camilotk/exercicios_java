import java.util.*;
/*Exercicio 2
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa deverá calcular a conversão de km/h para m/s. 
 * O usuário deverá informar o valor em km/h 
 * e o programa deverá mostrar o valor da conversão. 
 */

public class ConversaoKmM {
  public static void main (String[] args) {
    int kmh = 0;
    
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite o valor em Km/h: ");
    kmh = ler.nextInt();
    System.out.println("O resultado é "+(kmh/3.6)+" m/s.");
  }
}
