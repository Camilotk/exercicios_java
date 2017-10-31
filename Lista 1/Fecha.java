import java.util.*;
/* Exercicio 4
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa deverá informar inicialmente: “Para sair, digite ‘x’”. 
 * Após, deverá esperar que o usuário digite uma letra
 * Para qualquer letra diferente de ‘x’ o programa deverá repetir a pergunta. 
 * Caso ‘x’ seja digitado, o programa finaliza. 
 */
public class Fecha {
  public static void main(String[] args) { 
    char x = ' ';
    Scanner ler = new Scanner(System.in);
    
    while (x!='x') {
      System.out.println("Para sair, digite ‘x’");
      x = ler.next().charAt(0);
    }
    
  }
}
