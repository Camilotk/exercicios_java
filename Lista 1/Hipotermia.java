import java.util.*;
/* Exercicio 7
 * Autor: Camilo Cunha de Azevedo
 * 
 * O programa deverá ler uma temperatura. 
 * Caso a temperatura estiver abaixo de 20 graus,  o programa deverá informar “hipotermia”, 
 * caso esteja entre 20 e 37,5 deverá informar “temperatura normal”, 
 * caso esteja entre 37,5 e 42 “febre”, caso contrário “perigo”.
 */
public class Hipotermia {
  public static void main(String[] args){
    Double t = 0.0d;
    System.out.println("Digite a temperatura: ");
    Scanner ler = new Scanner(System.in);
    t = ler.nextDouble();
    
    if (t<20) {
      System.out.println("Hipotermia brrr...");
    }else if(t>=20 && t<=37.5){
      System.out.println("Temperatura normal");
    }else if(t>37.5 && t<=42){
      System.out.println("Febre");
    } else {
      System.out.println("Prigo!");
    }
  }
}
