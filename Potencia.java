import java.util.*;
/*Exercicio 8
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa dever� ler um n�mero inteiro �A� e um n�mero inteiro �B�
 * O programa dever� mostrar o resultado de A^B
 */

public class Potencia {
  public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite A");
    int a = ler.nextInt();
    System.out.println("Digite B");
    int b = ler.nextInt();
    
    System.out.println(a+" elevado na "+b+" = "+(Math.pow(a,b)));
  }
}