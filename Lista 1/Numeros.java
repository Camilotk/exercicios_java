import java.util.*;
/* Exercicio 14
 * Autor: Camilo Cunha de Azevedo
 * 
 * O programa deverá ler 10 números inteiros informados pelo usuário,
 *  ao final o programa deverá informar qual é o maior valor.
 */
public class Numeros {
  public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    int a = 0;
    int b = 0;
    for (int i = 0; i<10; i++){
      a = ler.nextInt();
      if (a>b){
        b = a;
      }
    }
    
    System.out.println(b);
  }
}
