import java.util.Arrays;
import java.util.Scanner;

public class Base_exercicio6 {
    public static void main(String[] args) {
      // o exercÃ­cio deve calcular o Ã­ndice de massa corpÃ³rea de um nÃºmero de pessoas
      int no_pessoas = 0;
      
      System.out.println("Indique o nÃºmero de pessoas a serem avaliadas:");
      Scanner scan = new Scanner(System.in);
      
      no_pessoas = scan.nextInt();
      System.out.println(no_pessoas +  "serão avaliadas.");
      String[] nomes   = new String[no_pessoas];
      double[] idades  = new double[no_pessoas];
      double[] alturas = new double[no_pessoas];
      double[] pesos   = new double[no_pessoas];
      double[] IMC     = new double[no_pessoas];
      
      for (int pessoa_idx = 0; pessoa_idx<no_pessoas; pessoa_idx++) {
        System.out.println("Digite seu nome:");
        nomes[pessoa_idx] = scan.next();
        System.out.println("Digite sua idade:");
        idades[pessoa_idx] = scan.nextDouble();
        System.out.println("Digite sua altura:");
        alturas[pessoa_idx] = scan.nextDouble();
        System.out.println("Digite seu peso:");
        pesos[pessoa_idx] = scan.nextDouble();
        
        IMC[pessoa_idx] = pesos[pessoa_idx]/ (alturas[pessoa_idx]*alturas[pessoa_idx]);
      }
   
      for (int pessoa_idx=0; pessoa_idx<no_pessoas; pessoa_idx++) {
        System.out.println("IMC de "+nomes[pessoa_idx]+": "+ IMC[pessoa_idx]);
      }
        
    }
    
}
