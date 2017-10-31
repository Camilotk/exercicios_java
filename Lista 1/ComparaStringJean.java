import java.util.*;

/* Exercicio 11
 * Autor: Camilo Cunha de Azevedo
 * 
 *  O programa deverá ler o nome de uma pessoa, letra por letra, 
 * e informar se o nome digitado foi “Jean” ou não.
 */

public class ComparaStringJean {
  public static void main (String[] args) {
    String j = "JEAN";
    Scanner ler = new Scanner(System.in);
    String s = " ";
    s = ler.next();
    s = s.toUpperCase();
    
    if (j.equals(s)) {
      System.out.println("É");
    }else {
      System.out.println("Não");
    }
      
    }
}
