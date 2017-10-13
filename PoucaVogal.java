import java.util.*;

/* Exercicio 10
 * Autor: Camilo Cunha de Azevedo
 * 
 *  O programa deverá ler uma letra e um número N. 
 *  O programa deverá informar se a letra é uma vogal ou não,
 *  e caso for uma vogal, deverá mostrar na tela a vogal impressa N vezes. 
 */

public class PoucaVogal {
  public static void main (String[] args){
    char a = ' ';
    int b = 0;
    boolean v = false;
    
    Scanner ler = new Scanner(System.in);
    a = ler.next().charAt(0);
    
    switch(a) {
      case 'a': 
        v = true;
        break;
      case 'e':
        v = true;
        break;
      case 'i':
        v = true;
        break;
      case 'o':
        v = true;
        break;
      case 'u':
        v = true;
        break;
      default:
        v = false;
        break;
    }
    
    if(v){
      System.out.println("É vogal");
    } else {
      System.out.println("Não é vogal");
    }
    
  }
}
