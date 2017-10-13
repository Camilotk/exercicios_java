import java.util.*;

/* Exercicio 3
 * Autor: Camilo Cunha de Azevedo
 * 
 * O programa deverá ler um valor de temperatura e
 * informar se aquele valor é positivo ou negativo.
 */

public class Temperatura {
  public static void main (String[] args){
    int t = 0;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a temperatura, vamos ver se acerto o sinal... haha, digite: ");
    t = ler.nextInt();
    
    if (t<0) {
      System.out.println("Negativo");
    }else if (t==0){
      System.out.println("É zero");
    }else{
      System.out.println("Positivo");
    }
    
  }
}
