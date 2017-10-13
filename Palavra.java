import java.util.*;

/* Exercicio 13
 * Autor: Camilo Cunha de Azevedo
 * 
 * O programa deverá ler uma palavra, letra por letra, 
 * e deverá informar quantas vogais existem na palavra.
 */

public class Palavra {
  public static void main (String[] args){
   Scanner ler = new Scanner(System.in);
   String l = ler.next();
   l = l.toLowerCase();
   
   char vogais[] = {'a', 'e', 'i', 'o', 'u'};
   int v = 0;
   
   for(int i = 1; i < l.length(); i++){
     for (int j = 0; j<4; j++){
       if (l.charAt(i) == vogais[j]){
         v++;
       }
     }
   }
   
   System.out.println("A palavra "+l+" tem "+v+" vogais.");
  }
}
